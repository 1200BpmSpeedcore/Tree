// import java.util.Scanner;

import ea.Kon;

public class Lichtbaum {

    public static void main (String[] args)
    {
        int height = getHeight();
        printTree(height);
    }
    private static int getHeight() {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Höhe der Baumkrone");
        System.out.print(getInputSymbol());

        int num = scan.nextInt();

        scan.close();*/

        System.out.println("Höhe der Baumkrone");
        int num = ea.Kon.iEingabe();
        return num;
    }

    private static String getInputSymbol() {
        return "> ";
    }

    private static void printTree(int height) {
        if(height < 0 || height > 31) {
            System.out.println("FEHLER: die Höhe der Baumkrone kann nicht negativ oder\n\tgrößer als 31 sein.");
        } else if(height == 0) {
            System.out.println("-");
            System.out.println("|");
        } else {
            // Baumkrone ausgeben
            StringBuilder fillWhitespace = new StringBuilder();
            for(int i = 0; i < (height * 2) - 2; i++) {
                fillWhitespace.append(" ");
            }
            for(int i = 0; i < height; i++) {
                System.out.println(fillWhitespace.substring(i, height - 1) + "i/" + fillWhitespace.substring(0, i * 2) + "\\i");
            }

            // Ende der Baumkrone ausgeben
            System.out.print(" ");
            for(int i = 0; i < fillWhitespace.length() + 2; i++) {
                System.out.print("-");
            }
            System.out.println();

            // Baumstamm ausgeben
            System.out.println(height == 1 ? " ||" : fillWhitespace.substring(0, height) + "||");
        }
    }

}
