package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if(i < 0) throw new IllegalArgumentException ("I'm sorry, that is an invalid number. Only positives integers allowed.");
        else if(i == 0){
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
