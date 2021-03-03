package ru.tinkoff.fintech;

public class Sorcerer extends Human implements SpellCaster {

    public Sorcerer(String name, String character) {
        super(name, character);
    }

    @Override
    void run() {
        System.out.println(getName() + " телепортируется");

    }

    @Override
    public void attackSimple() {
        System.out.println(getName() + " дал пощечену");

    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " запустил фаербол");
    }

    @Override
    public void heal (){
        System.out.println(getName() + " восстановил часть здоровья");
    }

    @Override
    public void death() {
        System.out.println(getName() + " погиб");
    }

}
