package org.example;

import java.util.function.Function;

public class Problem4 {

    Function<Integer, Integer> inc = (value) -> value+1;
    Function<Integer, Integer> square = (value) -> value*value;
    Function<Integer, Integer> compose = square.compose(inc);


}
