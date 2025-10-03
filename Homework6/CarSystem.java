package Homework6;

public class CarSystem {
    public static void main(String[] args) {
        Manufacturer manufact1 = new Manufacturer(1925);
        Manufacturer manufact2 = new Manufacturer( 1964);
        manufact1.setCountry("Japan");
        manufact1.setName("Toyota");

        manufact2.setName("Volvo");
        manufact2.setCountry("Sweden");

        Car2 car1 = new Car2 ("Camry",2015,2.5);
        Car2 car2 = new Car2 ("XC90",2024,2.4);
        Car2 car3 = new Car2 ("Highlander",2025,2);

        car1.setManufacturer(manufact1);
        car1.setPrice(36000);
        car1.setFuelType("petrol");

        car2.setManufacturer(manufact2);
        car2.setPrice(160000);
        car2.setFuelType("petrol");


        car3.setManufacturer(manufact1);
        car3.setPrice(80000);
        car3.setFuelType("hybrid");





        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Car2[] cars = {car1,car2,car3};
        Car2 mostexpensive = cars[0];
        for (Car2 car: cars)
        {
            if(car.getManufacturer().getCountry().equalsIgnoreCase("Japan"))
            {
                System.out.println("Car made by japan:"+ car.model);
            }
            if(car.getFuelType().equalsIgnoreCase("hybrid"))
            {
                System.out.println("Hybrid car:"+car.model);
            }
            if(car.getPrice()>mostexpensive.getPrice())
            {
                mostexpensive=car;
            }

        }
        System.out.println("Most expensive car:"+mostexpensive.model);
    }
}
