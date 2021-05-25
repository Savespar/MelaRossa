package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int algorithmid = Integer.parseInt(args[0]);
        int loopType = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        if (algorithmid == 1) {
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(0 + " " + 1);
            } else if (n > 2) {
                switch (loopType) {
                    case (1):
                        fiboWhile(n);
                        break;
                    case (2):
                        fiboDoWhile(n);
                        break;
                    case (3):
                        fiboFor(n);
                        break;
                }
            }

        } else if (algorithmid == 2) {
            if (n == 0 || n == 1) {
                System.out.println(1);
            } else if (n > 1) {
                switch (loopType) {
                    case (1):
                        factorialWhile(n);
                        break;
                    case (2):
                        factorialDoWhile(n);
                        break;
                    case (3):
                        factorialFor(n);
                        break;
                }
            }

        }
    }

    public static void factorialWhile(int n) {
        int i = 1, factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }

    public static void factorialDoWhile(int n) {
        int i = 1, factorial = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        System.out.println(factorial);
    }

    public static void factorialFor(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void fiboFor(int n) {
        System.out.print(0 + " " + 1);
        int sum;
        int counter_1 = 0, counter_2 = 1;
        for (int i = 2; i < n; i++) {
            sum = counter_1 + counter_2;
            System.out.print(" " + sum);
            counter_1 = counter_2;
            counter_2 = sum;
        }
    }

    public static void fiboDoWhile(int n) {
        System.out.print(0 + " " + 1);
        int counter_1 = 0, counter_2 = 1;
        int sum = counter_1 + counter_2;
        int i = 2;
        do {
            System.out.print(" " + sum);
            counter_1 = counter_2;
            counter_2 = sum;
            sum = counter_1 + counter_2;
            i++;
        } while (i < n);
    }

    public static void fiboWhile(int n) {
        System.out.print(0 + " " + 1);
        int sum;
        int counter_1 = 0, counter_2 = 1;
        int i = 2;
        while (i < n) {
            sum = counter_1 + counter_2;
            System.out.print(" " + sum);
            counter_1 = counter_2;
            counter_2 = sum;
            i++;
        }
    }
}

