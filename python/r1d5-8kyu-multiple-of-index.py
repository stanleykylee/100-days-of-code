def multiple_of_index(arr):
    multiples = [arr[1]]
    for i in range(2, len(arr)):
        if((arr[i] % i) == 0):
            multiples.append(arr[i])
    return multiples