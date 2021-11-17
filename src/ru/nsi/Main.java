package ru.nsi;

public class Main {

    private boolean isPrimeNumber (int number) {
        boolean isPrimeNumber = false;
        int numberOfDivision = 0;
        if (number > 1) {
            int mod;
            for (int i = 2; i<number; i++) {
              mod = number % i;
              if (mod == 0) {
                  numberOfDivision = numberOfDivision + 1;
              }
            }
        }
        if( numberOfDivision == 0) {
            return isPrimeNumber;
        }
        else {
            isPrimeNumber = true;
            return isPrimeNumber;
        }
    }

    public static void main(String[] args) {
        int begin = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for (int i = begin; i<=begin; i++) {
            System.out.print(1);
        };

//        for (int i = begin; i <= end; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (int i = begin; i <= end; i++) {
//
//        }
    }
}
