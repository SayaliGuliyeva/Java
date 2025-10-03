package Homework6;

public class Manufacturer {
    private String name;
    int foundationYear;
    private String country;


    public Manufacturer(int foundationYear) {

        this.foundationYear = foundationYear;

    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }
}
