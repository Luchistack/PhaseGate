numb = int(input("Enter a Number: "))

total = 0

for number in range(1,numb + 1):

    total = number + number

    result = f"{number} + {number} = {total}"
    
    print(result)



