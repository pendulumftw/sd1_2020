import java.util.Scanner;
public class Exercise4{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int loop = 1;

	while (number < 1 || number > 10){
		System.out.print("Enter a number from 1 to 10: ");
		number = input.nextInt();
	if (number < 1 || number > 10){
		System.out.println("Invalid number entered. Please try again.\n");
	}}

	System.out.println();

	while (loop <= number){
		System.out.println(loop + ". Niall");
		++loop;
	}


	}
}