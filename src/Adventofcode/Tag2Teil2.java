package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

/***
 * --- Tag 2: Passwortphilosophie ---
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
 * Wie viele Passwörter sind gemäß der neuen Interpretation der Richtlinien gültig ?
 */
public class Tag2Teil2 {
    public static void main(String[] args) {

        String[][] orgPasswortListe = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\passwortListe.csv", " ");
        double richtigesPasswort = 0;
        for (String[] strings : orgPasswortListe) {
            String[] passwort = {strings[0], strings[1],
                    strings[2], strings[3]};
            int zahler = 0;
            for (int j = 0; j < passwort[3].length(); j++) {
                char s = passwort[3].charAt(j);
                if (passwort[2].charAt(0) == (s)) zahler++;
            }
            if (zahler >= Integer.parseInt(passwort[0]) && zahler <= Integer.parseInt(passwort[1])) {
                richtigesPasswort++;
            }
        }
        System.out.println("Es sind " + richtigesPasswort + " Passwörter korrekt.");
    }
}