package EX0518;

import java.util.Scanner;

/*
(Check  password)  Some  websites  impose  certain  rules  for  passwords.
Write  a  method that checks whether a string is a valid password.
Suppose the password rules are as follows:
 ■   A password must have at least eight characters.
 ■   A password consists of only letters and digits.
 ■   A password must contain at least two digits.Write a program that prompts the user
 to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise
 */
public class Ex0518 {

    /** Main method. */
    public static void main(String[] args) {
        // Create a Scanner.
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a password.
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        // Display result
        System.out.println(isValid(password));

    }

    /** Method that whether a string is a valid password.
     * @param password password to check for.
     * @return true if password is valid.
     */
    public static boolean isValid(String password) {
        String invalidInput = "@#$!%&*()-+";
        // Check whether a password contains at least eight characters.
        if ((password.length() <= 9) && (!password.contains(invalidInput))) {
           return false;
        } else {
            return true;
        }
    }

}
