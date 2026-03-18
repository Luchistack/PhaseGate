
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestTaskTwo{




    @Test
    public void testLargestNumberInTwoTheArray(){

    TaskTwo check = new TaskTwo;
    
    String characters = "AaaBBc"

    actualResult = check.CountLettersInString(characters);

    result = "A1a2B2C1"


    assertEquals(actualResult, result)
    

       

    }


    @Test
    public void testLargestNumberInTwoTheArray(){

    TaskTwo check = new TaskTwo;
    

    double [] [] numbers = { {45.2, 90.28, 77.1},
                    {3.52, 9.86, 11.77},
                    {77.1, 10, 22.33, 12}
                    };

    double [] actualResult = check.LargestArrayIndex(numbers);

    double [] result = 90.28


    assertEquals(actualResult, result)
    

       

    }



}


