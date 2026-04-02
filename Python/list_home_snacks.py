import random


def random_numbers():

    for num in range(10):
        numbers = random.randint(1, 50)
        print(numbers)
random_numbers()
print()



def length_of_list():

    numbers = [1, 2, 3, 4, 5, 6, 7]

    for count in numbers:

        count += 1 - 1        

    print("Total numbers of list is ", count)

length_of_list()
print()



def sum_even_elements():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    nums = numbers[0 : : 2]

    print("Total sum even elements of list  :", nums,
"=", sum(nums))
    
sum_even_elements()




def sum_odd_elements():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    total = 0

    nums = numbers[1 : : 2]

    total = sum(nums)

    print("Total sum even elements of list  :", nums,
"=", total)
    

        


def sum_odd_elements():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    total = 1

    nums = numbers[2 : : 3]

    for index in nums:

        total *= index 

    print("Multiplication of third elements of list  :", nums,
"=", total)
        

sum_odd_elements()





def average_of_element():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    average = sum(numbers) / len(numbers)

    print("Average of all elements of list", 
"=", round(average, 2))
        

average_of_element()





def large_element():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    print("Largest number of all elements of list", 
"=", max(numbers))
        

large_element()





def large_element():

    numbers = [1, 2, 11, 13, 3, 4, 5, 6, 7]

    print("Lowest number of all elements of list", 
"=", min(numbers))
        

large_element()
print()


def striing_program():

    list_of_strings = ["faith", "madam", "rose", "mich", "bob"]

    for string in list_of_strings:

        if len(string) >= 2 and string[0] is string[-1]:

            print("Match strings of same first and last characters : ", string)

striing_program()
print()




def sequential():

    random.seed(5)

    for numbers in range(1, 15):

        numbers = random.randint(10, 60)

        print(numbers)



sequential()
print()

def sum_third_elements():

    total = 0

    numbers = [1, 3, 4, 5, 6, 8, 9]

    nums = numbers[2 : : 3]

    total = sum(nums)

    print(total)

sum_third_elements()
print()




def sum_first_middle_last_elements():

    total = 0

    numbers = [1, 3, 4, 5, 6, 8, 9]

    nums = numbers[ : : 3]

    total = sum(nums)

    print(total)

sum_first_middle_last_elements()










