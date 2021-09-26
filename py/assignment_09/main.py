"""
This is the eight assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""

from os import system

Board = [[" "," "," "," "," "," "," "],[" "," "," "," "," "," "," "],[" "," "," "," "," "," "," "],[" "," "," "," "," "," "," "],[" "," "," "," "," "," "," "],[" "," "," "," "," "," "," "]]
nextPlayer = True

def drawBoard():
	system('cls')
	print("Welcome to Connect Four!\n\n 1 2 3 4 5 6 7\n---------------\n|",end="")
	for i in range(6):
		for j in range(7):
			print(Board[i][j],end="|")
		print("\n---------------\n|",end="")
	print("             |\n|Next player:"+("1" if nextPlayer else "2")+"|\n|             |\n---------------\n\n")

def won():
	#check rows
	for i in range(6):
		for j in range(4):
			if Board[i][j]==Board[i][j+1]==Board[i][j+2]==Board[i][j+3]!=" ":
				return True
	#check cols
	for i in range(3):
		for j in range(7):
			if Board[i][j]==Board[i+1][j]==Board[i+2][j]==Board[i+3][j]!=" ":
				return True
	#check diag/
	for i in range(3):
		for j in range(6,2,-1):
			if Board[i][j]==Board[i+1][j-1]==Board[i+2][j-2]==Board[i+3][j-3]!=" ":
				return True
	#check diag\
	for i in range(3):
		for j in range(4):
			if Board[i][j]==Board[i+1][j+1]==Board[i+2][j+2]==Board[i+3][j+3]!=" ":
				return True
	return False

def nextStep():
	global nextPlayer
	if won():
		return True
	column = int(input("Please state Your column: "))-1
	for i in range(5,-1,-1):
		if Board[i][column] == " ":
			Board[i][column] = "1" if nextPlayer else "2"
			nextPlayer = not nextPlayer
			break
	return False

while True:
	drawBoard()
	if nextStep():
		break

print("Congratulations Player "+("2" if nextPlayer else "1")+"!")