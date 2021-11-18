package ru.nsi;

public class Main {

    private static boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = false;
        int numberOfDivision = 0;
        if (number == 0 || number == 1) {
            return isPrimeNumber;
        } else {
            int mod;
            for (int i = 2; i < number; i++) {
                mod = number % i;
                if (mod == 0) {
                    numberOfDivision = numberOfDivision + 1;
                }
            }
            if (numberOfDivision > 0) {
                return isPrimeNumber;
            } else {
                isPrimeNumber = true;
                return isPrimeNumber;
            }
        }
    }

    public static void main(String[] args) {
        int begin = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        System.out.print("BEGIN: " + begin + ", END: " + end);
        System.out.println();
        System.out.print("PRIME NUMBERS: ");
        for (int i = begin; i <= end; i++) {
            if (isPrimeNumber(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
