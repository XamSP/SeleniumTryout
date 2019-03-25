package co.max.selenium.webdriver.basic;

public class CodeEx  {

    public static int fibbonacci(int num){
        int previousSum1 = 0;

        int previousSum2;

        int sum = 1;

        System.out.println(previousSum1);

        sum += previousSum1;

        System.out.println(sum);

        previousSum2 = sum;

        for(int i = 1; i < num; i++) {

            System.out.println("Previous Sum1: "+ previousSum1 + ", Previous Sum2: " + previousSum2 + ", and Sum: " + sum + ", Iteration: " + i);

            sum = previousSum1 + previousSum2;

            previousSum1 = previousSum2;

            previousSum2 = sum;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibbonacci(9));
    }
}
