from unittest import TestCase

import contact_app

class TestContactApp(TestCase):

        def test_that_contact_details_is_added(self):

            first_name = "john"

            last_name = "deo"

            phone_number = "07080100701"

            actual_result = contact_app.add_contact(first_name, last_name, phone_number)

            expected_result = ["john", "deo", "07080100701"]

            self.assertEqual(actual_result, expected_result)

#

        def test_that_contact_details_is_removed(self):

            first_name = "john"

            last_name = "deo"

            phone_number = "07080100701"

            actual_result = contact_app.remove_contact(first_name, last_name, phone_number)

            self.assertTrue(actual_result)



#        def test_that_contact_details_is_found(self):
#
#            first_name = "john"
#
#            last_name = "deo"
#
#            phone_number = "07080100701"
#
#            actual_result = contact_app.search_contact(first_name, last_name, phone_number)
#
#            expected_result = "john" "deo", "07080100701"
#
#            self.assertEquals(actual_result, expected_result)
#
#







