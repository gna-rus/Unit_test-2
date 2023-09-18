package seminars.second.hw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    @BeforeAll
    public static void TestStart() {
        System.out.println("Test start");
    }

    @AfterAll
    public static void TestFinal() {
        System.out.println("Test end");
    }

    @AfterEach
    public void FlagEveryTest() {
        System.out.println("Test status: OK");

    }
    // тест на то что объект Car является экземпляром класса транспортного средства
    @Test
    public void testCarIsInstanseOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2012);
        assertTrue(car instanceof Vehicle);
    }

    // Тест на количество колес Car
    @Test
    public void testCarNumWheels() {
        Car car = new Car("Dodge", "Ram", 2012);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // Тест на количество колес Motorcycle
    @Test
    public void testMotorcycleNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "Xi", 2015);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // Тест на скорост в тестовом режиме Car
    @Test
    public void testCarTestDrive() {
        Car car = new Car("Dodge", "Ram", 2012);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // Тест на скорост в тестовом режиме Motorcycle
    @Test
    public void testMotorcycleTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "Xi", 2015);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // Тест на полную остановку в режиме парковки после тестового режима Car
    @Test
    public void testCarParkAfterTestDrive() {
        Car car = new Car("Dodge", "Ram", 2012);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // Тест на полную остановку в режиме парковки после тестового режима Motorcycle
    @Test
    public void testMotorcycleParkAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "Xi", 2015);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}


