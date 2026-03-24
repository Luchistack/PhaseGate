//
//#import random

//set random class .... Random (variable name) for the random numbers = new Random();
//
//#set total passes to 0
//
//#for question in 1 to 10, using for loop to loop through question 10 times
//
//#set number equals to = random  numbers.nextInt 40 to 70 
//
//#set number2 to equals random  numbers.nextInt  1 to 39 in a another variable name

//initilaise result to equal number - number2
//
//#tell user to anwser question1, on first attempt
//
//#if the anwser is correct , add it to total pass and print correct, then continue and if its incorrect print incorrect
//
//display question again

//tell user to enter answer the second time, question2(second attempt)

//#if question2 is correct add it to total pass and print correct, then continue and if its incorrect print incorrect

//#display total passes at the end of the 10 question

import java.util.Scanner;
import java.util.Random;
public class SimpleArithemeticApp{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
Random numbers = new Random();


int totalPasses = 0;

for(int count = 1; count < 11; count ++){

int number = numbers.nextInt(40, 70);

int number2 = numbers.nextInt(1, 39);

int result = number - number2;

System.out.printf("%d - %d = ",  number, number2);

int question1 = input.nextInt();

if(question1 == result){

System.out.println("Correct Answer 🍕️");

totalPasses ++;
continue;

}else{

System.out.println("Wrong answer ⛔️, one more attempt 💪️");

}

System.out.printf("%d - %d = ",  number, number2);

int question2 = input.nextInt();

if(question2 == result){

System.out.println("Correct Answer 🍕️");

totalPasses ++;

}else{

System.out.println("Wrong answer ⛔️");

}





}

System.out.println("Total passes is: " +  totalPasses);

}


}
