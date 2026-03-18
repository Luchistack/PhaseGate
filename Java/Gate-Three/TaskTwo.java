public class TaskTwo{


    public static String CountLettersInString(String characters){


       int counter = 0;

    for(int index = 0; index <= characters.length(); index++){

           for(int letters = 0; letters <= characters.lenth(); letters ++){

                char character = characters.charAt(letters);

                if(character == 'A'){

                    counter = character;

                    counter += 1;
    }
           }
                }
                   return characters;     
    
}




    public static double LargestArrayIndex(double [] [] numbers){

    double largest = 0;


    for(double outterLoop = 0; outterLoop < numbers.length; outterLoop++){

           for(double innerLoop = 0; innerLoop < numbers.length; innerLoop++){

                    if(numbers[outterLoop][innerLoop] > largest){

                       largest = numbers[outterLoop][innerLoop]

        }
           }
               }


            return largest;
}





}


