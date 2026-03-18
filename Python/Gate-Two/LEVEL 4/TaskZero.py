def addition(num1, num2):
    return num1 + num2



def elements(numbers):

    total = 0

    for num in numbers:

        total += num

    return total

def largest(numbers):

    result = 0

    numbers.sort

    result = numbers[-1]

    return result



def largest_sort(numbers):

    largest = 0

    for num in numbers:

        if num > largest:

            largest = num

    return largest




def smallest_sort(numbers):

    smallest = numbers[0]

    for num in numbers:

        if num < smallest:

            smallest = num

    return smallest





def even_numbers(numbers):

    for num in numbers:

        if num % 2 == 0:

            return num




def reverse_numbers(numbers):

    reverse_list = []


    for num in range(len(numbers) -1, -1, -1):

        reverse_list.append(numbers[num])

    return reverse_list

#    return numbers[::-1]



def length_numbers(numbers):

    count = 0;

    for num in numbers:
        count += 1
    return count

#or return len(numbers)


def average_numbers(numbers):

    average = 0;

    total = 0

    for num in numbers:
      
        total += num

        average = total / 5

    return average

#or return len(numbers)
