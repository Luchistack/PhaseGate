const prompt = require("prompt-sync")();

function guess_game(){
    
    let total = 0;

    let totalAttempt = 0;

    let attemptTime = 5;

    let randomNumber = Math.floor(Math.random() * (1, 100 + 1) + 5);


    for(let num = 0; num < attemptTime; num ++){

        let guess = parseInt(prompt("Guess a Number: "));

        if(guess  < 1 && guess > 100){

            console.log("Error ⛔️, Enter a valid input between 1-100");

}

        if(attemptTime[num] == 0 && guess == randomNumber){

            console.log("First Guess is Correct.....🏆️Legendary!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(attemptTime[num] == 1 && guess == randomNumber){

            console.log("Second Guess is Correct.....🏆️Excellent!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(attemptTime[num] == 2 && guess == randomNumber){

            console.log("Third Guess is Correct.....🏆️Good!");
            total += 1;
            totalAttempt += 1;
            break;

}

        if(attemptTime[num] == 3 && guess == randomNumber){

            console.log("Forth Guess is Correct.....🏆️Good!");
            total += 1;
            totalAttempt += 1;
            break;
}

        if(attemptTime[num] == 4 && guess == randomNumber){

            console.log("Fifth Guess is Correct.....🏆️Close!");
            total += 1;
            totalAttempt += 1;
            break;
}
        if(guess != randomNumber){

            console.log("Wrong guess, try again");
}

            if(guess > randomNumber){
        
                console.log("Guess is too High");
}
            else{

                console.log("Guess is too low");
}
}
    console.log("\nGAME SUMMARY\n");

    console.log("\nTotal Correct attempt is ", total);

    console.log("Correct Number is ", randomNumber);

    console.log(`Here is your rating, you got ${total} out of ${totalAttempt} Guesses`);


}
guess_game()
