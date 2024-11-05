# Pins – 3 (+ terminal of LED) , 6 (- terminal of LED)

from flask import Flask, render_template
import RPi.GPIO as GPIO
app = Flask(__name__)
# GPIO setup
GPIO.setmode(GPIO.BCM)
led_pin = 3
GPIO.setup(led_pin, GPIO.OUT)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/led/on')
def led_on():
    GPIO.output(led_pin, GPIO.HIGH)
    return "LED is ON"

@app.route('/led/off')
def led_off():
    GPIO.output(led_pin, GPIO.LOW)
    return "LED is OFF"

if __name__ == '_main_':
    app.run(debug=True, port=3030)