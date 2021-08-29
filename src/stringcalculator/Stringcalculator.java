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
            return toInt(text);
        }
    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }

}
