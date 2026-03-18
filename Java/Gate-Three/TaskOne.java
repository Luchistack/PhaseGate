
public class TaskOne{

//
//    public static int [] reduceLength (int [] numbers, int number){
//
//
//    if (numbers.length > number){
//
//    return new int [][numbers[0]], numbers[1];
//
//}
//
//}
    public static int [] arrayNumberLength(int [] numbers){

    int [] newList = new int[numbers.length];

    int index = 0;

    int length = 5;



    for(int count = 0; count < numbers.length; count ++){

        if(numbers[count] > length){

        newList[index] = numbers[count];
 
        index --;       

}

    }

        return newList;


//}
//
//    public static int [] arrayNUmber (int number){
//
//    int [] numbers = new int[number];
//
//    for(int count = 0; count < number, count ++){
//
//    numbers[count] = -1;
//
//}
//    return numbers;
//}
//
}

}


 
