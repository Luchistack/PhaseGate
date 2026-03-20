function sorted_prime_numbers(numbers){

    let new_list = []

    for(let count = 0; count < numbers.length; count++){

        for(let index = 2; index < count; index++){

            if(index <= 1 && index % count == 0){
        
}
                new_list.push(count)      
}
}
                
                
    return new_list

}

console.log(sorted_prime_numbers([5,9,3,6,2]));




function negative_numbers(numbers){


    for(let index = 0; index < numbers.length; index++){

            if(numbers[index] < 0){

                numbers[index] = 0
}
}
    return numbers

}

console.log(negative_numbers([5,-9,3,-6,2,-1]))



function zero_numbers(numbers){

    new_list = []

    for(let index = 0; index < numbers.length; index++){

       for(let count = 0; count < numbers.length; count++){

            if(numbers[index] > numbers[count]){

                new_list = numbers[index]

                numbers[index] = numbers[count]

                numbers[count] = new_list
}

}
}
    return numbers


}

console.log(zero_numbers([5,0,3,0,2,0]))







function return_duplicate_numbers(numbers){



    for(let index = 0; index < numbers.length; index++){


            if(numbers[index] > 1){

}
             if(numbers[index] = numbers[index]){

            

}
    return numbers[index]

}




}

console.log(return_duplicate_numbers([45,60,3,0,67,2,45,3,22,0]))
