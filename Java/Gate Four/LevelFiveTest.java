
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LevelFiveTest{




    @Test
    public void testTheReturnedArrayIsOfSortedPrimeNumbers(){

    LevelFive check = new LevelFive();
    
    int [] numbers = {5,9,3,6,2};

    int [] actualResult = check.SortedPrimeNumbers(numbers);

    int [] result = {5,3};


    assertEquals(actualResult, result);
     

    }




    @Test
    public void testThatAllNegativeNumbersAreReplacedInTheArray(){

    LevelFive check = new LevelFive();
    
    int []  numbers = {5,-9,3,-6,2,-1};

    int [] actualResult = check.NegativeNumbers(numbers);

    int [] result = {5,0,3,0,2,0};

    assertArrayEquals(actualResult, result);
     

    }


    @Test
    public void testThatAllZerosAreMovedToEndOfTheArrayList(){

    LevelFive check = new LevelFive();
    
    int []  numbers = {5,0,3,0,2,0};

    int [] actualResult = check.ZeroNumbers(numbers);

    int [] result = {5,3,2,0,0,0};


    assertArrayEquals(actualResult, result);
     

    }

}

