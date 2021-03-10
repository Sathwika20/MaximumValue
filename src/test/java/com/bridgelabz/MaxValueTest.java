package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public  class MaxValueTest {
    @Test
    public void when_first_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(5,1,3);
        Assert.assertEquals(5, max);
    }

    @Test
    public void when_second_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(2,8,3);
        Assert.assertEquals(8,max);
    }
    @Test
    public void when_third_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        int max = maxValue.givenMaxValue(2,3,9);
        Assert.assertEquals(9,max);
    }

    @Test
    public void when_first_position_Float_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        Float max = maxValue.givenMaxValue(5f,1f,3f);
        Assert.assertEquals(5f, max,0f);
    }

    @Test
    public void when_second_Float_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        Float max = maxValue.givenMaxValue(2f,3f,1f);
        Assert.assertEquals(3f,max,0f);
    }
    @Test
    public void when_third_Float_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        Float max = maxValue.givenMaxValue(3f,4f,5f);
        Assert.assertEquals(5f,max,0f);
    }
    @Test
    public void when_first_position_String_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("red","green","orange");
        Assert.assertEquals("red",max);
    }

    @Test
    public void when_second_String_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("pink","white","purple");
        Assert.assertEquals("white",max);
    }
    @Test
    public void when_third_String_position_is_greater_should_return_true() {
        MaxValue maxValue = new MaxValue();
        String max = maxValue.givenMaxValue("black","cream","yellow");
        Assert.assertEquals("yellow",max);
    }

}