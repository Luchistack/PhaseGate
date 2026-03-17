

numb = int(input("Enter a Number: "))

times = 0

result = 0

for number in range(1, 13):

    times = numb * number

    result = f"{numb} X {number} = {times}"

    print(result)

