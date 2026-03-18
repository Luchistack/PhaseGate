public class TaskZero{


    public static int addition(int num1, int num2){

        return num1 + num2;



}



    public static int totalSum(int [] numbers){

        int total = 0;

        for(int count = 0; count < numbers.length; count++){

            total += numbers[count];
            

}

            return total;

}



    public static int largestSorting(int [] numbers){

        int largest = 0;

        for(int count = 0; count < numbers.length; count++){
    
            if(numbers[count] > largest){
                
               largest = numbers[count];

}

}

            return largest;

}



    public static int smallestSorting(int [] numbers){

        int smallest = numbers[0];

        for(int count = 0; count < numbers.length; count++){
    
            if(numbers[count] < smallest){
                
               smallest = numbers[count];

}

}

            return smallest;

}





    public static int evenNumbers(int [] numbers){

        int even = 0;

        for(int count = 0; count < numbers.length; count++){
    
            if(numbers[count] % 2 == 0){
                
               even = numbers[count];

}

}

            return even;

}





    public static int [] reverseNumbers(int [] numbers){


        int [] reverse = new int[numbers.length];

        int index = 0;

        for(int count = numbers.length - 1; count >= 0; count--){
    
  
               reverse[index] = numbers[count];

                index ++;
}


        return reverse;

}



    public static int lengthNumbers(int [] numbers){


         int total = 0;

        for(int count = 0; count <= numbers.length; count++){
    
            total = count;
}


        return total;

}




}
