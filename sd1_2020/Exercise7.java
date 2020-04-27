//The code given in the PDF didn't work (it kept telling me it was an illegal start to an expression
//so I reversed the array using a different method
//Code is adapted from https://examples.javacodegeeks.com/reverse-array-java-example/

import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {

		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		int y = 0;


		System.out.println("First value: " + numbers[y]);

		y = (numbers.length - 1);

		System.out.println("Last value: " + numbers[y]);

        for(int i=0; i<numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -i -1];
            numbers[numbers.length -i -1] = temp;
        }


           for (int i = 0; i < numbers.length; i++) {
		     System.out.println(numbers[i]);
   }
    }
}