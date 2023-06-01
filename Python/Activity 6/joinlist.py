import itertools
new_List=[]
my_List=['Chino', 'Yuri', 'Anu', 'Saika', 'Michelle', 'Logan', 'Andre', 'Alyanah', 'Silas', 'Anna']
my_Numbers=[1,2,3,4,5,6,7,8,9,10]
print (list(itertools.chain.from_iterable(zip(my_Numbers, my_List))))
