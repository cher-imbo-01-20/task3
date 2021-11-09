package com.company;

public class Leg{
    int health_leg_l, health_leg_r;
    Leg(int hp_l, int hp_r) {
        health_leg_l=hp_l;
        health_leg_r=hp_r;
    }

    public int getHealth_l() {
        return health_leg_l;
    }

    public int getHealth_r() {
        return health_leg_r;
    }

    public void setHealth_leg_l(int health_leg_l) {
        this.health_leg_l = health_leg_l;
    }

    public void setHealth_leg_r(int health_leg_r) {
        this.health_leg_r = health_leg_r;
    }
}
