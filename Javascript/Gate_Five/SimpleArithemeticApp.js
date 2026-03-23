//
//#import const prompt to collect input

//#set total passes to 0
//
//#for question in 1 to 10, using for loop to loop through question 10 times
//
//
//#set random number using a variable name randomNumbers equals to = random number from 41 to 100
//
//#set random number using a variable name randomNumbers2 for second random number then equals to = random number from 1 - 40


//initilaise result to equal randomNumber1 - randomNumber2
//
//#tell user to anwser question1, on first attempt, display first random number minus
//
//#if the anwser is correct , add it to total pass and print correct, then continue and if its incorrect print incorrect
//
//display question again

//tell user to enter answer the second time, question2(second attempt)

//#if question2 is correct add it to total pass and print correct, then continue and if its incorrect print incorrect

//#display total passes at the end of the 10 question

//
//let randomNumbers = math.floor(math.random() * (40 - 100 + 1) + 5)

const prompt = require("prompt-sync")();

let totalPasses = 0;

for(let count = 1; count < 11; count ++){

let randomNumbers = Math.floor(Math.random() * (50, 100 + 1) + 5);

let randomNumbers2 = Math.floor(Math.random() * (1, 40 + 1) + 5);

let result = randomNumbers - randomNumbers2;

let calculate = `${randomNumbers} - ${randomNumbers2}`;

let question1 = parseInt(prompt(calculate + " = "));

if(question1 == result){

console.log("Correct Answer 🍕️");

totalPasses ++;

continue;

}else{

console.log("Wrong answer ⛔️, one more attempt 💪️");

}

let question2 = parseInt(prompt(calculate + " = "));

if(question2 == result){

console.log("Correct Answer 🍕️");

totalPasses ++;

}else{

console.log("Wrong answer ⛔️, one more attempt 💪️");

}





}

console.log("Total passes is: " +  totalPasses);


