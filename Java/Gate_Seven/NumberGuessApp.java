
import java.util.Scanner;
import java.util.Random;
public class NumberGuessApp{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
Random numbers = new Random();


    int total = 0;

    int totalAttempt = 0;

    int attemptTime = 5;

    int randomNumber = numbers.nextInt(1, 100);


    for(int count = 0; count < attemptTime; count ++){

        System.out.println("Guess a Number: ");
        int guess = input.nextInt();

        if(guess  < 1 && guess > 100){

            System.out.println("Error ⛔️, Enter a valid input between 1-100");

}

        if(count == 0 && guess == randomNumber){

            System.out.println("First Guess is Correct.....🏆️Legendary!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(count == 1 && guess == randomNumber){

            System.out.println("Second Guess is Correct.....🏆️Excellent!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(count == 2 && guess == randomNumber){

            System.out.println("Third Guess is Correct.....🏆️Good!");
            total += 1;
            totalAttempt += 1;
            break;

}

        if(count == 3 && guess == randomNumber){

            System.out.println("Forth Guess is Correct.....🏆️Good!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(count == 4 && guess == randomNumber){

            System.out.println("Fifth Guess is Correct.....🏆️Close!");
            total += 1;
            totalAttempt += 1;
            break;
}
        if(guess != randomNumber){

          System.out.println("Wrong guess, try again");
}

            if(guess > randomNumber){
        
               System.out.println("Guess is too High");
}
            else{

            System.out.println("Guess is too low");
}
}
    System.out.println("\nGAME SUMMARY\n");

    System.out.println("\nTotal Correct attempt is " + total);

    System.out.println("Correct Number is " + randomNumber);

    System.out.printf("Here is your rating, you got %d out of %d Guesses " , total , totalAttempt);


}
}
