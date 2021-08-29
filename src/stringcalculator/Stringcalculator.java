/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

/**
 *
 * @author Heet
 */
public class Stringcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int add(String text) {
        if (text.equals("")) {
            return 0;
        } else {
            String delimiter = ",";
            if (text.matches("//(.*)\n(.*)")) {
                delimiter = Character.toString(text.charAt(2));
                text = text.substring(4);
            }

            String numList[] = seperateNumbers(text, delimiter + "|\n");
            return sum(numList);
        }

    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }

    private static String[] seperateNumbers(String numbers, String divider) {
        return numbers.split(divider);
    }

    private static int sum(String[] numbers) {
        int total = 0;
        String negative = "";
        for (String number : numbers) {
            if (toInt(number) < 0) {
                if (negative.equals("")) {
                    negative = number;
                } else {
                    negative += ("," + number);
                }
            }
            total += toInt(number);
        }

        if (!negative.equals("")) {
            throw new IllegalArgumentException("negatives not allowed: " + negative);
        }
        return total;
    }

}
