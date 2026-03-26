import java.util.Arrays;

public class Duplicate{


    public static int [] duplicateNumbers(int [] numbers){


    int [] newList = new int[numbers.length];

    int counter = 0;

//
//
        for(int count = 0; count < numbers.length; count ++){

            for(int index = 0; index < numbers.length; index ++){

                if(numbers[index] == numbers[count]){
                
                    newList[counter] = numbers[index];
        
}
}



    }

    return newList;
    }

}



