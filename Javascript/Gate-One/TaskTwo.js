const prompt = require("prompt-sync")();

let age = parseInt(prompt("Enter Your Age: "));

let years = age * 5

result = `You will be ${years} years old in 5 years`

console.log(result)
