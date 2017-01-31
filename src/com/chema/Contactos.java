package com.chema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Contactos {



    private LinkedList<Persona> contacto = new LinkedList<>();

    public LinkedList<Persona> getContacto() {
        return contacto;
    }

    public void setContacto(LinkedList<Persona> contacto) {
        this.contacto = contacto;
    }

    public Contactos(){

    }
    public void print(){
        for (Persona persona: contacto) {
            System.out.println(persona.getName() + ": " + persona.getPhone());


        }
    }
    public void add(Persona Persona) {
        this.contacto.add(Persona);
    }
    public LinkedList<Persona> getPersonas() {
        return contacto;
    }

    public boolean isEmpty(){
        return contacto.size() == 0;
    }

    public void saveInArchive() throws IOException {
        List<String> nombres= new LinkedList<>();
        for (int i = 0; i < contacto.size(); i++) {

            Persona persona = contacto.get(i);
            nombres.add(persona.getName());

        }

        List<String> telefonos= new LinkedList<>();
        for (int i = 0; i < contacto.size(); i++) {

            Persona persona = contacto.get(i);
            telefonos.add(persona.getPhone());

        }

        SaveInArchive.createFile("nombres.txt", nombres);
        SaveInArchive.createFile("telefonos.txt", telefonos);

    }

    public void readToArchive() {
        if (SaveInArchive.readFile("nombres.txt") != null) {
            List<String> nombres = SaveInArchive.readFile("nombres.txt");
            List<String> telefonos = SaveInArchive.readFile("telefonos.txt");

                for (int i = 0; i < nombres.size(); i++) {

                    Persona persona = new Persona();
                    persona.setName(nombres.get(i));
                    persona.setPhone(telefonos.get(i));
                    contacto.add(persona);
                }


        }

    }
}
