"""
This is the fourth assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""

myUniqueList = []
myLeftovers = []

def addThings(thing):
	if thing in myUniqueList:
		myLeftovers.append(thing)
		return False
	myUniqueList.append(thing)
	return True

print(addThings(10))
print(addThings("something"))
print(addThings(8.5))
print(addThings(10))
print(addThings("other thing"))
print(addThings("other thing"))
print(addThings("third string"))
print(addThings("something different"))
print(addThings(8.5))
print(addThings(10))
print(addThings(10))

print(myUniqueList)
print(myLeftovers)
