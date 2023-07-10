from typing import *

def getSingleElement(arr : List[int]) -> int:
    x=0;
    for i in range(0,len(arr)):
        x=x^arr[i]

    return x
    pass