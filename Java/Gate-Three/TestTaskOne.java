
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestTaskOne{




    @Test
    public void TestResultOfArrayListAndNumberLengthTw0(){

    TaskOne check = new TaskOne;
    
    int [] numbers = {10, 11, 12}

    int [] actualResult = check.arrayNumberLength(numbers);

    int [] result = {10, 11, 12, -1, -1};


    assertEquals(actualResult, result)
    

       

    }




    @Test
    public void TestResultOfArrayListAndNumberLengthh(){

    TaskOne check = new TaskOne;
    
    int [] numbers = {10, 11, 12, 13, 14}

    int [] actualResult = check.arrayNumberLength(numbers);

    int [] result = {10, 11};
    

    assertEquals(actualResult, result)       

    }




    @Test
    public void TestResultOfArrayListAndNumberLengthh(){

    TaskOne check = new TaskOne;
    
    int [] numbers = { }

    int [] actualResult = check.arrayNumberLength(numbers);

    int [] result = {-1, -1, -1, -1};
    

    assertEquals(actualResult, result)       

    }





}
