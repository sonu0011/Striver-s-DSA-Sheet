package patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        /**
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         *
         for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
         System.out.print("* ");
         }
         System.out.println();
         }
         */

        /**
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         for (int i = 0; i < 5; i++) {
         for (int j = 0; j <= i; j++) {
         System.out.print("* ");
         }
         System.out.println();
         }

         */

        /**
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5

         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
         System.out.print(j + " ");
         }
         System.out.println();
         }
         */

        /**
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5

         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
         System.out.print(i + " ");
         }
         System.out.println();
         }
         */

        /**
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *

         for (int i = 5; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
         System.out.print("* ");
         }
         System.out.println();
         }

         */

        /**
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1

         for (int i = 5; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
         System.out.print(j + " ");
         }
         System.out.println();
         }
         */

        /**
         *     *
         *    ***
         *   *****
         *  *******
         * *********

         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 9; j++) {
         if (6 - i <= j && 4 + i >= j) {
         System.out.print("*");
         } else {
         System.out.print(" ");
         }
         }
         System.out.println();
         }

         */

        /**
         * *********
         *  *******
         *   *****
         *    ***
         *     *

         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 9; j++) {
         if (j >= i && j <= 10 - i) {
         System.out.print("*");
         } else {
         System.out.print(" ");
         }
         }
         System.out.println();
         }
         */

        /**
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         * *********
         *  *******
         *   *****
         *    ***
         *     *



         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 9; j++) {
         if (6 - i <= j && 4 + i >= j) {
         System.out.print("*");
         } else {
         System.out.print(" ");
         }
         }
         System.out.println();
         }


         for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 9; j++) {
         if (j >= i && j <= 10 - i) {
         System.out.print("*");
         } else {
         System.out.print(" ");
         }
         }
         System.out.println();
         }

         */

        /**
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *

         for (int i = 1; i <= 2 * n - 1; i++) {
         int starts = i;
         if (i > n) starts = 2 * n - i;
         for (int j = 1; j <= starts; j++) {
         System.out.print("* ");
         }
         System.out.println();
         }

         */

        /**
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1

         int start = 1;
         for (int i = 1; i <= n; i++) {
         if (i % 2 == 0) start = 0;
         else start = 1;

         for (int j = 1; j <= i; j++) {
         System.out.print(start + " ");
         start = 1 - start;
         }
         System.out.println();
         }
         */

        /**
         * 1      1
         * 12    21
         * 123  321
         * 12344321

         n = 4;
         for (int i = 1; i <= n; i++) {
         //numbers

         for (int j = 1; j <= i; j++) {
         System.out.print(j);
         }

         //spaces

         for (int j = i + 1; j <= 2 * n - i; j++) {
         System.out.print(" ");

         }

         //numbers

         for (int j = i; j >= 1; j--) {
         System.out.print(j);
         }

         System.out.println();

         }
         */

        /**
         * A
         * A B
         * A B C
         * A B C D
         * A B C D E


         for (int i = 1; i <= n; i++) {
         for (int j = 65; j < 65 + i; j++) {
         System.out.print((char) j + " ");

         }
         System.out.println();
         }

         for (int i = 1; i <= n; i++) {
         for (char j = 'A'; j < 'A' + i; j++) {
         System.out.print(j + " ");

         }
         System.out.println();
         }
         */

        /**
         * A B C D E
         * A B C D
         * A B C
         * A B
         * A


         for (int i = n; i >= 1; i--) {
         for (char j = 'A'; j < 'A' + i; j++) {
         System.out.print(j + " ");

         }
         System.out.println();
         }
         */

        /**
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E


         char result = 'A';
         for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= i; j++) {
         System.out.print(result + " ");
         }
         result++;
         System.out.println();
         }
         */

        /**
         *    A
         *   ABC
         *  ABCDC
         * ABCDEDC

         n = 4;
         for (int i = 1; i <= n; i++) {
         int breakPoint = (2 * i + 1) / 2;
         for (int j = 1; j <= n - i; j++) {
         System.out.print(" ");
         }
         char start = 'A';

         for (int j = 1; j < 2 * i; j++) {
         System.out.print(start);
         if (j <= breakPoint) start++;
         else start--;
         }

         for (int j = 1; j <= n - i; j++) {
         System.out.print(" ");
         }


         System.out.println();
         }
         */

    }
}
