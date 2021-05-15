package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    //  у всех героев общими явл-ся: здоровье, величина физической атаки, величина физической и магической атаки
    // модификаторы доступа у всех полей абстрактного класса оставляем default,
    // т.к. если мы их сделаем private, то у всех классов наследников прямого доступа  к этим полям не будет
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;

    int health;
    int physAttack;
    double physDef;
    double magicDef;

    //  каждый герой в момент создания должен иметь показания здоровья 100
    //  реализуем конструктор
    public Hero() {
        health = MAX_HEALTH;
    }

    //  каждый герой может атаковать физически, берём метод из интерфейса
    @Override
    public void physicalAttack(Hero h) {
        //  расчитаем величину урона с рсчётом показателя защиты, конкретного игрока, того кто будет атакован
        //  величина атаки должна быть уменьшина на процент защиты
        double attackScore = physAttack * (1 - h.physDef);
        //  после чего здоровье должно уменьшиться на эту величену
        if (h.health - attackScore < MIN_HEALTH)
            h.health = MIN_HEALTH;
        else
            h.health -= attackScore;

    }
}