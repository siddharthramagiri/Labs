# Pins:
# Red wire of motor - 2
# Brown wire of motor - 6
# Orange wire of motor - 8


import RPi.GPIO as GPIO
import time
# Define the GPIO pin for the servo

SERVO_PIN = 18 # Change this to your GPIO pin
# Setup GPIO
GPIO.setmode(GPIO.BCM)
GPIO.setup(SERVO_PIN, GPIO.OUT)


# Create a PWM instance with a frequency of 50Hz
pwm = GPIO.PWM(SERVO_PIN,50)
pwm.start(0) # Start with a duty cycle of 0
GPIO.setwarnings(False)

def set_angle(angle):
    # Convert angle to duty cycle
    duty_cycle = (angle / 18) + 2
    pwm.ChangeDutyCycle(duty_cycle)
    time.sleep(1) # Allow time for the servo to reach the position
    pwm.ChangeDutyCycle(0) # Stop sending signal to prevent jitter
    
try:
    while True:
        set_angle(90) # Move to 0 degrees
        time.sleep(0.5)
        set_angle(135) # Move to 135 degrees
        time.sleep(0.5)
        set_angle(180) # Move to 270 degrees
        time.sleep(0.5)
        
except KeyboardInterrupt:
    pass # Exit on Ctrl+C

finally:
    pwm.stop() # Stop the PWM
    GPIO.cleanup() # Clean up GPIO pins