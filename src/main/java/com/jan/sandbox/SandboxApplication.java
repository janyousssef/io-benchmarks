package com.jan.sandbox;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;


@BenchmarkMode({Mode.AverageTime})
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@State(Scope.Thread)
public class SandboxApplication {
    StringBuilder numsString;
    int[] numsArr;
    int SIZE = (int) 5e5;

    public static void main(String[] args) throws Exception {
        Main.main(args);
    }

    @Setup(Level.Iteration)
    public void setup() {
        numsString = new StringBuilder(SIZE);
        numsArr = new int[SIZE];
//        Thread.sleep(3000);
    }

    @Benchmark()
    public void ConsolePrintManyNumber() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + ", ");
        }
    }

    @Benchmark()
    public void StringStoreThenPrintManyNumber() {
        for (int i = 0; i < SIZE; i++) {
            numsString.append(i).append(", ");
        }
        System.out.println(numsString);
    }

    @Benchmark()
    public void ArrayStoreThenPrintManyNumber() {
        for (int i = 0; i < SIZE; i++) {
            numsArr[i] = i;
        }
        System.out.println(Arrays.toString(numsArr));
    }

}
