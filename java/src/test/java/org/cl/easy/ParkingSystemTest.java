package org.cl.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    @Test
    void shouldReturnTrue_addCar() {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,1);
        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertTrue(parkingSystem.addCar(3));
    }

    @Test
    void shouldReturnFalse_addCar() {
        ParkingSystem parkingSystem = new ParkingSystem(0,0,0);
        assertFalse(parkingSystem.addCar(1));
        assertFalse(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
    }

    @Test
    void shouldReturnFalse_addCar_forInvalidType() {
        ParkingSystem parkingSystem = new ParkingSystem(0,0,0);
        assertFalse(parkingSystem.addCar(4));
    }
}