package org.example;
import java.util.Scanner;

/**
 * TicTacToe
 * UC3: Accept user slot input (1–9)
 */
public class TicTacToe {

    /**
     * Entry point of the program
     */
    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
}