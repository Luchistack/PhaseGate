const prompt = require("prompt-sync")();


let celcuis = parseInt(prompt("Enter Temperature in celcuis: "));

let fahrenheit = (celcuis + 9/5) + 32;

console.log("fahrenheit of celcius temperature is: "+ fahrenheit);



