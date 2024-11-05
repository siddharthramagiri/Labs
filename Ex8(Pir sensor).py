# Red   - 2nd pin
# White - 29th pin
# Green - 30th pin
# Violet- 32nd pin
# Orange- 39th


import RPi.GPIO as GPIO
import time
PIR_PIN=29
LED_PIN=32
GPIO.setwarnings(False)
GPIO.setmode(GPIO.BOARD)
GPIO.setup(PIR_PIN,GPIO.IN)
GPIO.setup(LED_PIN,GPIO.OUT)
GPIO.output(LED_PIN,GPIO.LOW)
try:
    while True:
        if(GPIO.input(PIR_PIN)):
            print("Movement Detected");
            GPIO.output(LED_PIN,GPIO.HIGH)
        else:
            print("Not Detected")
            GPIO.output(LED_PIN,GPIO.LOW)
        time.sleep(1)
except KeyboardInterrupt:
    GPIO.cleanup()