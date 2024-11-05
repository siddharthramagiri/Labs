# Pins – 6 , 11 , 12
from gpiozero import LED
import time
# Get the sleep duration from the user
K = int(input("sleep for: "))
# Define two LEDs connected to GPIO 18 and GPIO 17
l1 = LED(18)
l2 = LED(17)
# Infinite loop to control the LEDs
while True:
    l1.on()
    time.sleep(K)
    l1.off()
    time.sleep(K)

    l2.on()
    time.sleep(K)
    l2.off()
    time.sleep(K)

    l1.on()
    l2.on()
    time.sleep(K)

    l1.off()
    l2.off()
    time.sleep(K)