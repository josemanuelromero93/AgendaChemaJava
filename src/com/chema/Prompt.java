package com.chema;

import java.util.List;
import java.util.Scanner;

public class Prompt {

    public static void print(int cantidadcontactos) {
        System.out.print("("+cantidadcontactos+")> ");
    }
    public static String read() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Persona addContact() {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        persona.setName(scanner.nextLine());
        System.out.print("Phone: ");
        persona.setPhone(scanner.nextLine());
        return persona;

    }

    public static int deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Posición del contacto a eliminar: ");

        int position = Integer.parseInt(scanner.nextLine());

        return position;

    }

    public static void printList(Contactos persona){
        System.out.println("Your list of contacts");

        if (persona.getContacto().size()==0){
            System.out.println("Nothing to see here");
        }else {
            List<Persona> personas = persona.getContacto();
            for (int i = 0; i < persona.getContacto().size(); i++) {
                Persona p = personas.get(i);
                System.out.print("(" + i + ") " + p.getName() + " - " );
                System.out.println(p.getPhone());
            }

        }

    }

}
