const prompt = require("prompt-sync")();



let number = parseInt(prompt("Enter a Number: "));

let times = 0;



for(let count = 1; count < 13; count++){

    times = number * count;

    let result = `${number} X ${count} = ${count}`;

    console.log(result);


}



