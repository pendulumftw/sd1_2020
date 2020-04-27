import java.util.Scanner;
public class Exercise6{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

String answer = "";
int rows = 0;
int columns = 0;
int rowloop = 0;

System.out.print("Enter a symbol: ");
answer = input.next();
Character symbol = new Character(answer.charAt(0));
System.out.print("Enter number of rows: ");
rows = input.nextInt();
System.out.print("Enter number of columns: ");
columns = input.nextInt();

rowloop = rows;

while (columns > 0){
	while (rowloop > 0){
		System.out.print(symbol + " ");
		--rowloop;
	}
	rowloop = rows;
	System.out.println();
	--columns;
}


}
}
