package org.cl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxArea_example1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(49, containerWithMostWater.maxArea_solution1(height));
        assertEquals(49, containerWithMostWater.maxArea_solution2(height));
        assertEquals(49, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example2() {
        int[] height = {1, 1};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(1, containerWithMostWater.maxArea_solution1(height));
        assertEquals(1, containerWithMostWater.maxArea_solution2(height));
        assertEquals(1, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example3() {
        int[] height = {3, 2, 1, 2, 3};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(12, containerWithMostWater.maxArea_solution1(height));
        assertEquals(12, containerWithMostWater.maxArea_solution2(height));
        assertEquals(12, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example4() {
        int[] height = {2, 20, 20, 7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(20, containerWithMostWater.maxArea_solution1(height));
        assertEquals(20, containerWithMostWater.maxArea_solution2(height));
        assertEquals(20, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example5() {
        int[] height = {1, 2, 3, 4, 5};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(6, containerWithMostWater.maxArea_solution1(height));
        assertEquals(6, containerWithMostWater.maxArea_solution2(height));
        assertEquals(6, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example6() {
        int[] height = {5, 4, 3, 2, 1};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(6, containerWithMostWater.maxArea_solution1(height));
        assertEquals(6, containerWithMostWater.maxArea_solution2(height));
        assertEquals(6, containerWithMostWater.maxArea_solution3(height));
    }

    @Test
    void maxArea_example7() {
        int[] height = {5, 5, 5, 5};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(15, containerWithMostWater.maxArea_solution1(height));
        assertEquals(15, containerWithMostWater.maxArea_solution2(height));
        assertEquals(15, containerWithMostWater.maxArea_solution3(height));
    }
}