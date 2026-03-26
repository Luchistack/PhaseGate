
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DuplicateTest{

    @Test
    public void testThatDuplicatedNumbersAreExtracted(){

    Duplicate check = new Duplicate();

    int [] numbers = {9, 2, 3, 2, 1};


    int [] actualResult = check.duplicateNumbers(numbers);


    int [] expectedResult = {9, 3, 1};


    assertEquals(actualResult, expectedResult);















}

}


