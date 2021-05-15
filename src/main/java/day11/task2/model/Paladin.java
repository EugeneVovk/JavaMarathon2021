package day11.task2.model;

import day11.task2.interfaces.Healer;
import day11.task2.model.Hero;

import java.util.logging.Handler;

public class Paladin extends Hero implements Healer {
    //  от воина его отличает то, что он может лечить

    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 20;

    public Paladin() {
        physDef = 0.5;  //  что равно 80% защиты
        magicDef = 0.2;
        physAttack = 15;
    }

    //  реализация метода лечения
    @Override
    public void healHimself() {
        //  он себя может лечить на 25; больше 100 (можем вынести как константу) здоровья быть не может
        //  необходимо стараться чтобы в реализации классов не встречались магические числа,
        //  т.е. числа непонятно откуда взявшиеся (например 25 или 100), а чтобы понятно было - переносим их в константу
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else
            health += HEAL_AMOUNT;
    }

    //  лечение союзника
    @Override
    public void healTeammate(Hero h) {
        if (h.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH)
            h.health = MAX_HEALTH;
        else
            h.health += HEAL_TEAMMATE_AMOUNT;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}