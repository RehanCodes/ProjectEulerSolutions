package solutions;

/* *
 * Solution for Problem 7
 * Finding the the 10,001st prime number
 * link: https://projecteuler.net/problem=7
 *
 * @author: Rehan
 * */

public class P7_TenThousandthAndOnePrime {
    private boolean isPrime(int number) {
        boolean flag = false;
        double maxLimit = Math.ceil(number / 2);
        for (double i = 2; i <= maxLimit; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        P7_TenThousandthAndOnePrime obj = new P7_TenThousandthAndOnePrime();
        int counter = 2;
        int numberOfInterest = 4;
        while (counter != 10001) {
            if (obj.isPrime(numberOfInterest)) {
                counter++;
                if (counter == 10001) {
                    break;
                }
            }
            numberOfInterest++;
        }
        System.out.println("The 10,0001st prime number is: " + numberOfInterest);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("\nTime taken for the execution : " + elapsedTime + " ms");
    }

}
