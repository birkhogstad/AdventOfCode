f = open("input.txt", "r")

positions = list(map(int, f.read().split(",")))

positions.sort()


median = positions[int(len(positions) / 2)]
total = 0
for pos in positions:
    total += max(median, pos) - min(median, pos)
print("TASK 1:  " + str(total))




average = 0
for pos in positions:
    average += pos

alignPos = int(average / len(positions))
print(alignPos)



# Starting at values in each end of the sorted input
firstPos = positions[0]
lastPos = positions[len(positions) - 1]

# Indexes to keep track on position in inputlist
firstIndex = 0
lastIndex = len(positions) - 1

# Variables to compare cost of moving inwards
firstCost = 0
lastCost = 0

# Variables to track number of crabs moving inwards, which will affect cost
firstCounter = 0
lastCounter = 0

# Total cost of moving the crabs
spent = 0

# While not aligned:
while lastPos + 1 != firstPos - 1:
    # If the cost of moving first backwards is less or equal to move last forwards:
    if firstCost <= lastCost:
        spent += firstCost
        # Adding crabCount from crabList
        while (firstPos == positions[firstIndex]):
            firstCounter += 1
            firstIndex += 1
        # Calculating the new cost to move backwards
        firstCost += firstCounter
        firstPos += 1
    else:
        spent += lastCost
        while (lastPos == positions[lastIndex]):
            lastCounter += 1
            lastIndex -= 1
        lastCost += lastCounter 
        lastPos -= 1

print("TASK 2:  " + str(spent))
    