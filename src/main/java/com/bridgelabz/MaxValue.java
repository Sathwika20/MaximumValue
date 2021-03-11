package com.bridgelabz;

public class MaxValue {
    public static <T extends Comparable<T>> T givenMaxValue(T x, T y, T z) {
        if(x.compareTo(y) > 0) {
            if(x.compareTo(z) > 0) {
                return (x);
            }  else {
                return (z);
            }
        } else if (y.compareTo(z) > 0) {
            return (y);
        } else
            return (z);

    }

}
