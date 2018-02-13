import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        String newUserString;
        long hexValue = 0;



        System.out.println("Enter a hexadecimal number: ");
        userString = scnr.next();

        newUserString = userString.substring(0, 2);


        if (newUserString.equals("0x")) {
            userString = userString.substring(2);
        }

        userString = userString.toUpperCase();
        int i = userString.length() - 1;
        long nextPower = 0;
        int characterValue = 0;

        while ( i > -1 ) {

            if (userString.charAt(i) == '1') {
                characterValue = 1;
            }
            if (userString.charAt(i) == '2') {
                characterValue = 2;
            }
            if (userString.charAt(i) == '3'){
                characterValue = 3;
            }
            if (userString.charAt(i) == '4'){
                characterValue = 4;
            }
            if (userString.charAt(i) == '5'){
                characterValue = 5;
            }
            if (userString.charAt(i) == '6'){
                characterValue = 6;
            }
            if (userString.charAt(i) == '7'){
                characterValue = 7;
            }
            if (userString.charAt(i) == '8'){
                characterValue = 8;
            }
            if (userString.charAt(i) == '9'){
                characterValue = 9;
            }
            if (userString.charAt(i) == 'A'){
                characterValue = 10;
            }
            if (userString.charAt(i) == 'B'){
                characterValue = 11;
            }
            if (userString.charAt(i) == 'C'){
                characterValue = 12;
            }
            if (userString.charAt(i) == 'D'){
                characterValue = 13;
            }
            if (userString.charAt(i) == 'E'){
                characterValue = 14;
            }
            if (userString.charAt(i) == 'F'){
                characterValue = 15;
            }

            hexValue = hexValue + (long)(characterValue * (Math.pow(16, nextPower)));
            i--;
            nextPower++;

        }

        System.out.println("Your number is " + hexValue + " in decimal");
    }
}
