from unittest import TestCase

import levelfourtask

class TestLevelFourTask(TestCase):

    def test_the_sum_of_two_numbers(self):

        Result = levelfourtask.addition(5, 6)

        self.assertEqual(Result, 11)

    def test_the_sum_of_two_numbers_two(self):

        Result = levelfourtask.addition(4, 4)

        self.assertEqual(Result, 8)



    def test_if_number_is_even(self):

        Result = levelfourtask.check_even_number(10)

        self.assertEqual(Result, 1)

    def test_if_number_is_even_two(self):

        Result = levelfourtask.check_even_number(15)

        self.assertEqual(Result, 0)


    def test_square_of_number(self):

        Result = levelfourtask.square_of_number(10)

        self.assertEqual(Result, 100)

    def test_square_of_number_two(self):

        Result = levelfourtask.square_of_number(5)

        self.assertEqual(Result, 25)



    def test_celcuis_to_fahrenheit(self):

        Result = levelfourtask.celcuis_to_fahrenheit(20)

        self.assertEqual(Result, 68.0)


    def test_celcuis_to_fahrenheit_two(self):

        Result = levelfourtask.celcuis_to_fahrenheit(40)

        self.assertEqual(Result, 104.0)


#
#    def test_celcuis_to_fahrenheit(self):
#
#        Result = levelfourtask.check_prime_number(23)
#
#        self.assertTrue(Result, True)
#
#
#    def test_celcuis_to_fahrenheit_two(self):
#
#        Result = levelfourtask.check_prime_number(20)
#
#        self.assertFalse(Result, False)
#

#    def test_check_largest_number(self):
#
#        Result = levelfourtask.check_largest_number(23, 15, 20)
#
#        self.assertEqual(Result, 23)
#
#
#    def test_check_largest_number_two(self):
#
#        Result = levelfourtask.check_largest_number(63, 50, 30)
#
#        self.assertEqual(Result, 63)
#

    def test_simple_interest(self):

        Result = levelfourtask.simple_interest(6, 5, 3)

        self.assertEqual(Result, 0.9)



    def test_simple_interest_two(self):

        Result = levelfourtask.simple_interest(3, 7, 8)

        self.assertEqual(Result, 1.68)


    def test_area_of_rectangle(self):

        Result = levelfourtask.area_of_rectangle(10, 7)

        self.assertEqual(Result, 70)

    def test_area_of_rectangle_two(self):

        Result = levelfourtask.area_of_rectangle(15, 11)

        self.assertEqual(Result, 165)


    def tset_reverse_a_number(self):

        Result = levelfourtask.reverse_a_number(5054)

        self.assertEqual(Result, 4505)
