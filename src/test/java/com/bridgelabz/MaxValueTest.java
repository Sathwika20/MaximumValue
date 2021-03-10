package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class MaxValueTest {
    @Test
    public void when_first_position_is_greater_should_return_true() {
         MaxValue maxvalue  = new MaxValue();
         int max = maxvalue.givenMaxValue(4,3,2);
         Assert.assertEquals(4, max);
    }

    @Test
    public void when_second_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(1,5,3);
        Assert.assertEquals(5, max);
    }

    @Test
    public void when_third_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(2,3,8);
        Assert.assertEquals(8,max);
    }
}