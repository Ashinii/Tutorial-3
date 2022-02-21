import java.util.Scanner;

public class Question2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    int Input_1;
		int Input_2;

		System.out.println("Enter the first number");
		Input_1 = input.nextInt();

		System.out.println("Enter the second number");
		Input_2 = input.nextInt();

		if (Input_1 < Input_2) {
			for (int i = Input_1+1 ; i < Input_2 ; i ++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Please enter a lower value to the first number");
		}
		

	}
}
