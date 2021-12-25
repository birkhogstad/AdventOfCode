## Day 1

A slow and easy start for the month! The solution was pretty straight forward, and as it was a busy day I just wanted to solve it quickly in Java

### Solution

Task 1 I find pretty self explanatory, as I took the `i` integer and compared with the `prev`
For Task 2, I created an array of 3 elements. For each iteration, instead of comparing integers `[a,b,c]` with `[b,c,d]`, I solved it by comparing `a` and `d`. Then I replaced `a` with `d` in the array.

I also solved these tasks as my first try at rust! As this was a first take on rust, there is most likely some interesting decisions taken, but I made it work! I had to "cheat" and write `2000`, number of lines in `input.txt`, instead of the variable `size`, as I did not find a proper solution...


### Terminal

To run:

java - ```javac d01.java && java d01<input.txt ```