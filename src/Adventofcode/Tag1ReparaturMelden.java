package Adventofcode;

/***
 * --- Tag 1: Reparatur melden ---
 * Nachdem Sie Weihnachten fünf Jahre hintereinander gerettet haben, haben Sie beschlossen, Urlaub in einem schönen Resort auf einer tropischen Insel zu machen. Sicherlich wird Weihnachten ohne dich weitergehen.
 *
 * Die tropische Insel hat eine eigene Währung und ist ausschließlich gegen Barzahlung erhältlich. Die dort verwendeten Goldmünzen zeigen ein kleines Bild eines Seesterns; Die Einheimischen nennen sie einfach Sterne . Keiner der Geldwechsel scheint von ihnen gehört zu haben, aber irgendwie müssen Sie bis zu Ihrer Ankunft fünfzig dieser Münzen finden, damit Sie die Kaution auf Ihrem Zimmer bezahlen können.
 *
 * Um Ihren Urlaub zu retten, müssen Sie bis zum 25. Dezember alle fünfzig Sterne erhalten .
 *
 * Sammle Sterne, indem du Rätsel löst. Im Adventskalender werden an jedem Tag zwei Rätsel zur Verfügung gestellt. Das zweite Rätsel wird freigeschaltet, wenn Sie das erste abgeschlossen haben. Jedes Puzzle gewährt einen Stern . Viel Glück!
 *
 * Bevor Sie gehen, müssen die Elfen in der Buchhaltung nur Ihre Spesenabrechnung (Ihre Puzzle-Eingabe) korrigieren. anscheinend stimmt etwas nicht ganz.
 *
 * Insbesondere müssen Sie die beiden Einträge finden, die sich summieren,2020 und diese beiden Zahlen dann miteinander multiplizieren.
 *
 * Angenommen, Ihre Spesenabrechnung enthält Folgendes:
 *
 * 1721
 * 979
 * 366
 * 299
 * 675
 * 1456
 */
public class Tag1ReparaturMelden {
    public static void main(String[] args) {
        int[] spesen = {1721, 979, 366, 299, 675, 1456};
        for (int zahl1 : spesen) {
            for (int zahl2 : spesen) {
                if (zahl1+zahl2==2020) System.out.println("Die Summe beträgt " + zahl1 * zahl2 + ".");
            }break;
        }
    }
}
