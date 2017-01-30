package com.chema;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Help {

    public static void printHelp() {


        System.out.println("Los comandos válidos son");
        System.out.println("(Q)uit:\t\t Para salir de la agenda");
        System.out.println("(H)elp:\t\t Para mostrar la ayuda");
        System.out.println("(L)ist:\t\t Para mostrar la lista de contactos");
        System.out.println("(A)dd:\t\t Para crear un contacto nuevo");
        System.out.println("(D)elete:\t\t Para eliminar un contacto");

    }

    public static int printUnknown (int errorcounter) {
        String[] mensajes = {
                "Comando desconocido. Utilice (H)elp para ver los comandos disponibles",
                "Inténtalo de nuevo. Utilice (H)elp para ver los comandos disponibles"

        };

        Random random = new Random();

        int index=random.nextInt(mensajes.length);
        System.out.println(mensajes[index]);

        return errorcounter;

    }




}
