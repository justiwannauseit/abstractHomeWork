package ru.tinkoff.fintech;

public class Knight extends Human implements Tank {

    public Knight(String name, String character) {
        super(name, character);
    }

    @Override
    void run() {
        System.out.println(getName() + " убегает с поля битвы");
    }


    @Override
    public void attackSimple() {
        System.out.println(getName() + " наносит удар копьем в живот");
    }

    @Override
    public void attackSuper() {
        System.out.println(getName() + " в прыжке наносит смертоносный удар копьем");
    }

    @Override
    public void defence (){
        System.out.println(getName() + " поставил блок");
    }

    @Override
    public void death() {
        System.out.println(getName() + " погиб");
    }

}
