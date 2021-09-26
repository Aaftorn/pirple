"""
This is the eight assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""
import os

noteFileName = input("Please enter the filename: ")

if os.path.exists(noteFileName):
	mode = input("Please enter mode (read: r; empty and rewrite: w; append: a): ")
	noteFile = open(noteFileName,mode)
	if mode=="r":
		print(noteFile.read())
	else:
		noteFile.write(input("Please enter your note:\n") + "\n")
else:
	noteFile = open(noteFileName,"w")
	noteFile.write(input("Please enter your note to begin the new file:\n") + "\n")
noteFile.close()