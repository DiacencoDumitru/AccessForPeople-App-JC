package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class User extends Om {
    protected int drepturiAcces;
    protected List<String> drepturi;

    // Constructor fara parametri
    public User() {
        super();
        this.drepturiAcces = 1;
        this.drepturi = new ArrayList<>();
        drepturi.add("Read");
    }

    // Constructor cu parametri
    public User(int inaltime, String culoareOchii, double greutate, boolean sex, List<String> drepturi) {
        super(inaltime, culoareOchii, greutate, sex);
        this.drepturiAcces = 1;
        this.drepturi = drepturi;
    }

    // Redefinirea metodei de afisare
    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Drepturi de acces: " + drepturiAcces);
        System.out.println("Lista drepturi: " + drepturi);
    }

    @Override
    public void saveObjectToFile(String nameFile) throws IOException {
        try (FileWriter writer = new FileWriter(nameFile)) {
            writer.write("User details:\n");
            writer.write("Inaltime: " + getInaltime() + "\n");
            writer.write("Culoare ochii: " + getCuloareOchii() + "\n");
            writer.write("Greutate: " + getGreutate() + "\n");
            writer.write("Drepturi de acces: " + drepturiAcces + "\n");
        }
    }

    public void limitareDrepturi() {
        this.drepturi.clear();
        System.out.println("Drepturile userului au fost limitate.");
    }
}
