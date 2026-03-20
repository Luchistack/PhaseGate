from unittest import TestCase

import level_five

class TestLevelFiveTask(TestCase):

    def test_the_returned_array_is_of_sorted_prime_numbers(self):

        numbers = [5,9,3,6,2]

        actual_result = level_five.sorted_prime_numbers(numbers)

        expected_result = [5,3]

        self.assertEqual(actual_result, expected_result)

    def test_that_all_negative_numbers_are_replaced_in_the_array(self):

        numbers = [5,-9,3,-6,2,-1]

        actual_result = level_five.negative_numbers(numbers)

        expected_result = [5,0,3,0,2,0]

        self.assertEqual(actual_result, expected_result) 

    def test_that_all_zeros_are_moved_to_end_of_the_array_list(self):

        numbers = [5,0,3,0,2,0]

        actual_result = level_five.zero_numbers(numbers)

        expected_result = [5,3,2,0,0,0]

        self.assertEqual(actual_result, expected_result) 

    def test_that_all_common_and_duplicate_numbers__are_found_and_returned(self):

        numbers = [45,60,3,0,67,2,45,3,22,0]

        actual_result = level_five.return_duplicate_numbers(numbers)

        expected_result = [45,3,0]

        self.assertEqual(actual_result, expected_result) 
