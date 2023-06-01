# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 16:17:09 2020

@author: pc17
"""

from sys import exit
from random import randint 

def death():
    quips = ["You died. You kinda suck at this.",
          "Your mom would be proud. If she were smarter.",
          "Such a luser.",
          "I have a small puppy that's better at this."]
    
    print (quips[randint(0, len(quips)-1)])
    exit(1)

def princess_lives_here():
     print ("You see a beautiful Princess with a shiny crown.")
     print ("She offers you some cake.")
     
eat_it = input("> ")

if eat_it == "eat it":
     print ("You explode like a pinata full of frogs.")
     print ("The Princess cackles and eats the frogs. Yum!") 
     return 'death'

elif eat_it == "do not eat it":
     print ("She throws the cake at you and it cuts off your head.")
     print ("The last thing you see is her munching on your torso. Yum!")
     return 'death' 

elif eat_it == "make her eat it":
    print "The Princess screams as you cram the cake in her mouth."
    print "Then she smiles and cries and thanks you for saving her."
    print "She points to a tiny door and says, 'The Koi needs cake too.'"
    print "She gives you the very last bit of cake and shoves you in."
    return 'gold_koi_pond'

else:
     print "The princess looks at you confused and just points at the cake."
     return 'princess_lives_here'

def gold_koi_pond():
     print "There is a garden with a koi pond in the center."
     print "You walk close and see a massive fin poke out."
     print "You peek in and a creepy looking huge Koi stares at you."
     print "It opens its mouth waiting for food."
     
