# IO Benchmarks
Benchmark different IO methods using JMH to illustrate the overhead IO can have.    

## Motivation
I created this project becuase I wanted to learn JMH and to see the effect IO can really have.  

## How to Run
For some reason the project can't be run from CMD using Maven commands, it must be opened in IntelliJ and ran using the run button, this is possibly a Maven bug.

## Code Description
 - Warm up the JVM using JMH to guarantee code is compiled by the JIT.
 - There are 3 methods that print 1..N in the exact same format,   
   each method differs in how/when numbers are stored and printed.
 - Run each method a specified number of times (more runs = less statistical noise, more time taken).
 - JMH will print the result.
 

## Experience Gained 
- Learned how to becnhmark Java using JMH.
 
