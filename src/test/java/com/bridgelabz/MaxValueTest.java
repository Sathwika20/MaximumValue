package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class MaxValueTest {
    @Test
    public void when_first_position_is_greater_should_return_true() {
         MaxValue maxvalue  = new MaxValue();
         String max = maxvalue.givenMaxValue("red","pink","orange");
         Assert.assertEquals("red",max);
    }

    @Test
    public void when_second_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("blue","white","green");
        Assert.assertEquals("white", max);
    }

    @Test
    public void when_third_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("black","purple","yellow");
        Assert.assertEquals("yellow",max);
    }
}