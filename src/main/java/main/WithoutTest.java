package main;

public class WithoutTest {

    /**
     * Elvégzi a kívánt műveletet a number1 és number2 bemeneti paraméterekkel.
     * Az eredményt Stringként adja vissza.
     * A kívánt művelet az operation nevű bemeneti paraméter.
     * Az operation értéke és az elvégzett művelet:
     *      '+' esetén: összeadja a két számot
     *      '-' esetén: kivonja az első számból a másodikat
     *      '*' esetén: összeszorozza a két számot
     *      '/' esetén: elosztja az első számot a másodikkal
     *      egyéb karakter esetén üres Stringgel tér vissza
     */
    public static String calculate(int number1, int number2, char operation) {
        String result;

        switch (operation) {
            case '+':
                result = "" + (number1 + number2);
                break;
            case '-':
                result = "" + (number1 - number2);
                break;
            case '*':
                result = "" + (number1 * number2);
                break;
            case '/':
                result = "" + (number1 / number2);
                break;
            default:
                result = "";
        }

        return result;
    }

    /**
     * Megállapítja egy számról, hogy az prímszám-e vagy sem.
     *
     * Prímszámok például:
     *      2, 3, 7, 11, 31, 2147483647
     * Nem prímszámok például:
     *      0, 1, -2, 9, 25
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ( number % i == 0) {
                return false;
            }
        }

        return number >= 2;
    }

    /**
     * A bemeneti paraméter alapján visszaad egy nemet.
     *      0 esetén: "nő"
     *      1 esetén: "férfi"
     *      minden más esetben: "valami más"
     */
    public static String checkGender(int gender) {
        if (gender == 0) {
            return "nő";
        } else if (gender == 1) {
            return "férfi";
        } else {
            return "valami más";
        }
    }

    /**
     * A light nevű bemeneti paraméter értékének megfelelően visszatér egy Stringgel:
     *      "zöld" esetén: "SZABAD"
     *      "sárga" esetén: "LASSÍTS"
     *      "piros" esetén: "MEGÁLLJ"
     *      minden más esetben: "NEM TUDOM"
     */
    public static String trafficLight(String light) {
        switch (light) {
            case "zöld":
                return "SZABAD";
            case "sárga":
                return "LASSÍTS";
            case "piros":
                return "MEGÁLLJ";
            default:
                return "NEM TUDOM";
        }
    }

    /**
     * Megállapítja a year bemeneti paraméterről, hogy az szökőév-e vagy sem.
     *
     * Szökőévek például:
     *      1584, 1600, 1996, 2024
     * Nem szökőévek például:
     *      1200, 1580, 1800, 2021
     */
    public static boolean isLeapYear(int year) {
        return year >= 1582
                && (year % 4 == 0 && year % 100 != 0
                    || year % 400 == 0);
    }

}
