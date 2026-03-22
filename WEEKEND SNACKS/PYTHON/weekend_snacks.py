def count_even(numbers):

    new_list = []

    for number in numbers:

        if number % 2 == 0:

           new_list.append(number)

    return new_list


def linear_search(numbers):

    target = 7

    if numbers == []:
        return -1

    for index in range(len(numbers)):

        if numbers[index] == target:
    
            return index


def squares(number):

    new_list = []

    square = 0

    if number <= 0:
        return []

    for counter in range(1, number + 1):

        square = counter * counter

        new_list.append(square)


    return new_list
    
def arrays_equals(list1, list2):

    length1 = len(list1)
    length2 = len(list2)

    if list1 and list2 == 0:
       return []

    for index in range(len(list1)):

        for index in range(len(list2)):

            if list1[index] == list2[index] and length1 == length2:
                
                return True

            else:
                return False



def remove_duplicate(numbers):

    new_list = []


    for index in range(len(numbers)):

        if numbers[index] not in new_list:

           new_list.append(numbers[index])

    return new_list


def flatten(numbers):

    flatten_list = []

    for lists in numbers:

       for index in lists:

            flatten_list.append(index)

    return flatten_list



def insert_of(array_list,array_list2):

    if array_list == [] and array_list2 == []:

        return -1

    new_list = []

    for num in array_list:

        if num not in array_list2 and num not in new_list :

            new_list.append(num)

    for num in array_list2:

        if num not in array_list and num not in new_list :

            new_list.append(num)

    return new_list



