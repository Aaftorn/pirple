"""
This is the fourth assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""
maxc=15
maxr=20

def table(c,r):
	if c>maxc or r>maxr:
		return False
	for i in range(0,r):
		for j in range(0,c-1):
			print(" |",end="")
		print(" ")
		if i<r-1:
			for j in range(0,c-1):
				print("--",end="")
			print("-")
	return True


print("table 4x7")
table(4,7)

print("table 8x8")
table(8,8)

print("table 20x20")
table(20,20)

print("table 11x3")
table(11,3)
	
