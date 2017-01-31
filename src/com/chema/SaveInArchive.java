package com.chema;

import sun.awt.image.ImageWatched;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SaveInArchive {

    public static void createFile(String file, List<String> arrData)  // se puede llamar desde fuera con static sin crear objeto
            throws IOException {
        FileWriter writer = new FileWriter(file);
        int size = arrData.size();
        for (int i=0;i<size;i++) {
            String str = arrData.get(i).toString();
            writer.write(str);
            if(i < size-1) {
                writer.write("\n");
            }
        }
        writer.close();
    }

    public static List<String>readFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("La agenda está vacía");
        }

        if (fileReader == null) {
            return null;
        }
        BufferedReader bufferedReader = new
                BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null)
            {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


}
