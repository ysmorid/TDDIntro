package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if(i < 1){
            return 1;
        }
        else{
            for(int j = i-1; j > 0; j--){
                i *= j;
            }
            return i;
        }

    }
}
