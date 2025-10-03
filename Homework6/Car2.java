package Homework6;

public class Car2 {
    String model;
    private Manufacturer manufacturer;
    int productionYear;
    double engineSize;
    private String fuelType;
    private double price;

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", manufactruer=" + manufacturer +
                ", productionYear=" + productionYear +
                ", engineSize=" + engineSize +
                ", fuelType='" + fuelType + '\'' +
                ", price=" + price +
                '}';
    }

    public Car2(String model, int productionYear, double engineSize) {
        this.model = model;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

     public void setManufacturer(Manufacturer manufacturer) {
         this.manufacturer = manufacturer;
     }

     public void setFuelType(String fuelType) {
         this.fuelType = fuelType;
     }

     public void setPrice(double price) {
         this.price = price;
     }
 }
