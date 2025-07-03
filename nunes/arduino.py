from pyfirmata import Arduino
import time #biblioteca de tempo

# porta de comunicação do arduino
arduino = Arduino('COM1')

#pino digital onde o local esta conectado
led = arduino.digital[6]
led2 = arduino.digital[5]
led3 = arduino.digital[3]

# tempo de espera em segundos / no caso esperar 1 segundo
time.sleep(1) 

opcao = int(input("Escolha o led a ser ligado"))

if opcao == 1:
    led2.wite(2)
elif opcao == 3:
    led3.write(3)

while True: 
    led.write(1) # Rigth - 1 (ligar )
    time.sleep(2)

    led.write(0) # Low - 0 ( desligar )
    time.sleep(2)