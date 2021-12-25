## Day 5

I tried out a lot of different methods, but I had a clear idea that I didn't want to create a matrix containing the entire grid, as it seemed to be a 1000 x 1000 grid.

### Solution

I created a list `dicts` containing a dictionary at each element, representing `x`.
When an `x` got a `y`, I added `y` to key-value, and upped the value representing occurances when `currentCord = (x,y)`.
For each line of input I created a loop to navigate from start to end coordinates.
I hope the code is readable:)

### Terminal

To run:
```console
python3 d05.py
```

