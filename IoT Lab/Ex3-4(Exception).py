# Run a python program on pi to demonstrate handle Divide by Zero Exception
try:
    num = int(input("Enter a number: "))
    result = 10 / num
    print("Result:", result)
except ZeroDivisionError:
    print("Error: Division by zero is not allowed")