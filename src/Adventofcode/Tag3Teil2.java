package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

public class Tag3Teil2 {

    /***
     * --- Tag 3: Rodelbahn ---
     --- Zweiter Teil ---
     Zeit, den Rest der Pisten zu überprüfen - schließlich müssen Sie die Wahrscheinlichkeit eines plötzlichen Baumstopps minimieren.

     Bestimmen Sie die Anzahl der Bäume, auf die Sie stoßen würden, wenn Sie für jede der folgenden Hänge in der oberen linken Ecke beginnen und die Karte ganz nach unten durchqueren:

     Rechts 1, unten 1.
     Rechts 3, unten 1. (Dies ist die Steigung, die Sie bereits überprüft haben.)
     Rechts 5, unten 1.
     Rechts 7, unten 1.
     Rechts 1, unten 2.
     Im obigen Beispiel würden finden diese Pisten 2, 7, 3, 4, und 2Baum (n) verbunden ist; multipliziert ergeben diese die Antwort 336.

     Was erhalten Sie, wenn Sie die Anzahl der Bäume an den aufgelisteten Hängen multiplizieren?
     */
    public static void main(String[] args) {

        String[][] rodelbahn = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\Rodelbahn.csv", "");
        double z1=68;
        double z2=268;
        double z3=73;
        double z4=75;
        double z5=31;
        double summe=z1*z2*z3*z4*z5;
        System.out.println(summe);
        String pos = "X";
        String posFrei = "O";
        int zahler = 0;
        int xSprung = 7;
        int ySprung = 1;
        int j = 0;
        for (int i = 0; i < rodelbahn.length; i = i + ySprung) {
            if (rodelbahn[i][j].contains("#")) {
                rodelbahn[i][j] = pos;
                zahler++;
            } else {
                rodelbahn[i][j] = posFrei;
            }
            j = j + xSprung;
            if (j > 30) {
                j = j - 31;
            }
        }
        for (String[] zeile : rodelbahn) {
            for (String aString : zeile) {
                System.out.print(aString);
            }
            System.out.println();

        }
        System.out.println(zahler);
    }
}
