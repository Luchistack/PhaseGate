import java.util.Scanner;

public class TaskTen{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int average = 0;

for(int count = 0; count < 3; count++){

System.out.println("Enter a number: ");

int number = input.nextInt();


average = number + number + number / 3;

}

System.out.println("Average of three numbers is: " + average);


}

}
