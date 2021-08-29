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
            String numList[] = seperateNumbers(text, ",");
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
        for (String number : numbers) {
            total += toInt(number);
        }
        return total;
    }
}
