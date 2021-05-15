package day11.task2.interfaces;

import day11.task2.model.Hero;

public interface Healer {

    void healHimself();

    void healTeammate(Hero h);
}