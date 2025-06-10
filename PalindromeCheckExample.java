package jyothi;

import java.util.Scanner;

public class PalindromeCheckExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}