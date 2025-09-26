package org.cl.easy;

public class EmployeesMeetingTarget {

    // ---------------------- SOLUTION 1 -----------------------------//
    public int numberOfEmployeesWhoMetTarget_solution1(int[] hours, int target) {
        int employeesMeetingTarget = 0;
        for (int employee : hours) {
            if (employee >= target) {
                employeesMeetingTarget++;
            }
        }
        return employeesMeetingTarget;
    }
    // Time Complexity = 0(n)
    // Space Complexity = 0(1)

    // TODO: Determine other solutions
}
