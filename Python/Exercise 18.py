# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 15:39:36 2020

@author: pc26
"""

def print_two(*args):
    arg1, arg2 = args
    print ("arg1: %r, arg2: %r" % (arg1, arg2))
 # ok, that *args is actually pointless, we can just do this
def print_two_again(arg1, arg2):
    print ("arg1: %r, arg2: %r" % (arg1, arg2))
def print_one(arg1):
    print ("arg1: %r" % arg1)
def print_none():
    print ("I got nothin'.")
print_two("Zed","Shaw")
print_two_again("Zed","Shaw")
print_one("First!")
print_none()
