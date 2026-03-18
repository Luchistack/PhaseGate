
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ZeroFuctionTest{

    @Test
    public void TestIfNumberIsAddedCorrectly(){

    TaskZero checker = new TaskZero();

    int actualResult = checker.addition(7, 8);

    int expectedResult = 15;

    assertEquals(actualResult, expectedResult);


} 


    @Test
    public void TestTotalSumOfNumbersInArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int actualResult = checker.totalSum(numbers);

    int expectedResult = 39;

    assertEquals(actualResult, expectedResult);


} 



    @Test
    public void TestForLargestNumberInAArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int actualResult = checker.largestSorting(numbers);

    int expectedResult = 11;

    assertEquals(actualResult, expectedResult);


} 

    @Test
    public void TestForSmallestNumberInAArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int actualResult = checker.smallestSorting(numbers);

    int expectedResult = 4;

    assertEquals(actualResult, expectedResult);


} 


    @Test
    public void TestForEvenNumberInAArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int actualResult = checker.evenNumbers(numbers);

//    int expectedResult = 4, 8;

    assertEquals(actualResult, 4, 8);


} 



    @Test
    public void TestForToReverseNumbersInAArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int [] actualResult = checker.reverseNumbers(numbers);

    int [] expectedResult = {11, 9, 8, 7, 4};

    assertArrayEquals(actualResult, expectedResult);


} 


    @Test
    public void TestForToLengthOfNumbersInAArray(){

    TaskZero checker = new TaskZero();

    int [] numbers = {4, 7, 8, 9, 11};

    int actualResult = checker.lengthNumbers(numbers);

    int expectedResult = 5;

    assertEquals(actualResult, expectedResult);


} 

}
