package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0){
            System.out.println( "too much power");
        } else {
            int num = 0;
            while (num <= power){
                System.out.println((int) Math.pow(2, num));
                num++;
            }
        }

    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        powerOfTwo.printPower(-4);
    }
}
