package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

import java.util.Arrays;

/***
 * --- Tag 4: Passbearbeitung ---
 * Sie kommen am Flughafen an, nur um festzustellen, dass Sie anstelle Ihres Reisepasses Ihre
 * Nordpol-Anmeldeinformationen erhalten haben.
 * Obwohl diese Dokumente sehr ähnlich sind, werden die Nordpol-Anmeldeinformationen nicht von einem
 * Land ausgestellt und sind daher in den meisten
 * Teilen der Welt keine gültigen Unterlagen für Reisen.
 *
 * Es scheint jedoch, dass Sie nicht der einzige sind, der Probleme hat.
 * Für die automatischen Passscanner hat sich eine sehr lange Warteschlange gebildet,
 * und die Verzögerung könnte Ihre Reiseroute stören.
 *
 * Aufgrund einer fragwürdigen Netzwerksicherheit stellen Sie fest, dass Sie möglicherweise beide
 * Probleme gleichzeitig lösen können.
 *
 * Die automatischen Passscanner sind langsam, da sie nicht erkennen können, welche Pässe alle erforderlichen
 * Felder enthalten .
 * Die erwarteten Felder lauten wie folgt:
 *
 * byr (Geburtsjahr)
 * iyr (Ausgabejahr)
 * eyr (Ablaufjahr)
 * hgt (Höhe)
 * hcl (Haarfarbe)
 * ecl (Augenfarbe)
 * pid (Passport-ID)
 * cid (Länder-ID)
 * Passdaten werden in Batch-Dateien validiert (Ihre Puzzle-Eingabe).
 * Jeder Pass wird als Folge von key:valuePaaren dargestellt, die durch Leerzeichen oder Zeilenumbrüche getrennt sind.
 * Pässe sind durch Leerzeilen getrennt.
 * Hier ist eine Beispiel-Batchdatei mit vier Pässen:
 *
 * ecl:gry
 * pid:860033327
 * eyr:2020
 * hcl:#fffffd
 * byr:1937
 * iyr:2017
 * cid:147
 * hgt:183cm
 *
 * iyr:2013
 * ecl:amb
 * cid:350
 * eyr:2023
 * pid:028048884
 * hcl:#cfa07d
 * byr:1929
 *
 * hcl:#ae17e1
 * iyr:2013
 * eyr:2024
 * ecl:brn
 * pid:760753108
 * byr:1931
 * hgt:179cm
 *
 * hcl:#cfa07d
 * eyr:2025
 * pid:166559648
 * iyr:2011
 * ecl:brn
 * hgt:59in
 *
 * Der erste Reisepass ist gültig - alle acht Felder sind vorhanden.
 * Der zweite Pass ist ungültig - er fehlt hgt(das Feld Höhe).
 *
 * Der dritte Pass ist interessant; Das einzige fehlende Feld ist cid,
 * also sieht es aus wie Daten von Nordpol-Anmeldeinformationen,
 * überhaupt kein Pass! Sicherlich würde es niemandem etwas ausmachen, wenn Sie das System dazu bringen würden,
 * fehlende cid Felder vorübergehend zu ignorieren . Behandle diesen "Pass" als gültig .
 *
 * Dem vierten Pass fehlen zwei Felder, cid und byr. Das cid Fehlen ist in Ordnung,
 * das Fehlen eines anderen Feldes jedoch nicht. Daher ist dieser Reisepass ungültig .
 *
 * Gemäß den oben genannten Regeln würde Ihr verbessertes System 2 gültige Pässe melden .
 *
 * Zählen Sie die Anzahl der gültigen Pässe, die alle erforderlichen Felder enthalten.
 * Behandeln cid als optional. Wie viele Pässe sind in Ihrer Batch-Datei gültig?
 */
public class Tag4 {
    public static void main(String[] args) {
        String[][] reisepass = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\Tag4.csv", " ");
        int zahler1 = 0;
        int passwort = 0;
        String aString = Arrays.deepToString(reisepass);
        aString = aString.replaceAll("\\[", "");
        aString = aString.replaceAll("]", "");
        System.out.println(aString);
        String[] arr = aString.split(",");
        for (String s : arr) {
            if (s.equals(" ")) {
                if (zahler1 >= 7) {
                    passwort++;
                    zahler1 = 0;
                } else {
                    zahler1 = 0;
                }
            } else if
            (s.contains("byr") || s.contains("iyr") || s.contains("eyr") || s.contains("hgt") ||
                            s.contains("hcl") || s.contains("ecl") ||
                            s.contains("pid")) {
                zahler1++;
            }
        }
        System.out.println(passwort);
    }

}
