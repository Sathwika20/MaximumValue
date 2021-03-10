package com.bridgelabz;

public class MaxValue {
    public static String givenMaxValue(String x, String  y, String z) {
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
