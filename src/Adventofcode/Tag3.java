package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

public class Tag3 {

    /***
     * --- Tag 3: Rodelbahn ---
     * Nachdem die Probleme mit der Rodelanmeldung behoben sind, machen Sie sich auf den Weg zum Flughafen.
     * Das Reisen mit der Rodelbahn ist zwar einfach, aber sicherlich nicht sicher: Die Lenkung ist sehr gering und das Gebiet ist mit Bäumen bedeckt.
     * Sie müssen sehen, aus welchen Winkeln Sie sich den wenigsten Bäumen nähern.
     *
     * Aufgrund der lokalen Geologie wachsen Bäume in diesem Gebiet nur auf exakten ganzzahligen Koordinaten in einem Raster.
     * Sie erstellen eine Karte (Ihre Puzzle-Eingabe) der offenen Quadrate ( .) und Bäume ( #), die Sie sehen können.
     * Zum Beispiel:
     *
     * ..##.......
     * #...#...#..
     * .#....#..#.
     * ..#.#...#.#
     * .#...##..#.
     * ..#.##.....
     * .#.#.#....#
     * .#........#
     * #.##...#...
     * #...##....#
     * .#..#...#.#
     * Dies sind jedoch nicht die einzigen Bäume; Aufgrund von etwas, über das Sie einmal gelesen haben und das Baumgenetik und Biomstabilität betrifft,
     * wiederholt sich das gleiche Muster viele Male rechts:
     *
     * ..##.........##.........##.........##.........##.........##.......  --->
     * #...#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..
     * .#....#..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.
     * ..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#
     * .#...##..#..#...##..#..#...##..#..#...##..#..#...##..#..#...##..#.
     * ..#.##.......#.##.......#.##.......#.##.......#.##.......#.##.....  --->
     * .#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#
     * .#........#.#........#.#........#.#........#.#........#.#........#
     * #.##...#...#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...
     * #...##....##...##....##...##....##...##....##...##....##...##....#
     * .#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#  --->
     * Sie beginnen auf dem offenen Quadrat ( .) in der oberen linken Ecke und müssen den unteren Rand erreichen (unterhalb der untersten Zeile auf Ihrer Karte).
     *
     * Die Rodelbahn kann nur wenigen bestimmten Steigungen folgen (Sie haben sich für ein billigeres Modell entschieden, das rationale Zahlen bevorzugt).
     * Beginnen Sie, indem Sie alle Bäume zählen, denen Sie für den Hang rechts 3 begegnen würden , unten 1 :
     *
     * Überprüfen Sie von Ihrer Startposition oben links die Position rechts 3 und unten 1. Überprüfen Sie dann die Position rechts 3 und unten 1 von dort usw.,
     * bis Sie den unteren Rand der Karte überschritten haben.
     *
     * Die Orte, die Sie im obigen Beispiel überprüfen würden, sind hier mit der Stelle gekennzeichnet, Oan der sich ein offenes Quadrat und Xein Baum befanden:
     *
     * ..##.........##.........##.........##.........##.........##.......  --->
     * #..O#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..
     * .#....X..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.
     * ..#.#...#O#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#
     * .#...##..#..X...##..#..#...##..#..#...##..#..#...##..#..#...##..#.
     * ..#.##.......#.X#.......#.##.......#.##.......#.##.......#.##.....  --->
     * .#.#.#....#.#.#.#.O..#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#
     * .#........#.#........X.#........#.#........#.#........#.#........#
     * #.##...#...#.##...#...#.X#...#...#.##...#...#.##...#...#.##...#...
     * #...##....##...##....##...#X....##...##....##...##....##...##....#
     * .#..#...#.#.#..#...#.#.#..#...X.#.#..#...#.#.#..#...#.#.#..#...#.#  --->
     * In diesem Beispiel würden Sie beim Durchqueren der Karte mit dieser Steigung auf 7Bäume stoßen .
     */
    public static void main(String[] args) {

        String[][] rodelbahn = SimpleCSVReader.readCSV("C:\\Users\\DCV\\IdeaProjects\\Rodelbahn.csv", "");
        String pos = "X";
        String posFrei = "O";
        int zahler = 0;
        int j = 0;
        for (int i = 0; i < rodelbahn.length; i++) {
            if (rodelbahn[i][j].contains("#")) {
                rodelbahn[i][j] = pos;
                zahler++;
            } else {
                rodelbahn[i][j] = posFrei;
            }
            j = j + 3;
            if (j > 30) {
                j = j - 31;
            }
        }
        extracted(rodelbahn);
        System.out.println(zahler);
    }

    private static void extracted(String[][] rodelbahn) {
        for (String[] zeile : rodelbahn) {
            for (String aString : zeile) {
                System.out.print(aString);
            }
            System.out.println();
        }
    }
}
