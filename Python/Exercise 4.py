# -*- coding: utf-8 -*-
"""
Created on Wed Jan 29 15:47:35 2020

@author: pc8
"""
print("Exercise 4\n")
cars=100
space=4.0 
drivers=30
passengers=90
notdrivencars=cars-drivers
drivencars=drivers
capacity=drivencars*space
average=passengers/drivencars

print ("There are",cars,"cars available.")
print ("There are only",drivers,"drivers available.")
print ("There will be",notdrivencars, "empty cars today.")
print ("We can transport",capacity,"people today.")
print ("We have",passengers,"to carpool today.")
print ("We need to put about",average,"in each car.")







