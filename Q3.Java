import java.util.Scanner;

public class Question3{
	public static void main(String[] args) {

		String let ;
		int num;

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a letter");
		let = input.next();

		System.out.println("Enter a number");
		num = input.nextInt();

		int i = 1;

		while (i <= num){
			System.out.print(let);
			i ++;
		}

	}
}
