package chapter3;

/**
 * This program demonstrates a triangular array
 */
public class TriangularArray {
    public static void main(String[] args) {
        final int NMAX =10;

        //allocate the triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n= 0; n<=NMAX; n++)
            odds[n] = new int[n + 1];
        //fill the triangular array
        for (int n = 0; n < odds.length; n++) {
            for(int k= 0; k<odds[n].length; k++) {
                /*
                *compute binomial coefficient n* (n-1) *(n-2)
                *  *(n-k+1)/(1*2*3....*k)
                 */
                int lotterOdds = 1;
                for (int i= 1; i <=k; i++)
                    lotterOdds = lotterOdds *(n-i + 1)/i;
                odds[n][k] = lotterOdds;
            }
        }
        //print triangula array
        for(int[] row : odds){
            for(int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
