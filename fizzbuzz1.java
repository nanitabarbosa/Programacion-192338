public class fizzbuzz1 {
    public static void main(String[] args) {
        System.out.println(" ProgramaFizz Buzz");
         int max = 100;

        for (int i = 1; i < max; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
