package com.tt.leetcode.twosum;

import com.tt.leetcode.BaseTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import twosum.Solution1;

@Test(testName = "TwoSumTest")
public class TwoSumTest extends BaseTest {
    private int[] numbs;
    private int target;

    @BeforeTest
    public void prepare() {
        this.numbs = new int[] { 2, 8, 11, 15, 7 };
        this.target = 9;
    }

    @Test
    public void testWithSolution1() {
        LOGGER.info("Solution 1: 暴力法");
        int[] result = Solution1.twoSum(this.numbs, this.target);
        LOGGER.info("the result indices: {}, {}", result[0], result[1]);
    }

}