package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        int fact = 1;
        while (num <= printToInclusive){
            if (num != 0) {
                fact *= num;
                System.out.println(fact);
                } else System.out.println(1);
            num++;
        }
     }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();

        factorialNumbers.printFactorialRow(7);
    }
}
