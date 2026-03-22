public class WeekendSnacks{

    public static int [] countEven(int [] numbers){

    int [] newList = new int[numbers.length];

    int count = 0;


    for(int index = 0; index < numbers.length; index ++){

        if(numbers[index] % 2 == 0){

          newList[count] = numbers[index];  

          count ++; 

        }    


    }

    

        return newList;
    }


    public static int linearSearch(int [] numbers, int target){

    for(int index = 0; index < numbers.length; index ++){

        if(numbers[index] == target){

        return index;


        }

    }

    return -1;
}




    public static int [] squares(int number){


    int [] newList = new int[number];

    int square = 0;

    int count = 0;

    for(int counter = 1; counter <= number; counter ++){

        square = counter * counter;

        newList[count] = square;

        count ++;

}

    return newList;

}



    public static boolean arraysEquals(int [] list1,int [] list2){


        if(list1.length == list2.length){        
           return true;
    }
        for(int index = 0; index < list1.length; index ++){

         if(list1[index] == list2[index]){
           return true;
    }
}
       return false;
        }

//
//
//    public static int [] removeDuplicate(int [] numbers){
//
//        int [] newList = new int[numbers.length];
//
//        for(int index = 0; index < numbers.length; index ++){
//
//         if(numbers[index] != numbers[index]){
//
//           newList == numbers[index];
//
//
//    }
//}
//       return newList;
//    }


}

