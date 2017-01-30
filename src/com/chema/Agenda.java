package com.chema;

public class Agenda {


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

                    break;

                case DELETE:

                    break;

                case LIST:

                    break;

                case UNKNOWN:

                    errorcounter=Help.printUnknown(errorcounter);

                    break;

            }
        }
    }
}


