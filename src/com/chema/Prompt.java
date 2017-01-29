package com.chema;

import java.util.Scanner;

public class Prompt {

    public static void print() {
        System.out.print("> ");
    }
    public static String read() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    

}
