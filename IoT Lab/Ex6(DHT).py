import Adafruit_DHT
import time
import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BCM)
sensor=Adafruit_DHT.DHT22
pin=23

while True:
    humidity, temp = Adafruit_DHT.read_retry(sensor, pin)
    if humidity is None and temp is None:
        print("Failed to get reading. Try again")
    else:
        print("Temp={0:0.1f}*CHumidity={1:0.2f}%".format(temp,humidity))
    time.sleep(1)
    
    
    
    
# DHT22pins   RaspberryPipins
#    +               1
#   out             16
#    -               6