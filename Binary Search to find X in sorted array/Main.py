def search(nums: [int], target: int):
    first = 0;
    last = len(nums)-1;
    m = (first+last) // 2;
    a = 0;
    while(first<=last):
        if nums[m] == target:
            a=m;
            break;
        elif nums[m] < target :
            first = m+1;
        else :
            last = m-1;
        m=(first+last) // 2;
    if(first>last):
        a = -1;
    return a;
    pass
