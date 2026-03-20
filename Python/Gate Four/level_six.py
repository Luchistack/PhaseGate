def sorted_odd_even_arrays(numbers):
   

    odd_numbers = []

    even_numbers = []

    for number in numbers:

            if number % 2 == 0:
        
                even_numbers.append(number)  
            else:

                odd_numbers.append(number)    

    return [odd_numbers , even_numbers]



def perfect_square_numbers(numbers):

    new_list = []

    for number in numbers:

        count = 1

        while count * count <= number:

            if count * count == number:

                new_list.append(number)

                break

            count += 1

    return sorted(new_list)
