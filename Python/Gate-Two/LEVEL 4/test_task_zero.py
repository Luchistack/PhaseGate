from unittest import TestCase

import TaskZero

class TestNumbers(TestCase):

      def test_if_number_is_added_correctly(self):

            actualResult = TaskZero.addition(6, 9)

            self.assertEqual(actualResult, 15)


      def test_total_sum_of_numbers_in_list(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.elements(numbers)

            self.assertEqual(actualResult, 39)



      def test_largest_number_in_the_list(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.largest(numbers)

            self.assertEqual(actualResult, 11)


      def test_largest_number_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.largest_sort(numbers)

            self.assertEqual(actualResult, 11)

      def test_smallest_number_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.smallest_sort(numbers)

            self.assertEqual(actualResult, 4)


      def test_even_number_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.even_numbers(numbers)

            self.assertEqual(actualResult, 4, 8)

      def test_reverse_number_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.reverse_numbers(numbers)

            expectedResult = [11, 9, 8, 7, 4]

            self.assertEqual(actualResult, expectedResult)

      def test_length_of_numbers_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.length_numbers(numbers)

            expectedResult = 5;

            self.assertEqual(actualResult, expectedResult)


      def test_average_of_numbers_in_the_list_sorting(self):

            numbers = [4, 7, 8, 9, 11]

            actualResult = TaskZero.average_numbers(numbers)

            expectedResult = 7.8;

            self.assertEqual(actualResult, expectedResult)
