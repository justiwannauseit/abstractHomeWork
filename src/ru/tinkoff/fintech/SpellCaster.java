package ru.tinkoff.fintech;

public interface SpellCaster {

    void attackSimple();

    void castSpell();

    default void heal() {
        System.out.println("РЕГЕНЕРАЦИЯ");
    }

}
