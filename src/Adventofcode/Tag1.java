package Adventofcode;

import SimpleCSVReader.SimpleCSVReader;

import java.util.Arrays;

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
 * In dieser Liste an die beiden Einträge dieser Summe 2020sind 1721und 299. Wenn Sie sie miteinander multiplizieren 1721 * 299 = 514579, erhalten Sie die richtige Antwort 514579.
 *
 * Natürlich ist Ihre Spesenabrechnung viel größer. Suchen Sie die beiden Einträge, die sich summieren 2020. Was bekommen Sie, wenn Sie sie miteinander multiplizieren?
 *
 * --- Zweiter Teil ---
 * Die Elfen in der Buchhaltung sind dankbar für Ihre Hilfe; Einer von ihnen bietet Ihnen sogar eine Seesternmünze an, die sie aus einem vergangenen Urlaub übrig hatten. Sie bieten Ihnen eine zweite an, wenn Sie in Ihrer Spesenabrechnung drei Zahlen finden , die dieselben Kriterien erfüllen.
 *
 * Im obigen Beispiel wieder die drei Einträge , dass Summe 2020ist 979, 366und 675. Wenn Sie sie miteinander multiplizieren, erhalten Sie die Antwort 241861950.
 *
 * Was ist in Ihrer Spesenabrechnung das Produkt der drei Einträge, die sich summieren 2020?
 */
public class Tag1 {
    public static void main(String[] args) {

        int[] spesen = {1935, 1956, 1991, 1425, 1671, 1537, 1984, 1569, 1873, 1840, 1720, 1937, 1823, 1625, 1727, 1812,
                1714, 1900, 1939, 1931, 1951, 1756, 1942, 1611, 1979, 1930, 1996, 2000, 1544, 1780, 1687, 1760, 1836,
                1814, 1691, 1817, 1964, 1899, 1577, 1547, 866, 1560, 1988, 1601, 1970, 1738, 1507, 1667, 1851, 1933,
                1515, 1856, 1969, 1860, 1801, 2007, 1866, 1800, 1749, 1843, 1711, 1495, 1905, 763, 1672, 1858, 1987,
                1492, 1849, 1993, 1737, 1874, 1658, 1810, 1665, 1768, 1950, 1879, 1816, 1868, 1995, 1763, 1783, 1833,
                1968, 1847, 1748, 1725, 1891, 1755, 286, 1976, 1977, 1655, 1808, 1986, 1779, 1861, 1953, 1888, 1792,
                1811, 1872, 1790, 1839, 1985, 1827, 1842, 1925, 1735, 1635, 1821, 1820, 1973, 1531, 1770, 59, 1846,
                1932, 1907, 1730, 933, 1395, 1753, 1751, 361, 1530, 1782, 1087, 1589, 1929, 1795, 1815, 1732, 1765,
                1877, 1722, 526, 1709, 1789, 1892, 1913, 1662, 1809, 1670, 1947, 1835, 1587, 1758, 1982, 2009, 1757,
                670, 1983, 1524, 1878, 1796, 1952, 566, 1922, 1882, 1870, 1799, 1731, 1724, 1805, 2003, 1596, 1566,
                1853, 1911, 1857, 1739, 1744, 1627, 1729, 1745, 1845, 1582, 1884, 1883, 1941, 1764, 1685, 1791, 1837,
                1697, 1742, 1781, 1948, 1876, 1989, 1643, 1871, 1906, 1726, 1958, 1502, 1927, 1946,};
        for (int i = 0; i < spesen.length; i++) {
            int zahl1 = spesen[i];
            for (int zahl2 : spesen) {
                if (zahl1 + zahl2 == 2020) {
                    System.out.println("Die Summe beträgt " + zahl1 * zahl2 + ".");
                    i = spesen.length;
                }
            }
        }
    }
}
