import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        int height = getHeight();
        printTree(height);
    }
    private static int getHeight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoehe des Baumes");
        System.out.print(getInputSymbol());

        int num = scan.nextInt();
        scan.close();
        return num;
    }

    private static String getInputSymbol() {
        return "> ";
    }

    private static void printTree(int height) {
        StringBuilder fillWhitespace = new StringBuilder();
        while(fillWhitespace.length() < (height * 2) - 4) {
            fillWhitespace.append(" ");
        }

        StringBuilder fillUnderscore = new StringBuilder();
        while(fillUnderscore.length() < (height - 1) * 2) {
            fillUnderscore.append("_");
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.println(fillWhitespace.substring(i, height - 1) + "i/" + fillWhitespace.substring(0, i * 2) + "\\i");
        }
        System.out.println(" /" + fillUnderscore + "\\");
        System.out.println(fillWhitespace.substring(0, fillUnderscore.length() / 2) + "||");
    }

}
