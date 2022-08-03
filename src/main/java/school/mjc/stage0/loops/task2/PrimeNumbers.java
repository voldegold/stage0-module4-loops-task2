package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int i, flag;
        int number = 2;


        if (printToInclusive == 0 || printToInclusive == 1) {
            System.out.print("");
        } else while (number < printToInclusive) {
            i = 2;
            flag = 0;
            while (i <= number / 2) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
                i++;
            }
            if (flag == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
