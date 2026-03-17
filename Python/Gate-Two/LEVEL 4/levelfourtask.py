

def addition(num1, num2):

    return num1 + num2




def check_even_number(number):

    if(number % 2 == 0):

        return 1
    else:

        return 0

def square_of_number(number):

    square = number * number

    return square


def celcuis_to_fahrenheit(celcius):

    fahrenheit = celcius * 9/5 + 32

    return fahrenheit


#def check_prime_number(number):
#
#    for counter in range(2, number):
#        if number % counter == 0 and number > 1 == 0:
#            return False
#        else:
#            return True

#def check_largest_number(number1, number2, number3):
#
#    largest = 1
#
#    if number1 > largest:
#       largest = number1
#
#    if number2 > number1:
#       largest = number2
#
#    else:
#        largest = number3



def simple_interest(principle, rate, time):

    result = 0

    result = (principle * rate * time / 100)
    
    return result


def multiplication_table(number):

    number = 5

    total = 0

    result = 0

    for num in range(1, 13):

        total = number * num
        
        result = f"{number} X {num} = {total}"

        return result


def area_of_rectangle(length, breath):

    area = 0

    area = length * breath

    return area

#def reverse_a_number(number):
#
#    number = 5054
#
#    count = 0
#
#    for num in range(len(number)):
#
#        count -= 1
#
#        return count
