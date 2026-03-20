
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestLevelSix{




    @Test
    public void testThatArrayIsOfSpiltIntoEvenAndOddArrays(){

    LevelSix check = new LevelSix();
    
    int [] numbers = {45,60,3,10,9,22};

    int [] actualResult = check.SortedOddEvenArrays(numbers);

    int [] result = {{45,3,9},{60,10,22}};


    assertEquals(actualResult, result);
     

    }




    @Test
    public void testThatAllPerfectSquareNumbersInTheArrayArePrinted(){

    LevelSix check = new LevelSix();
    
    int []  numbers = {45, 7, 9, 10, 16, 18, 4};

    int [] actualResult = check.PerfectSquareNumbers(numbers);

    int [] result = {4,9,16};

    assertArrayEquals(actualResult, result);
     

    }





    @Test
    public void testThatArrayIsPalindromic(){

    LevelSix check = new LevelSix();
    
    int [] numbers = {4,7,0,10,16,18};

    int [] actualResult = check.palindromicArrays(numbers);

    int [] result = {4,9,16};


    assertEquals(actualResult, result);
     

    }




    @Test
    public void testThatAllNonPerfectNumbersInTheArrayAreReplaceWithMInusONe(){

    LevelSix check = new LevelSix();
    
    int []  numbers = {4, 7, 8, 9, 10, 49, 6};

    int [] actualResult = check.NonPerfectSquareNumbersInArray(numbers);

    int [] result = {4,-1, 9, -1, 49, -1};

    assertArrayEquals(actualResult, result);
     

    }
}
