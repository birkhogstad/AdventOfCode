dicts = []     
roofIndex = 0
with open("input.txt", "r") as input:
    for i in input:
        strCords = i.strip("\n").replace(' -> ', ',').split(",")
        cords = []
        for i in strCords:
            cords.append(int(i))

        #Adding dictionaries to 'dicts' while x-cords bigger than current highest
        if max(cords[0], cords[2]) + 1 > roofIndex:
            roofIndex = max(cords[0], cords[2]) + 1
            while len(dicts) < roofIndex:
                dicts.append({})



        x = cords[0]
        xIter = 1
        if cords[0] >= cords[2]:
            xIter -= 1
            if cords[0] != cords[2]:
                xIter -= 1
        
        y = cords[1]
        yIter = 1
        if cords[1] >= cords[3]:
            yIter -= 1
            if cords[1] != cords[3]:
                yIter -= 1

        while x != cords[2] + xIter or y != cords[3] + yIter:
            if y in dicts[x].keys():
                dicts[x][y] = dicts[x][y] + 1
            else:
                dicts[x][y] = 1
            x += xIter
            y += yIter

    
overlaps = 0
for x in dicts:
    for y in x:
        if x[y] > 1:
            overlaps += 1
print("Total overlaps:  " + str(overlaps))
                    

        
