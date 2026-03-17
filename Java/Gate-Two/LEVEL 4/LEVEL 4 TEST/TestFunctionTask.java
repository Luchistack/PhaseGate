
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctionTask{

    @Test
    public void testTheSumOfTwoNumbers(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.addition(5, 4);

    int expectedResult = 9;

    assertEquals(actualResult, expectedResult);



}


    @Test
    public void testTheSumOfTwoNumbersTwo(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.addition(10, 4);

    int expectedResult = 14;

    assertEquals(actualResult, expectedResult);



}


    @Test
    public void testIfNumberIseven(){

    FunctionTask checking = new FunctionTask();

    boolean actualResult = checking.evenNumber(4);

    boolean expectedResult = true;

    assertEquals(actualResult, expectedResult);



}

    @Test
    public void testIfNumberIsevenTwo(){

    FunctionTask checking = new FunctionTask();

    boolean actualResult = checking.evenNumber(5);

    boolean expectedResult = false;

    assertEquals(actualResult, expectedResult);



}


    @Test
    public void testSquareOfNumber(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.square(4);

    int expectedResult = 16;

    assertEquals(actualResult, expectedResult);



}




    @Test
    public void testSquareOfNumberTwo(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.square(5);

    int expectedResult = 25;

    assertEquals(actualResult, expectedResult);



}


    @Test
    public void testcelciusFahrenheit(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.celciusFahrenheit(20);

    double expectedResult = 68.0;

    assertEquals(actualResult, expectedResult);



}


    @Test
    public void testcelciusFahrenheitTwo(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.celciusFahrenheit(40);

    double expectedResult = 104.0;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testprimeNumber(){

    FunctionTask checking = new FunctionTask();

    boolean actualResult = checking.primeNumber(7);

    boolean expectedResult = true;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testprimeNumberTwo(){

    FunctionTask checking = new FunctionTask();

    boolean actualResult = checking.primeNumber(6);

    boolean expectedResult = false;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testlargestNumber(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.largestNumber(10, 12, 23);

    int expectedResult = 23;

    assertEquals(actualResult, expectedResult);



}

    @Test
    public void testlargestNumberTwo(){

    FunctionTask checking = new FunctionTask();

    int actualResult = checking.largestNumber(10, 14, 1);

    int expectedResult = 14;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testsimpleInterest(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.simpleInterest(3, 7, 8);

    double expectedResult = 1.68;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testsimpleInterestTwo(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.simpleInterest(5, 9, 3);

    double expectedResult = 0.9;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testareaOfRectangle(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.areaOfRectangle(5, 9);

    double expectedResult = 15;

    assertEquals(actualResult, expectedResult);



}



    @Test
    public void testareaOfRectangleTwo(){

    FunctionTask checking = new FunctionTask();

    double actualResult = checking.areaOfRectangle(3, 6);

    double expectedResult = 18;

    assertEquals(actualResult, expectedResult);



}






}
