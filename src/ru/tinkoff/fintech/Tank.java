package ru.tinkoff.fintech;

public interface Tank {

    //Ближний бой (танкует)
    void attackSimple();

    void attackSuper();

    default void defence() {
        System.out.println("ЗАЩИТА");
    }

}
