public class Rental {
    private Car rentedCar;
    private Customer rentingCustomer;
    private int rentalDays;

    public Rental(Car rentedCar, Customer rentingCustomer, int rentalDays) {
        this.rentedCar = rentedCar;
        this.rentingCustomer = rentingCustomer;
        this.rentalDays = rentalDays;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public Customer getRentingCustomer() {
        return rentingCustomer;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}
