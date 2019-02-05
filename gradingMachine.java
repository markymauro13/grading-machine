import java.util.Arrays;
import java.util.Scanner;

public class gradingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int grades[] = new int[6]; // 6 grades being inputted by the teacher
		int sum = 0;
		
		for (int i = 1; i <= grades.length - 1; i++)
		{
			System.out.print("Grade " + i + " =" );
			grades[i] = scanner.nextInt();
			sum += grades[i];	//calculates sum
		}
		int average = sum/5;
		
		//int max = grades[0];
	/*	for(int i = 1; i <= grades.length - 1; i++) 	//for loop for find range		// getting the 5 error because it is going thorugh only 5 numbers in the loop, that's how many index there are in teh array
		{
			 if(i> max)
			 {
				 max = i;
			 }
		} */
		
	
		
		System.out.print("--------------");
		System.out.println("\nSum of all grades: " + sum );
		System.out.println("Average of all grades: " + average);
		
		Arrays.sort(grades);
		System.out.println("The minimum is = " + grades[0 + 1]);	// i messed up and used the first for loop to begin at one and in consquence duee to indexing with arrays i have to add one because they start at 0, i think
		System.out.println("The maximum is = " +  grades[grades.length-1]);
		
		int min = grades[0 + 1];
		int max = grades[grades.length-1];
		
		System.out.println("The range is: " + (max - min));	// calculate range
		
		
	}

}
