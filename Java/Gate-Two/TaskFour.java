import java.util.Scanner;

public class TaskFour{

public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter a Number: ");
int numb = input.nextInt();

int times = 0;

int result = 0;

for(int count = 1; count < 13; count ++){

    times = numb * count;

System.out.printf("%d X %d = %d\n", numb, count, times);


}


}

}


