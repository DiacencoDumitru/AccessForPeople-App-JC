package org.example;

import java.io.IOException;
import java.util.Random;

abstract class Om {
    static String status = "om";
    private int inaltime;
    private String culoareOchii;
    private double greutate;
    private boolean sex;

    // Constructor fara parametri (default)
    public Om() {
        Random rand = new Random();
        this.inaltime = rand.nextInt(160, 200);
        this.culoareOchii = "negru";
        this.greutate = rand.nextDouble() * 100;
        this.sex = rand.nextBoolean();
    }

    // Constructor cu parametri
    public Om(int inaltime, String culoareOchii, double greutate, boolean sex) {
        this.inaltime = inaltime;
        this.culoareOchii = culoareOchii;
        this.greutate = greutate;
        this.sex = sex;
    }

    // Metode de acces și setare
    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String getCuloareOchii() {
        return culoareOchii;
    }

    public void setCuloareOchii(String culoareOchii) {
        this.culoareOchii = culoareOchii;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void afisare() {
        System.out.println("Inaltime: " + inaltime);
        System.out.println("Culoare ochii: " + culoareOchii);
        System.out.println("Greutate: " + greutate);
        System.out.println("Sex: " + (sex ? "Masculin" : "Feminin"));
    }

    // Funcție abstractă pentru salvare într-un fișier
    public abstract void saveObjectToFile(String nameFile) throws IOException;
}
