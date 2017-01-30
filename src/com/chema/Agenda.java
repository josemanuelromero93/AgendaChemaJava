package com.chema;

public class Agenda {

    Contactos contactos = new Contactos();


    public void calendar() {
        boolean end = false;

        while (!end) {
            Prompt.print();
            String command = Prompt.read();
            Command com = CommandParser.parse(command);

            int errorcounter = 0;

            switch (com) {

                case QUIT:

                    end = true;
                    break;

                case HELP:

                    Help.printHelp();

                    break;

                case ADD:
                    Persona persona = Prompt.addContact();
                    contactos.getContacto().add(persona);
                    System.out.println();
                    Prompt.printList(contactos);

                    break;

                case DELETE:
                    if (contactos.getContacto().size()==0) {

                        System.out.println("La lista de contactos está vacía");


                    } else {
                        int posicion = Prompt.deleteContact();
                        if (posicion>=0 && posicion<contactos.getContacto().size()) {
                            contactos.getContacto().remove(posicion);
                            System.out.println();
                            System.out.println("Contacto eliminado");
                            System.out.println();
                            Prompt.printList(contactos);
                        }

                        else   {
                            System.out.println("No hay contactos en esa posición");
                        }

                    }


                    break;

                case LIST:

                    Prompt.printList(contactos);

                    break;

                case UNKNOWN:

                    errorcounter=Help.printUnknown(errorcounter);

                    break;

            }
        }
    }
}


