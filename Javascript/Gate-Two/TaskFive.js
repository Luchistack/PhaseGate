const prompt = require("prompt-sync")();


let number = parseInt(prompt("Enter a Number: "));


let factorial = 1;
let result = 0;

for(let count = 1; count < number + 1; count++){

     result = factorial * count;

console.log(result);
}

