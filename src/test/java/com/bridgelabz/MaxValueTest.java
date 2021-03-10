package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class MaxValueTest {
    @Test
    public void when_first_position_is_greater_should_return_true() {
         MaxValue maxvalue  = new MaxValue();
         int max = maxvalue.givenMaxValue(7,5,3);
         Assert.assertEquals(7,max);
    }

    @Test
    public void when_second_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(1,5,2);
        Assert.assertEquals(5,max);
    }

    @Test
    public void when_third_position_is_greater_should_reurn_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(1,2,3);
        Assert.assertEquals(3,max);
    }
}