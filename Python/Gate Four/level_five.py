def sorted_prime_numbers(numbers):
   

    new_list = []

    for number in numbers:

        for index in range(2, number):

            if index <= 1 and index % number == 0:
        
                new_list.append(number)      

                
                return new_list
     

def negative_numbers(numbers):


    for index in range(len(numbers)):

            if numbers[index] < 0:

                numbers[index] = 0

    return numbers

#

def zero_numbers(numbers):

#             
#    numbers.sort()
#
#    numbers.reverse()
#
#    return numbers
#
    new_list = []

    for index in range(0, len(numbers)):

        for count in range(0, len(numbers)):

            if numbers[index] > numbers[count]:

                new_list = numbers[index]

                numbers[index] = numbers[count]

                numbers[count] = new_list

    return numbers




def return_duplicate_numbers(numbers):

    new_list = []

    for number in numbers:

        for index in range(0,number):

            if index == number:

                new_list.append(number)

    return new_list
