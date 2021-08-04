package controllers;

import models.Unit;

public class Manager {
    public static void Battle(Unit attacker, Unit defender) {
        int _damage = 0; //The amount of damage to be applied to defender hp
        int _resultHP = 0; //The amount of health the defender will have left, unless below 0, then 0.

        _damage = attacker.get_atk() - defender.get_def(); //Unit1 attack - Unit2 defence
        if (_damage < 0) _damage = 0; //If the defence is stronger than attack, prevent heal
        _resultHP = defender.get_hp() - _damage; //Find leftover HP defender will have

        if (_resultHP <= 0) { //Check if dead

            //TODO Killing a unit
            defender.set_hp(0); //Set health to no less than 0
            System.out.println("AHHH I'm dead! _resultHP=" + _resultHP + ", _damage=" + _damage); //Debug message

        } else { //Not dead! Deal damage.

            defender.set_hp(_resultHP); //Set new health
            System.out.println("Ouch I took damage! _resultHP=" + _resultHP + ", _damage=" + _damage); //Debug message
        }
    }
}
