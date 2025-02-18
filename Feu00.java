/*
 * Epreuve feu - Echauffement
 * 
 * Créez un programme qui affiche un rectangle dans le terminal.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 5 3
 * o---o
 * |   |
 * o---o
 * 
 * $> python exo.py 5 1
 * o---o
 * 
 * $> python exo.py 1 1
 * o
 * 
 * Gérer les problèmes potentiels d’arguments.
 */

public class Feu00 {

    private static boolean testArguments(String[] args) {
        if (args.length != 2) {
            return false;
        } else if (!args[0].matches("[0-9]+") || !args[1].matches("[0-9]+")) {
            return false;
        } else if (Integer.parseInt(args[0]) == 0 || Integer.parseInt(args[1]) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void rectangle(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == b-1) {
                    System.out.print((j == 0 || j == a-1)? "o" : "-");
                } else {
                    System.out.print((j == 0 || j == a-1)? "|" : " ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        if (!testArguments(args)) {
            System.out.println("error");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            rectangle(a, b);
        }
    }
}