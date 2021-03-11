package com.bridgelabz;

public class MaxValue<T> {
     private T x, y, z;
     public void givenMaxValue(T x, T y, T z) {
         this.x = x;
         this.y = y;
         this.z = z;
     }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setZ(T z) {
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getZ() {
        return z;
    }

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
