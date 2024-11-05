# Run a python program on pi to demonstrate file operations
file_name = "sample.txt"
# Write to file
with open(file_name, 'w') as file:
    file.write("Hello, this is a sample file written using Python on Raspberry Pi\n")
# Read from file
with open(file_name, 'r') as file:
    content = file.read()
    print("File content:", content)