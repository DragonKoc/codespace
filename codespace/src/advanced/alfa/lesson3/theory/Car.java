package advanced.alfa.lesson3.theory;

class Car {
    public Car getNewCar() {
        return new Car();
    }
}

class SportCar extends Car {
    @Override
    public SportCar getNewCar() {
        return new SportCar();
    }
}