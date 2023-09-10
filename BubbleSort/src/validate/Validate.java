/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author khois
 */
public class Validate {

    public static Scanner in = new Scanner(System.in);

    public static int getInt(String messageInfo, String messageOutOfRange, String messageInvalidNumber, int min, int max) {

        System.out.println(messageInfo);

        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine().trim());
                if (n >= min && n <= max) {
                    return n;
                } else {
                    System.err.println(messageOutOfRange);
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println(messageInvalidNumber);
                System.out.print("Enter again: ");
            }
        }
    }
}
