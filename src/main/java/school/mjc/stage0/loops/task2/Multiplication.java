package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

                int num = 0;

                    while (num <= multiplyByAndToInclusive    || num <= ((multiplyByAndToInclusive ) * -1) ) {
                        String result = multiplyByAndToInclusive != 0 ? Integer.toString(multiplyByAndToInclusive * num) : "";
                        System.out.println(result);
                        num++;
                    }
                }

                 public static void main(String[] args){
            Multiplication multiplication = new Multiplication();

            multiplication.printMultiplied(0);
        }

    }
