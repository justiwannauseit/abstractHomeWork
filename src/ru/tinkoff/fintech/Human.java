package ru.tinkoff.fintech;

public abstract class Human {

    private String name;
    private String character;

    public Human(String name, String character) {
        this.name = name;
        this.character = character;

    }

    public String getName() {
        return name;
    }

    abstract void run();

    protected void death() {
        System.out.println("ПОТРАЧЕНО!");
    }

}
