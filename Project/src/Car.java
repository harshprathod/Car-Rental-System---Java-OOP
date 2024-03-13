public class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double calculateRentalPrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailableForRent() {
        return isAvailable;
    }

    public void rentOut() {
        isAvailable = false;
    }

    public void returnCarToInventory() {
        isAvailable = true;
    }
}
