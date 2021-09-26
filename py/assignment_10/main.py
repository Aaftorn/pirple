"""
This is the eight assignment for the "Python is easy" Pirple course
Made by Balazs Szeidl
"""

from random import random

class Vehicle:
	def __init__(self,Make,Model,Year,Weight):
		self.Make = Make
		self.Model = Model
		self.Year = Year
		self.Weight = Weight
		self.NeedsMaintenance = False
		self.TripsSinceMaintenance = 0
	
	def setMake(self,Make):
		self.Make = Make
	
	def setModel(self,Model):
		self.Model = Model
	
	def setYear(self,Year):
		self.Year = Year
	
	def setWeight(self,Weight):
		self.Weight = Weight
	
	def repair(self):
		self.NeedsMaintenance = False
		self.TripsSinceMaintenance = 0
	
	def __str__(self):
		return ("Make: " + self.Make + "\tModel: " + self.Model + "\tYear: " + str(self.Year) + "\tWeight: " + str(self.Weight) + "\tNeeds Maintenance: " + str(self.NeedsMaintenance) + "\tTrips Since Maintenance: " + str(self.TripsSinceMaintenance))

class Cars(Vehicle):
	def __init__(self,Make,Model,Year,Weight):
		Vehicle.__init__(self,Make,Model,Year,Weight)
		self.isDriving = False
	
	def Drive(self):
		self.isDriving = True
	
	def Stop(self):
		if self.isDriving:
			self.isDriving = False
			self.TripsSinceMaintenance += 1
		else:
			return
		if self.TripsSinceMaintenance>100:
			self.NeedsMaintenance = True

class Planes(Vehicle):
	def __init__(self,Make,Model,Year,Weight):
		Vehicle.__init__(self,Make,Model,Year,Weight)
		self.isFlying = False
	
	def Fly(self):
		if self.NeedsMaintenance:
			print("Can't fly until repair")
			return False
		self.isFlying = True
		return True
	
	def Land(self):
		if self.isFlying:
			self.isFlying = False
			self.TripsSinceMaintenance += 1
		else:
			return
		if self.TripsSinceMaintenance>100:
			self.NeedsMaintenance = True

#-----code below-----

car1 = Cars("Opel","Astra",2015,1280)
car2 = Cars("Mercedes-Benz","C-class",2018,1690)
car3 = Cars("Volkswagen","Beetle",1973,820)

for i in range(250):
	WhichToDrive = random()
	if WhichToDrive > 0.5:
		car1.Drive()
		car1.Stop()
	elif WhichToDrive > 0.2:
		car2.Drive()
		car2.Stop()
	else:
		car3.Drive()
		car3.Stop()

print(car1)
print(car2)
print(car3)
