import static ValidateInteger.validateString.


public class Train extends Transport  {
    private Integer travelTime;
    private String departure;
    private String destination;
    private Integer wagonsCount;



    public Train(String brand, String model, int year, String country, String color, Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.travelTime = validateInteger(travelTime, 60);
        this.departure = volidateString(departure, "any station");
        this.destination = volidateString(destination, "any station");
        this.wagonsCount = validateInteger(wagonsCount, 2);

    }

    @Override
    void refill(String fuel) {
        System.out.println(" The train will be refueled with " + validateRefillType(fuel));
    }
    public static String validateRefillType(String value) {
        if (validateString(value) && value.equals("diesel")) {
            return value;
        } else {
            return "diesel";
        }
    }

    public Integer getTravelTime() { return travelTime ; }
    public  void setTravelTime(Integer travelTime) { this.travelTime = travelTime; }
    public String getDeparture() { return departure; }
    public  void  setDeparture(String departure) { this.departure = departure; }
    public String getDestination() { return  destination; }
    public void setDestination(String destination) { this.destination = destination;}
    public Integer getWagonsCount() { return  wagonsCount; }
    public void  setWagonsCount(Integer wagonsCount) { this.wagonsCount = wagonsCount; }

    @Override
    public String toString() {
        return "Train{" +
                "travelTime =" + travelTime +
                ", departure='" + departure + '\'' +
                ", destination= '" + destination + '\'' +
                ", wagonsCount = " + wagonsCount +
                ", brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", year = " + getYear() +
                ", country = '" + getCountry() + '\'' +
                ", color = '" + getColor() + '\'' +
                ", maxSpeed = " + getMaxSpeed() +
                '}';
    }
}
