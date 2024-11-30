package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class Admin extends User {
    private double coefLene;
    private double iq;
    private double salariu;

    // Constructor fara parametri
    public Admin() {
        super();
        this.drepturiAcces = 2;
        this.coefLene = Math.random();
        this.iq = Math.random() * 200;
        this.salariu = 5000;
    }

    // Constructor cu parametri
    public Admin(int inaltime, String culoareOchii, double greutate, boolean sex, List<String> drepturi, double coefLene, double iq, double salariu) {
        super(inaltime, culoareOchii, greutate, sex, drepturi);
        this.drepturiAcces = 2;
        this.coefLene = coefLene;
        this.iq = iq;
        this.salariu = salariu;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Coeficient de lene: " + coefLene);
        System.out.println("IQ: " + iq);
        System.out.println("Salariu: " + salariu);
    }

    @Override
    public void saveObjectToFile(String nameFile) throws IOException {
        try (FileWriter writer = new FileWriter(nameFile)) {
            writer.write("Admin details:\n");
            writer.write("Inaltime: " + getInaltime() + "\n");
            writer.write("IQ: " + iq + "\n");
            writer.write("Salariu: " + salariu + "\n");
        }
    }

    public void ajustareSalariu() {
        if (coefLene / iq < 1) {
            salariu += 1000;
        } else {
            salariu -= 1000;
        }
        System.out.println("Salariul a fost ajustat la: " + salariu);
    }

    public double getCoefLene() {
        return coefLene;
    }

    public void setCoefLene(double coefLene) {
        this.coefLene = coefLene;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
}
