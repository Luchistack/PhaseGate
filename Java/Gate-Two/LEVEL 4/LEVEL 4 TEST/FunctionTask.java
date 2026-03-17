public class FunctionTask{


public static int addition(int num1, int num2){

    return num1 + num2;


} 

public static boolean evenNumber(int number){

if(number % 2 == 0){
        return true;
}else{
        return false;

}


}


public static int square(int number){

    int result = number * number;

    return result;

}

public static double celciusFahrenheit(double number){

    double fahrenheit = number * 9/5 + 32;

    return fahrenheit;


}

public static boolean primeNumber(int number){


    for(int count =2; count < number; count ++){

}

    if(number % 2 == 0 & number > 1){

        return false;
}else{
        return true;
}
}



public static int largestNumber(int number1, int number2, int number3){

int largest = number1;

if(number2 > largest && number2 > number1){
    largest = number2;
}
else{
    largest = number3;
}
   return largest;
}

public static double simpleInterest(double principle,double rate, double time){

    double simpleInt = (principle * rate * time / 100);

    return simpleInt;
}

public static int areaOfRectangle(int length, int width){

    int result = length * width;

    return result;


}

}
