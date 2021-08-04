package controllers;

import models.Unit;

public class Main {

    public static void main(String[] args) {
        DemoBattleTwoBasicUnits();
    }

    public static void DemoBattleTwoBasicUnits() {
        System.out.println("DEMO BATTLE:\n" +
                "UNIT 1: HP=10 ATK=6 DEF=3\n" +
                "UNIT 2: HP=10 ATK=8 DEF=2\n");
        Unit u1 = new Unit(10,6,3);
        Unit u2 = new Unit(10,8,2);
        System.out.println("Time for a battle!\n" +
                "Unit 1 will attack, then Unit 2, then Unit 1 twice.");

        Manager.Battle(u1, u2);
        Manager.Battle(u2, u1);
        Manager.Battle(u1, u2);
        Manager.Battle(u1, u2);
    }

}
