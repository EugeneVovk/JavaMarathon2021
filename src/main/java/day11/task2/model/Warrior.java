package day11.task2.model;

import day11.task2.model.Hero;

public class Warrior extends Hero {

    public Warrior() {
        physDef = 0.8;  //  что равно 80% защиты
        physAttack = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}