package com.company;

import java.util.ArrayList;

public class Human{
 Head head = new Head(50);
 Leg legs2 = new Leg(60,80);
 Hand hands2 = new Hand(70,100);
 void check() {
  System.out.println("Human test running..."+"\n");
  if ((head.getHealth()+ legs2.getHealth_l()+ legs2.getHealth_r()+ hands2.getHealth_l()+ hands2.getHealth_r())/5>=90)
   System.out.println("Человек здоров");
  else System.out.println("Человек болен");
  System.out.println("\n"+"Human test end");
 }
}
