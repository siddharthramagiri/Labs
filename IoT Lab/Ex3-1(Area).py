# Run a python program on pi to calculate the area of rectangle, triangle, and circle.
shape = input("Enter the shape (rectangle, triangle, circle): ").lower()
if shape == 'rectangle':
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))
    area = length * width
    print("Area of rectangle:", area)
elif shape == 'triangle':
    base = float(input("Enter the base: "))
    height = float(input("Enter the height: "))
    area = 0.5 * base * height
    print("Area of triangle:", area)
elif shape == 'circle':
    radius = float(input("Enter the radius: "))
    area = 3.14159 * radius * radius
    print("Area of circle:", area)
else:
    print("Invalid shape")