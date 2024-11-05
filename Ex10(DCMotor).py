import RPi.GPIO as GPIO
from time import sleep
GPIO.setmode(GPIO.BCM)
DcPin = 4
buttonPin = 17
GPIO.setup(DcPin, GPIO.OUT)
GPIO.setup(buttonPin, GPIO.IN, pull_up_down=GPIO.PUD_UP)
while True:
    GPIO.output(DcPin, GPIO.input(buttonPin))
    sleep(0.1)