package org.cl.easy;

public class FindClosestPerson {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int findClosest_solution1(int x, int y, int z) {

        int dir_x = Math.abs(z - x);
        int dir_y = Math.abs(z - y);

        if (dir_x < dir_y) {
            return 1; // Person 1 is closer
        } else if (dir_y < dir_x) {
            return 2; // Person 2 is closer
        } else {
            return 0; // Both Person 1 & Person 2 are equal distances away
        }
    }
    // Time Complexity = 0(1) - Time is constant no matter input data size
    // Space Complexity = 0(1) - Use a fixed number of variables. Aux space also 0(1)

    // ---------------------- SOLUTION 2 - Code style refinement -----------------------------//
    public int findClosest_solution2(int x, int y, int z) {
        int dx = Math.abs(z - x);
        int dy = Math.abs(z - y);
        return dx < dy ? 1 : dx > dy ? 2 : 0;
        // Time Complexity = 0(1)
        // Space Complexity = 0(1)
    }
}
