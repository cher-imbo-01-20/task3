package com.company;
public class Hand{
    int health_hand_l, health_hand_r;
    Hand(int hp_l, int hp_r) {
        health_hand_l=hp_l;
        health_hand_r=hp_r;
    }

    public int getHealth_l() {
        return health_hand_l;
    }

    public int getHealth_r() {
        return health_hand_r;
    }

    public void setHealth_hand_l(int health_hand_l) {
        this.health_hand_l = health_hand_l;
    }

    public void setHealth_hand_r(int health_hand_r) {
        this.health_hand_r = health_hand_r;
    }
}
