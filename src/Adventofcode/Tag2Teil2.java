package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

/***
 * --- Zweiter Teil ---
 * Obwohl Sie die Passwörter anscheinend korrekt validiert haben, scheinen sie nicht den Erwartungen des offiziellen Toboggan Corporate Authentication Systems zu entsprechen.
 *
 * Der Ladenbesitzer merkt plötzlich, dass er gerade versehentlich die Regeln für die Passwortrichtlinien seines alten Jobs in der Schlittenvermietung auf der Straße erklärt hat! Die offizielle Toboggan-Unternehmensrichtlinie funktioniert tatsächlich etwas anders.
 *
 * Jede Richtlinie beschreibt tatsächlich zwei Positionen im Kennwort , wobei 1das erste Zeichen, 2das zweite Zeichen usw. bedeutet. (Seien Sie vorsichtig; Toboggan Corporate Policies haben kein Konzept von "Index Null"!) Genau eine dieser Positionen muss den angegebenen Buchstaben enthalten. Andere Vorkommen des Schreibens sind für die Durchsetzung der Richtlinien irrelevant.
 *
 * Angesichts der gleichen Beispielliste von oben:
 *
 * 1-3 a: abcdeist gültig : Position 1enthält aund Position 3nicht.
 * 1-3 b: cdefgist ungültig : weder Position 1noch Position 3enthält b.
 * 2-9 c: cccccccccist ungültig : sowohl Position 2als auch Position 9enthalten c.
 */
public class Tag2Teil2 {
    public static void main(String[] args) {

        String[][] orgPasswortListe = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\passwortListe.csv", " ");
        int richtigesPasswort = 0;
        for (String[] strings : orgPasswortListe) {
            int zahl1 = Integer.parseInt(strings[0]);
            int zahl2 = Integer.parseInt(strings[1]);
            if (strings[2].charAt(0) == strings[3].charAt(zahl1 - 1)
                    && strings[2].charAt(0) != strings[3].charAt(zahl2 - 1)
                    || (strings[2].charAt(0) != strings[3].charAt(zahl1 - 1)
                    && strings[2].charAt(0) == strings[3].charAt(zahl2 - 1))) {
                richtigesPasswort++;
            }
        }
        System.out.println(richtigesPasswort);
    }
}