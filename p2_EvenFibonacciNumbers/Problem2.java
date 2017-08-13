package p2_EvenFibonacciNumbers;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {

    private static long findSumEvenTerms (long nextTerm, long sumEvenTerms) {
        if (nextTerm % 2 == 0) {
            sumEvenTerms += nextTerm;
            System.out.println("Even term found, new sum of even terms is " + sumEvenTerms);
        }

        return sumEvenTerms;
    }

    private static long findNextTerm (int maxTerm, long termOne, long termTwo, long sumEvenTerms) {
        do {
            long nextTerm = termOne + termTwo;
            System.out.println(nextTerm);

            // If nextTerm is even, then add to sum
            sumEvenTerms = findSumEvenTerms(nextTerm, sumEvenTerms);

            // Set the terms for the next Fibonacci
            termOne = termTwo;
            termTwo = nextTerm;
        } while (termTwo <= maxTerm);

        return sumEvenTerms;
    }

    public static void main (String[] args) {
        int maxTerm = 4_000_000;

        long termOne = 1L;
        long termTwo = 2L;
        //Set sumEvenTerms to 2, as we already declared the first even term as termTwo.
        long sumEvenTerms = 2L;

        sumEvenTerms = findNextTerm(maxTerm, termOne, termTwo, sumEvenTerms);

        System.out.println("Total sum of even Fibonacci terms where the Fibonacci numbers are less than 4,000,000 is " + sumEvenTerms);
    }
}
