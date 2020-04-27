import java.util.Scanner;

public class Exercise8{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int choice = 0;
	int loop = 0;

	System.out.println("Select an option (1-8):");
	System.out.println();
	while (loop < 7){
		++loop;
		System.out.println(loop + ". Exercise " + loop);
		}
		++loop;
		System.out.println(loop + ". Exit");

	System.out.println();

	System.out.print("Choice: ");
	choice = input.nextInt();
	System.out.println();

	switch(choice){
	case 1:
		System.out.println("Exercise 1");
		System.out.println();
		Exercise1.main(null); //Run Exercise1 class main method.
		break;
	case 2:
		System.out.println("Exercise 2");
		System.out.println();
		Exercise2.main(null); //Run Exercise2 class main method.
		break;
	case 3:
		System.out.println("Exercise 3");
		System.out.println();
		Exercise3.main(null);
		break;
	case 4:
		System.out.println("Exercise 4");
		System.out.println();
		Exercise4.main(null);
		break;
	case 5:
		System.out.println("Exercise 5");
		System.out.println();
		Exercise5.main(null);
		break;
	case 6:
		System.out.println("Exercise 6");
		System.out.println();
		Exercise6.main(null);
		break;
	case 7:
		System.out.println("Exercise 7");
		System.out.println();
		Exercise7.main(null);
		break;
	case 8:
		System.out.println("Exit");
		System.out.println();
		break;
	default:
		System.out.println("Invalid answer");
	}

	if (choice != 8){
		System.out.println();
		Exercise8.main(null);}
  }
}