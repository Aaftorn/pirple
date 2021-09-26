"""
This is the second assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""
def equal(a,b,c):
	return a==b or a==c or b==c

print(equal("foo","bar",5))
print(equal(10,"something",10))

def advancedEqual(a,b,c):
	return str(a)==str(b) or str(a)==str(c) or str(b)==str(c)

print(advancedEqual("foo","5",5))
print(advancedEqual(True,"True",10))
print(advancedEqual(True,"False",10))

