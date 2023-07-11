def sortedArray(a: [int], b: [int]) -> [int]:
    c=a + b
    c.sort()
    e=[]
    for i in range(0,len(c)-1):
        if (c[i] != c[i+1]):
            e.append(c[i])
    e.append(c[len(c)-1])
    return e
    pass
