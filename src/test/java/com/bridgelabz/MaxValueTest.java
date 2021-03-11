package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class MaxValueTest {
    @Test
    public void when_three_integers_given_return_max_value() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(5,1,3);
        Assert.assertEquals(5, max);
    }
    @Test
    public void when_three_Floats_given_return_max_value() {
        MaxValue maxValue = new MaxValue();
        Float max = maxValue.givenMaxValue(5f,1f,3f);
        Assert.assertEquals(5f, max,0f);
    }
    @Test
    public void when_three_Strings_given_should_return_max_value() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("red","green","orange");
        Assert.assertEquals("red",max);
    }
}