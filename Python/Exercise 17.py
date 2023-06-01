# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 15:32:59 2020

@author: pc8
"""

from sys import argv
from os.path import exists
script=argv
from_file=argv
to_file=argv
print("Copying from %s to %s" % (from_file, to_file)) 
# we could do these two on one line too, how? 
input=open(from_file) 
indata=input.read()
print("The input file is %d bytes long" % len(indata))
print("Does the output file exist? %r" % exists(to_file)
print("Ready, hit RETURN to continue, CTRL-C to abort.")
output=open(to_file, 'w')
output.write(indata)
print("Alright, all done.")
output.close()
input.close()