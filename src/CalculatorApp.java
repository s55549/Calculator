import java.io.IOException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) throws IOException { //psvm +TAB
        //Datentyp Namen;
        int number1 = 0; //auf 0 initialisiern -> sicherstellen das nichts mehr in der Variable gespeichert ist
        int number2 = 0;
        int result = 0;
        char operator= 0;

        //Eingage
        Scanner scanner = new Scanner(System.in); //Initalisation von Scanner -> Tastaturinput
        System.out.println("Bitte erste Zahl eingeben");
        number1 = scanner.nextInt(); //Zahl vom Typ int einlesen in Var number
        System.out.println("Bitte zweite Zahl eingeben");
        number2 = scanner.nextInt(); // -||- in number2
        System.out.println("Bitte Operator eingeben");
        operator = (char) System.in.read();
        //Berechnung
        System.out.print("Ergebnis ist ");


        if (operator == '-') {
            result = number1 - number2;
        }

        if (operator == '+') {
            result = number1 + number2;
        }

        if (operator == '*') {
            result = number1 * number2;
        }

        if (operator == '/') {
            result = number1 / number2;

            int rest = 0;
                    rest = number1 % number2;
                            System.out.println("Rest:"+rest);

        }


        //Ausgabe
        System.out.println(result); //sout + TAB

    }
}
