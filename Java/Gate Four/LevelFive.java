
public class LevelFive{

    public static int [] NegativeNumbers (int [] numbers){

    for(int index = 0; index < numbers.length; index++){

            if(numbers[index] < 0){

                numbers[index] = 0;
}
}
   return numbers;

}

    public static int [] ZeroNumbers(int [] numbers){


        for(int count = 0; count < numbers.length; count++){

    
        for(int index = count + 1; index < numbers.length; index++){

         
               if(numbers[count] < numbers[index]){


                  int result = numbers[count];
                    
                  numbers[count] = numbers[index];

                  numbers[index] = result;


    }


    }



}
              return numbers;
}

}


