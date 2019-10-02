def insertionsort(arr):
    for i in range(1,len(arr)):
        key = arr[i]
        j=i-1
        while j>=0 and arr[j]>key:
            arr[j+1] = arr[j]
            j = j-1
                
                
        arr[j+1]=key        k
    
# average case    

print(' # # # # average case # # # #')
for i in range(1,6):

    f = open("File{}.txt".format(i),"r")
    import time
    lst=[]
    for l in f.readlines():
        lst.append(int(l))
    s=time.time()
    insertionsort(lst)
    t=time.time()
    print((t-s)*1000)

# best case
print(' # # # # best case # # # #')
for i in range(1,8):

    f = open("File{}.txt".format(i),"r")
    import time
    lst=[]
    for l in f.readlines():
        lst.append(int(l))
    lst.sort()    
    s=time.time()
    insertionsort(lst)
    t=time.time()
    print((t-s)*1000)

# worst case
print(' # # # # worst case # # # #')
for i in range(1,4):

    f = open("File{}.txt".format(i),"r")
    import time
    lst=[]
    for l in f.readlines():
        lst.append(int(l))
    lst.sort(reverse=True)    
    s=time.time()
    insertionsort(lst)
    t=time.time()
    print((t-s)*1000)


n = gf jhsgdf sdjgfjyefg kdsgfjs
