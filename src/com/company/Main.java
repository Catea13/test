package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;



    public class Main extends Abonat {
        public static void main(String[] args) {
            Abonat ab = new Abonat();
            ArrayList<Abonat> abonat = new ArrayList<Abonat>();

//
            abonat.add(new Abonat("Mihail", 6855188, 158, Abonament.standart));
            abonat.add(new Abonat("Vlad", 68551879, 150, Abonament.inlesnirii));
            abonat.add(new Abonat("Sandu", 7833188, 128, Abonament.econom));
            abonat.add(new Abonat("Cristi", 6855131, 100, Abonament.standart));
            Abonat abonat2 = new Abonat();

            for (Abonat abonat1 : abonat) {
                System.out.println(abonat1);
            }
            if (abonat.get(0).getMinute() > abonat.get(1).getMinute()) {
                System.out.println(abonat.get(0) + "+1" + abonat.get(1) + "-1");
            } else if (abonat.get(0).getMinute() < abonat.get(2).getMinute()) {
                System.out.println(abonat.get(0) + "-1" + abonat.get(2) + "+1");
            } else if
            (abonat.get(3) == abonat.get(4)) {
                System.out.println(0);
            }
//marimea si micsorare minutelor
            abonat.get(0).addMinute();
            System.out.println(abonat.get(0).getMinute());
            abonat.get(3).removeMinute();
            System.out.println(abonat.get(3).getMinute());


            abonat.sort(Comparator.comparing(Abonat::getMinute));
            for (Abonat abonat1 : abonat) {
              
                System.out.println(abonat1.getMinute());

            }

        }
    }