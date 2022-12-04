import static ValidateInteger.validateString.

public class Car extends Transport {
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmissin;
    private String number;
    private final int seatCount;
    private double enginePower;

    private Key key;
    private Insurance insurance;

    public Car() {
        super(brand, model, year, country, color, maxSpeed);

        this.bodyType =validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmissin = validateTransmission(transmissin);
        this.number = validateCarNumber(number);
        this.seatCount = validateSeatCount(seatCount);
        this.enginePower = validateEngine(enginePower);

    }

    public String getBodyType() { return bodyType; }
    public boolean isSummerRubber() { return isSummerRubber; }
    public String getTransmissin() { return  transmissin; }
    public void  setTransmissin(String transmissin) { this.transmissin = validateTransmission(transmissin); }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = validateCarNumber(number); }
    public int getSeatCount() { return  seatCount; }
    public void setSummerRubber(boolean summerRubber) { isSummerRubber = summerRubber; }
    public double getEnginePower(double enginePower) { this.enginePower = validateEngine(enginePower); }
    public void setKey(Key key) { this.key = key ; }
    public void setInsurance(Insurance insurance ) { this.insurance = insurance; }
    public void switchRubber() { setSummerRubber(!this.isSummerRubber); }

    public String validateCarNumber(String number) {
        if (Pattern.matches("[a-я][0-9]{3}[a-я]{2}[0-9]{3}", number)) {
            return number;
        }else {
            System.out.println("Номер не корректный");
            return "неверный номер";
        }
    }
    public int validateSeatCount(int seatCount) { return seatCount <= 0 ? 4 : seatCount; }
    public static double validateEngine(double value) { return value <= 0 ? 1.5 : value; }
    public static String validateCarParameters(String value) { return value == null ? " не указано"  : value; }
    public static String validateRefillType(String value) {
        if (ValidateUtils.validateString(value) && (value.equals("electricity") || value.equals("petrol") || value.equals("diesel"))) {
            return value;
        } else {
            return "petrol" ;
        }
    }
    public static String validateTransmission(String value) { return ValidateUtils.validateString(value, "Auto"); }

    @Override
    void refill(String fuel) {
        System.out.println(" The Car will be refueled with " + validateRefillType(fuel));
    }
    public class Key {
        private final Boolean remoteStart;
        private final Boolean keylessAccess;

        public Key(Boolean remoteStart, Boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart) ;
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart='" + remoteStart +'\'' +
                    ", keylessAccess='" + keylessAccess +'\'' +
                    '}';
        }

    }
    public class Insurante {
        private final LocalDate duration;
        private final double cost;
        private final  String number;

    }






}
