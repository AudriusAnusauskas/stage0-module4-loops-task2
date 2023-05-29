package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            if(num == 2 || num == 3 || num == 5 || (num % 2 != 0 && num != 2) && (num % 3 != 0 && num !=3) && (num % 5 !=0 && num != 5))
                System.out.println(num);
                num++;
        }
    }

}
