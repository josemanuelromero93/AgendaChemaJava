package com.chema;

import java.util.LinkedList;

public class Contactos {

    private LinkedList<Persona> contacto = new LinkedList<>();

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
}
