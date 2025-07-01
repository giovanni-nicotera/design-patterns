package com.giovanninicotera.patterns.gof.creazionali.prototype;

import java.util.ArrayList;
import java.util.List;

public class GamesMain {
    public static void main(String[] args) {
        List<UnitaGames> unitaGamesList = new ArrayList<>();
        List<UnitaGames> unitaGamesCopyList = new ArrayList<>();

        Guerriero g1 = new Guerriero();
        g1.puntiVita = 100; g1.puntiMagia = 70;
        g1.arma1mano = "Spada Lucente"; g1.scudo = "Scudo celtico";
        unitaGamesList.add(g1);

        Guerriero g1copy = (Guerriero) g1.clone();
        unitaGamesList.add(g1copy);

        Mago m1 = new Mago();
        m1.puntiVita = 65; m1.puntiMagia = 150;
        m1.magia1 = "Palla di fuoco"; m1.magia2 = "Cascata suprema"; m1.magia3 = "Teletrasporto";
        unitaGamesList.add(m1);

        Orco o1 = new Orco();
        o1.puntiVita = 150; o1.puntiMagia = 30;
        o1.arma2Mani = "Ascia dentata"; o1.magiaInfernale = 50;
        unitaGamesList.add(o1);

        Orco o1copy = (Orco) o1.clone();
        unitaGamesList.add(o1copy);

        cloneAndCompare(unitaGamesList, unitaGamesCopyList);
    }

    private static void cloneAndCompare(List<UnitaGames> unitaGamesList, List<UnitaGames> unitaGamesCopyList) {
        unitaGamesList.forEach(unita -> unitaGamesCopyList.add(unita.clone()));

        for (int i=0; i<unitaGamesList.size(); i++) {
            UnitaGames unita = unitaGamesList.get(i);
            UnitaGames unita2 = unitaGamesCopyList.get(i);
            if (unita != unita2) {
                System.out.println(i + ": Sono oggetti differenti");
                if (unita.equals(unita2)) {
                    System.out.println(i + ": Ma sono identici!");
                } else {
                    System.out.println(i + ": Ma non sono identici!");
                }
            } else {
                System.out.println(i + ": Sono oggetti uguali!");
            }
        }
    }
}
