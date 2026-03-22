from unittest import TestCase

import weekend_snacks

class TestWeekendSnacks(TestCase):

       def test_numbers_in_array_list_returns_even_numbers(self):

            numbers = [3,2,5,7,8,9,6]

            actual_result = weekend_snacks.count_even(numbers)

            expected_result = [2, 8, 6]

            self.assertEqual(actual_result, expected_result)


       def test_numbers_in_array_list_returns_index_of_target(self):

            numbers = [3,2,5,7,8,9,6]

            target = 7

            actual_result = weekend_snacks.linear_search(numbers)

            expected_result = 3 or -1

            self.assertEqual(actual_result, expected_result)


       def test_numbers_in_array_list_return_sqaure_of_number(self):

            number = 5

            actual_result = weekend_snacks.squares(number)

            expected_result = [1, 4, 9, 16, 25]

            self.assertEqual(actual_result, expected_result)


       def test_numbers_in_array_list_return_true_if_number_is_same_length_and_value(self):

            list1 = [7,9,3,4,2]
            
            list2 = [6, 5, 6, 7, 8, 6]

            actual_result = weekend_snacks.arrays_equals(list1, list2)

            expected_result = False

            self.assertFalse(actual_result, expected_result)


       def test_numbers_in_array_list_return_a_new_list_with_duplicates_removed(self):
            
            numbers = [6, 5, 6, 7, 5, 8]

            actual_result = weekend_snacks.remove_duplicate(numbers)

            expected_result = [6, 5, 7, 8]

            self.assertEqual(actual_result, expected_result)



       def test_flatten_array_is_converted_from_2D_to_1D(self):
            
            numbers = [[6, 5, 7, 5],
                          [4, 7, 3, 1, 2]
                          ]

            actual_result = weekend_snacks.flatten(numbers)

            expected_result = [6, 5, 7, 5, 4, 7, 3, 1, 2]
                          

            self.assertEqual(actual_result, expected_result)

       def test_numbers_in_array_list_return_a_new_list_with_not_duplicated_numbers(self):
            
            array_list = [6, 5, 6, 7, 5, 8]

            array_list2 = [6, 9, 1, 5]

            actual_result = weekend_snacks.insert_of(array_list,array_list2 )

            expected_result = [7, 8, 9, 1]

            self.assertEqual(actual_result, expected_result)


