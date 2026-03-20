from unittest import TestCase

import level_six

class TestLevelSixTask(TestCase):

    def test_that_array_is_of_spilt_into_even__and_odd_arrays(self):

        numbers = [45,60,3,10,9,22]

        actual_result = level_six.sorted_odd_even_arrays(numbers)

        expected_result = [[45,3,9],[60,10,22]]

        self.assertEqual(actual_result, expected_result)

    def test_that_all_perfect_square_numbers_in_the_array_are_printed(self):

        numbers = [45, 7, 9, 10, 16, 18, 4]

        actual_result = level_six.perfect_square_numbers(numbers)

        expected_result = [4,9,16]

        self.assertEqual(actual_result, expected_result) 

#    def test_that_all_zeros_are_moved_to_end_of_the_array_list(self):
#
#        numbers = [5,0,3,0,2,0]
#
#        actual_result = level_five.zero_numbers(numbers)
#
#        expected_result = [5,3,2,0,0,0]
#
#        self.assertEqual(actual_result, expected_result) 
#
#    def test_that_all_common_and_duplicate_numbers__are_found_and_returned(self):
#
#        numbers = [45,60,3,0,67,2,45,3,22,0]
#
#        actual_result = level_five.return_duplicate_numbers(numbers)
#
#        expected_result = [45,3,0]
#
#        self.assertEqual(actual_result, expected_result) 
