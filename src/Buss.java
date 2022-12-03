import static ValidateUtils.validateString;

public class Buss extends Transport {


    public Buss(String brand,
                String model,
                int year,
                String country,
                String color,
                Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    void refill(String fuel) {
        System.out.println("The bus will be refieled with " + validateRefillType(fuel));
    }
    public static String validateRefillType(String value){
        if (validateString(value) && (value.equals("diesel") || value.equals("petrol"))) {
            return value;
        } else {
            return "diesel";
        }
    }
}
