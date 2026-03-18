from unittest import TestCase

import task_one

class TestGateThreeTask(TestCase):


    def test_result_of_array_list_and_number_length_and_print_new_list_with_given_length_one(self):

        numbers = [10, 11, 12]

        actualResult = task_one.add_length(numbers)

        expectedResult = [10, 11, 12, -1, -1]

        self.assertEqual(actualResult, expectedResult)



    def test_result_of_array_list_and_number_length_and_print_new_list_with_given_length_two(self):

        numbers = [10, 11, 12, 13, 14]

        actualResult = task_one.array_number_length(numbers)

        expectedResult = [10, 11]

        self.assertEqual(actualResult, expectedResult)



    def test_result_of_array_list_and_number_length_and_print_new_list_with_given_length_two(self):

        numbers = [ ]

        actualResult = task_one.array_number_length(numbers)

        expectedResult = [-1, -1, -1, -1]

        self.assertEqual(actualResult, expectedResult)


#
#    def test_result_of_array_list_and_number_length_and_print_new_list_with_given_length_two(self):
#
#        new_numbers = [10,11,12,13,14]
#
#        length = 2
#
#        actualResult = task_one.array_number_length(numbers)
#
#        expectedResult = [10, 11]
#
#        self.assertEqual(actualResult, expectedResult)
