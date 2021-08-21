package com.company;

public class Warrior extends Hero {
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getSimpleName() + " применил суперспособность CRITICAL DAMAGE " + superAbilityType);

    }

}
