from unittest import TestCase

import task_two

class TestTaskTwo(TestCase):

    def test_number_of_alphabeth_in_a_string(self):

        characters = "AaaBBc"

        actualResult = task_two.largest_array_index(characters)

        expectedResult = "A1a2B2C1"

        self.assertEqual(actualResult, expectedResult)


    def test_largest_number_in_two_d_array(self):

        numbers = [ [45.2, 90.28, 77.1],
                    [3.52, 9.86, 11.77],
                    [77.1, 10, 22.33, 12]
                    ]

        actualResult = task_two.largest_array_index(numbers)

        expectedResult = 0, 1

        self.assertEqual(actualResult, expectedResult)

