
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WeekendSnacksTest{

    @Test

    public void testAndPrintSquareInList(){

    WeekendSnacks checker = new WeekendSnacks();

    int [] numbers = {3,2,5,7,8,9,6};

    int [] actualResult = checker.countEven(numbers);

    int [] expectedResult = {2, 8, 6};

    assertEquals(actualResult, expectedResult);



}


    @Test

    public void testNumbersInArrayListReturnsIndexOfTarget(){

    WeekendSnacks checker = new WeekendSnacks();

    int [] numbers = {3,2,5,7,8,9,6};

    int target = 7;

    int actualResult = checker.linearSearch(numbers, target);

    int expectedResult = 3;

    assertEquals(actualResult, expectedResult);


}


    @Test

    public void testNumbersInArrayListReturnSqaureOfNumber(){

    WeekendSnacks checker = new WeekendSnacks();

    int number = 5;

    int [] actualResult = checker.squares(number);
 
    int [] expectedResult = {1, 4, 9, 16, 25};
 
    assertArrayEquals(actualResult, expectedResult);


}



    @Test

    public void test_NumbersInArrayListReturnTrueIfNumbersSameLengthAndValue(){

    WeekendSnacks checker = new WeekendSnacks();

    int [] list1 = {7,9,3,4,2};

    int [] list2 = {6, 5, 6, 7, 8, 6};

    boolean actualResult = checker.arraysEquals(list1, list2);
 
    assertFalse(actualResult);


}

}
//
//
//    @Test
//
//    public void testNumbersInArrayListReturnaNewListWithDuplicatesRemoved(){
//
//    WeekendSnacks checker = new WeekendSnacks();
//            
//    int [] numbers = {6, 5, 6, 7, 5, 8};
//
//    int [] actualResult = checker.removeDuplicate(numbers);
// 
//    int [] expectedResult =  {6, 5, 7, 8};
//
//    assertEquals(actualResult, expectedResult);
//
//
//}
//
//}
//    @Test
//
//    public void testFlattenArrayIsConvertedFrom2DTo1D(){
//
//    WeekendSnacks checker = new WeekendSnacks();
//            
//    int [] [] numbers = {{6, 5, 7, 5},
//                      {4, 7, 3, 1, 2}
//                      };
//
//    int [] actualResult = checker.flatten(numbers);
// 
//    int [] expectedResult =  {6, 5, 7, 5, 4, 7, 3, 1, 2};
//
//    assertEquals(actualResult, expectedResult);
//
//
//}
//}
//
//    @Test
//
//    public void testNumbersInArrayListReturnaNewListWithDuplicatesRemoved(){
//
//    WeekendSnacks checker = new WeekendSnacks();
//            
//    int [] array_list = {6, 5, 6, 7, 5, 8};
//
//    int [] array_list2 = {6, 9, 1, 5};
//
//    int [] actualResult = checker.removeDuplicate(array_list, array_list2);
// 
//    int [] expectedResult = {7, 8, 9, 1};
//
//    assertEquals(actualResult, expectedResult);
//
//
//}
//
//
