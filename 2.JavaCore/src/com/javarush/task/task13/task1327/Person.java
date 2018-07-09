package com.javarush.task.task13.task1327;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull (Person person) {
        System.out.printf("%s за %s%n", getName() , person.getNamePadezh());
        //or
        //System.out.println(getName() + " за " + person.getNamePadezh());
       // System.out.println(this.name + "за" + person.namePadezh);

    }



}
