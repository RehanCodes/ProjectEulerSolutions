package solutions;

/* *
 * Solution for Problem 4
 * Finding the Largest palindrome product
 * link: https://projecteuler.net/problem=4
 *
 * @author: Rehan
 * */

public class P4_LargestPalindromeProduct {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long product, reversed = 0L, temp, contender = 0L;
        int num1 = 0, num2 = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                product = i * j;
                temp = product;
                while (product != 0) {
                    long digit = product % 10;
                    reversed = reversed * 10 + digit;
                    product /= 10;
                }
                if (temp == reversed) {
                    if (temp > contender) {
                        num1 = i;
                        num2 = j;
                        contender = temp;
                    }
                } else {
                    reversed = 0L;
                }
            }
        }
        System.out.println("The largest Palindrome Product of 2 three digit numbers is: " + contender + " ontained for the number pairs: " + num1 + " & " + num2);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("\nTime taken for the execution : " + elapsedTime + " ms");
    }
}
