import java.util.Scanner;
public class Exercise3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int age = 19;

	System.out.print("Enter a number: ");
	number = input.nextInt();

	if (number == age){
	System.out.println("This number is the same as my age");
	} else if (number > age){
	System.out.println("This number is greater than my age");
	} else if (number < age){
	System.out.println("This number is less than my age");
	}

	}
}