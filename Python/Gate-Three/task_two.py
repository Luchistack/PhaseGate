def largest_array_index(numbers):

    largest = 0
    array_position = 0

    for outterloop in range(len(numbers)):

        for innerloop in range(outterloop):

            if innerloop > largest :

                largest = innerloop

            if outterloop > array_position:

               array_position = outterloop    

               result = largest , array_position

            return result






#def count_numbers_of_specific_letters_in_index():
#
#characters = "AaaBBc"
#
#counter = 0
#
#
#for index in range(len(characters)):
#
#    for letters in characters:
#
#        if letters == "A":
#
#            counter += 1
#
#            return counter
#
#
#
#












