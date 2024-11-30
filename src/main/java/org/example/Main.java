package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Om[] persoane = new Om[3];
        persoane[0] = new User();
        persoane[1] = new Admin();
        persoane[2] = new Sefu_Mare();

        for (Om persoana : persoane) {
            persoana.afisare();
            persoana.saveObjectToFile("detalii.txt");
            System.out.println("\n");
        }

        Admin admin = new Admin();
        Sefu_Mare sefu = new Sefu_Mare();
        sefu.concediereAdmin(admin);

        admin.ajustareSalariu();
        admin.limitareDrepturi();
    }
}
