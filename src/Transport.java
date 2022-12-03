

import static ValidateUtils.validateString;

public  abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private  String color;
    private Integer maxSpeed;
    private  String fuel;

    public Transport(String brand, String model, int year, String country, String color,Integer maxSpeed){
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = volidateYear(year);
        this.country = volidateCountry(country);
        this.color = volidateColor(color);
        this.maxSpeed = maxSpeed;

    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getCountry() { return country; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public Integer getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(Integer maxSpeed) { this.maxSpeed = maxSpeed; }
    public String getFuel() { return fuel;}
    public void setFuel(String fuel){ this.fuel = fuel;}

    public static int volidateYear(Integer value) { return  value == null || value <= 1900 ? 2000 : value; }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }
    public static  String volidateColor(String value) { return validateString(value, "white"); }
    public static String validateTransmission(String value) { return  validateString(value, "Auto"); }
    public static String volidateCountry(String value) { return  validateString(value, "Rus"); }

    @Override
    public String toString() {
        return "Transport {" +
                "brand ='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", year = " + year +
                ", country = '" + country + '\'' +
                ", color = '" + color + '\'' +
                ", maxSpeed = " + maxSpeed +
                '}';
    }

    abstract void refill(String fuel);
}
