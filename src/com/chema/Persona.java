package com.chema;

public class Persona {

    private String name;
    private String phone;

    public Persona(){

    }

    public Persona(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n\t" + getName() + ":" + "\n\t" + getPhone() + "\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




}
