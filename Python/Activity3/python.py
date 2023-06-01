import math
name=""
year=""
midgrade=0
tengrade=0
value=0
fingrade=0.0
name=input ("Enter Your Name: ")
year=input ("Enter Your Year and Course: ")
midgrade=int(input ("Enter Midterm Grade: "))
tengrade=int(input ("Enter Final Tentative Grade: "))
tenmidgrade=midgrade*0.4
tenfingrade=tengrade*0.6
fingrade=tenmidgrade+tenfingrade
print ("Your Final Grade is")
print (int(fingrade))
if fingrade>=90 and value<=98: print("Remarks: A");
elif fingrade>=85 and value<=89: print("Remarks: B");
elif fingrade>=80 and value<=84: print("Remarks: C");
elif fingrade>=75 and value<=79: print("Remarks: D");
else: print("Remarks: Failed");

    

 
