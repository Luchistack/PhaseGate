#def add_contact(first_name, last_name, phone_number):
#
#    add_new_contact = 0
#
#    first_name = input("Enter First Name: ").lower()
#
#    last_name = input("Enter Last Name: ").lower()
#
#    phone_number = input("Enter Phone Number: ").lower()
#
#    if first_name in first_name and last_name in last_name and phone_number in phone_number:
#
#        add_new_contact += 1
#
#        print("Contact Added Successfully!")
#
#        result = f"{first_name}, {last_name}, {phone_number}"
#        
#        return result



add_new_contact = []


def add_contact(first_name, last_name, phone_number):

        first_name = input("Enter First Name: ").lower()
        add_new_contact.append(first_name)

        last_name = input("Enter Last Name: ").lower()
        add_new_contact.append(last_name)

        phone_number = input("Enter Phone Number: ").lower()
        add_new_contact.append(phone_number)

#        if first_name in first_name and last_name in last_name and phone_number in phone_number:

            print("Contact Added Successfully!") 
       
            return add_new_contact

#     contact =  [first_name.lower(), last_name.lower(), phone_number.lower()]
#     add_new_contact.append(contact)
#     return contact
#
def remove_contact(first_name, last_name, phone_number):

    phone_number = input("Enter a number to delete contact: ")

    if(add_new_contact == phone_number):

        add_new_contact.remove(first_name)

        add_new_contact.remove(last_name)

        add_new_contact.remove(phone_number)

        print("contact removed successfully")
        
    return add_new_contact




#def main():
#
#    add_new_contact = 0
#
#    print("\tPhone Book\n")
#
#    choice = input("""  1. Add Contact
#  2. Remove Contact
#  3. Find Contact BY Phone Number
#  4. Find Contact by First Name
#  5. Find Contact my Last Name
#  6. Edit Contact
#  7. Exit
#   """)
#
#
#    if choice == 1:
#       add_contact(first_name, last_name, phone_number)
#    elif choice == 2:
#        remove_contact(phone_number)
#    elif choice == 3:
#       find_contact_by_phone_number(phone_number)
#    elif choice == 4:
#        find_contact_by_first_name(first_name)
#    elif choice == 5:
#        find_contact_by_last_name(last_name)
#    elif choice == 6:
#        edit_contact(first_name, last_name, phone_number)
    else:
        print("Goodbye...")

#
#
#
#main()        

       
