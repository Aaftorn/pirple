"""
This is the seventh assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""

Songdata = {"Title":"Hard Rock Halleluja","Artist":"Lordi","ReleaseYear":2006,"Genre":"Rock","Duration":4.09,"Country":"Finland","HasVideo":"yes","Album":"The Arockalypse","EurovisionPlace":1,"UKSinglesPeakPosition":25}

def guessSongdata():
	songkey = input("Input the key: ")
	songvalue = input("Input the value: ")
	if songkey in Songdata and songvalue == Songdata[songkey]:
		print("yes")
		return True
	print("no")
	return False

for i in Songdata:
	print(i + ": " + str(Songdata[i]))


wannaPlay = True

while wannaPlay:
	wannaPlay = guessSongdata()
	
