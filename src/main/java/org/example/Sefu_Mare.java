package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Sefu_Mare extends Admin {
    private int nrSubalterni;
    private List<Double> iqSubalterni;

    // Constructor fara parametri
    public Sefu_Mare() {
        super();
        this.drepturiAcces = 3;
        this.nrSubalterni = 5;
        this.iqSubalterni = new ArrayList<>();
        for (int i = 0; i < nrSubalterni; i++) {
            iqSubalterni.add(Math.random() * 200);
        }
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("\n");
        System.out.println("Număr de subalterni: " + nrSubalterni);
        System.out.println("IQ subalterni: " + iqSubalterni);
    }

    @Override
    public void saveObjectToFile(String nameFile) throws IOException {
        try (FileWriter writer = new FileWriter(nameFile)) {
            writer.write("Șefu Mare details:\n");
            writer.write("Inaltime: " + getInaltime() + "\n");
            writer.write("Număr de subalterni: " + nrSubalterni + "\n");
            writer.write("IQ subalterni: " + iqSubalterni + "\n");
        }
    }

    public void concediereAdmin(Admin admin) {
        if (admin.getCoefLene() / admin.getIq() > 100) {
            System.out.println("Adminul a fost concediat.");
        } else {
            System.out.println("Adminul păstrează locul de muncă.");
        }
    }
}
