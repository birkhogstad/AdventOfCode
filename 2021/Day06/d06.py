
DAYS = 256
population = []
popSize = 0

with open("input.txt", 'r') as inp:
    for i in range(0,8):
        population.append(0)
    inp = inp.read()
    fishes = inp.strip("").split(",")  
    for s in fishes:
        population[int(s)] += 1

for days in range(0, DAYS):
    
    nextDay = [0] * 8

    for d in range(0, len(population)):
        day = population[d]
        if d == 0:
            nextDay[6] += population[d]
        nextDay[prev] += population[d]
        prev = d
    population = nextDay.copy()
    
    counter = 0
    for d in population:
        counter += d
print(f"Population count: {counter}  | Day {DAYS}")

