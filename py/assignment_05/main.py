"""
This is the fourth assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""
def prime(p):
	if p==1:
		return False
	for i in range(2,p):
		if p%i==0:
			return False
	return True

for i in range(1,101):
	if prime(i):
		print("Prime")
	elif i%15==0:
		print("FizzBuzz")
	elif i%3==0:
		print("Fizz")
	elif i%5==0:
		print("Buzz")
	else:
		print(i)
	
