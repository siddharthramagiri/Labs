import RPi.GPIO as GPIO 
import time 

# Pin assignments for the segments of the 7-segment display 
A = 17  # Pin connected to segment A 
B = 18  # Pin connected to segment B 
C = 27  # Pin connected to segment C 
D = 22  # Pin connected to segment D 
E = 23  # Pin connected to segment E 
F = 24  # Pin connected to segment F 
G = 25  # Pin connected to segment G 

# Array to represent numbers 0-9 in 7-segment display format 
digits = [ 
    [1, 1, 1, 1, 1, 1, 0],  # 0 
    [0, 1, 1, 0, 0, 0, 0],  # 1 
    [1, 1, 0, 1, 1, 0, 1],  # 2 
    [1, 1, 1, 1, 0, 0, 1],  # 3 
    [0, 1, 1, 0, 0, 1, 1],  # 4 
    [1, 0, 1, 1, 0, 1, 1],  # 5 
    [1, 0, 1, 1, 1, 1, 1],  # 6 
    [1, 1, 1, 0, 0, 0, 0],  # 7 
    [1, 1, 1, 1, 1, 1, 1],  # 8 
    [1, 1, 1, 1, 0, 1, 1],  # 9 
]

# Setup GPIO 
GPIO.setmode(GPIO.BCM) 
segment_pins = [A, B, C, D, E, F, G] 

for pin in segment_pins: 
    GPIO.setup(pin, GPIO.OUT) 

def display_number(num): 
    # Set each segment based on the number's representation in the array 
    for i in range(7): 
        GPIO.output(segment_pins[i], digits[num][i]) 

try: 
    # Loop through numbers 0 to 9 
    while True: 
        for num in range(10): 
            display_number(num)  # Display the number 
            time.sleep(1)  # Wait for 1 second between numbers
            
except KeyboardInterrupt: 
    pass 

finally: 
    GPIO.cleanup()  # Cleanup GPIO settings
