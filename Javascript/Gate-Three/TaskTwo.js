function largest_array_index(){


    let numbers = [ [45.2, 90.28, 77.1],
                    [3.52, 9.86, 11.77],
                    [77.1, 10, 22.33, 12]
                    ]

    let largest = 0;
    let arrayPosition = 0;
    let result = 0;
    let result2 = 0;
    let result3 = 0;

    for(let outterloop = 0; outterloop < numbers.length; outterloop++){

           for(let innerloop = 0; innerloop < outterloop; innerloop++){

                if(innerloop > largest){

                    largest = innerloop;
                }
                if(numbers[outterloop] > arrayPosition){

                   arrayPosition = numbers[outterloop];  
                }
                  result = largest;

                  result2 = arrayPosition;

                 result3 = `Postion of largest index is ${result}, and largest area location is in ${result2}`
}

}

console.log(result3);
console.log("Result is:", "[", result2 ,",", result, "]");
      
}

largest_array_index();
