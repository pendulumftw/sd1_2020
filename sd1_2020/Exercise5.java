import java.util.Scanner;
public class Exercise5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

int sum = 0;
int product = 0;
int average = 0;

int[] x = {20, 30, 40, 50};

for(int i = 0; i < x.length; i++){
 sum = sum + (x[i]);
 product = product * (x[i]);
}

average = (sum / x.length);

System.out.println("The sum of array x is " + sum);
System.out.println("The product of array x is " + product);
System.out.println("The average of array x is " + average);

}
}
