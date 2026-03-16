const prompt = require("prompt-sync")();

let itemPrice = parseInt(prompt("Enter a number"));



let tax = itemPrice * 10/100

console.log("Total plus tax is:", tax)
