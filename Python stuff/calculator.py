from math import *

num1 = float(input("Enter your first number: "))
op = input("Please choose a calculation: ")
num2 = float(input("Enter your second number: "))
if op == "+":
    print(num1 + num2)
elif op == "-":
    print(num1 - num2)
elif op == "*" or op == "x":
    print(num1 * num2)
elif op == "/": 
    print(num1 / num2)
else:
    print("Not a function supported by this calculator")
        

