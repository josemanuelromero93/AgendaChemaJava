package com.chema;

public class Agenda {

        Agenda agenda = new Agenda();


    public void play() {
       /* boolean end = false;
        int contadorError = 0;
        Room currentRoom = MapGenerator.initialRoom;
        while (!end) {
            Mensaje.printRoomDescription(currentRoom); */
        Prompt.print();
        String command = Prompt.read();
        Command com = CommandParser.parse(command);

        switch (com) {

            case QUIT:
                break;

            case HELP:

                break;

            case ADD:

                break;

            case DELETE:

                break;

            case LIST:

                break;

            case UNKNOWN:

                break;


        }
    }
}

}
