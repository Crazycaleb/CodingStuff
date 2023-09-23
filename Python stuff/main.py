for i in range (2, 5):
    for j in range(i):
        if i % j == 0:
            break
    else:
        print(i, end="")