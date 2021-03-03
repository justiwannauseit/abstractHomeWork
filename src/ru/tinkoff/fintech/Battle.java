package ru.tinkoff.fintech;

public class Battle {

    public static void start() {
        Knight unit1 = new Knight("Иван", "Танк");
        Sorcerer unit2 = new Sorcerer("Кирилл", "Маг");
        System.out.println("Битва началась:");
        unit1.attackSimple();
        unit2.attackSimple();
        unit1.attackSuper();
        unit2.castSpell();
        unit1.defence();
        unit2.heal();
        unit1.run();
        unit2.run();
        unit2.death();
        System.out.println("Happy end!");
    }
}
