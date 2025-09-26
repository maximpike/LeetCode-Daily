package org.cl.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesMeetingTargetTest {

    EmployeesMeetingTarget employeesMeetingTarget;

    @BeforeEach
    void setUp() {
    employeesMeetingTarget = new EmployeesMeetingTarget();
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_example1() {
        int[] hours = new int[]{0, 1, 2, 3, 4};
        int target = 2;
        assertEquals(3, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_example2() {
        int[] hours = new int[]{5, 1, 4, 2, 2};
        int target = 6;
        assertEquals(0, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_withMinHoursAndMinTarget() {
        int[] hours = new int[]{0, 0, 0};
        int target = 0;
        assertEquals(3, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_minEmployees() {
        int[] hours = new int[]{10};
        int target = 10;
        assertEquals(1, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }


    @Test
    void testNumberOfEmployeesWhoMetTarget_withMaxHoursAndMaxTarget() {
        int[] hours = new int[]{105,44,76,88,105,2,105};
        int target = 105;
        assertEquals(3, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }

    @Test
    void testNumberOfEmployeesWhoMetTarget_maxEmployees() {
        Random random = new Random(25);
        int target = 35;
        int[] hours = new int[50];
        for (int i = 0; i < hours.length; i++) {
            hours[i] = random.nextInt(0,106);
        }
        System.out.println(Arrays.toString(hours));

        int expected = groundTruthEmployeesMeetingTarget(hours, target);
        assertEquals(expected, employeesMeetingTarget.numberOfEmployeesWhoMetTarget_solution1(hours, target));
    }

    private int groundTruthEmployeesMeetingTarget(int[] hours, int target) {
        int employeesMeetingTarget = 0;
        for (int employee : hours) {
            if (employee >= target) {
                employeesMeetingTarget++;
            }
        }
        return employeesMeetingTarget;
    }
}