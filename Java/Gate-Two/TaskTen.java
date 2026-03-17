import java.util.Scanner;

public class TaskTen{

public static void main(String [] args){

Scanner input = new Scanner(System.in);


String number = "1000";

int result = 0;

for(int count = 1; count <= number.length(); count++){

result = count;

}

System.out.printf("number in length of %s = %s \n", number, result);


}

}
