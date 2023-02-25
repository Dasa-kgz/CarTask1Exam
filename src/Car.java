import java.time.LocalDate;
import java.util.Locale;

public class Car {
    private String name;
    private int yearsOfManufacture;
    private int price;
    private BodyType bodyType;

    public Car(String name, int yearsOfManufacture, int price, BodyType bodyType) {
        this.name = name;
        this.yearsOfManufacture = yearsOfManufacture;
        this.price = price;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfManufacture() {
        return yearsOfManufacture;
    }

    public void setYearsOfManufacture(int yearsOfManufacture) {
        this.yearsOfManufacture = yearsOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String bodyTypeIdentification() {
        switch (bodyType) {
            case SEDAN:
                return "Легковая машина";
            case HATCHBEK:
                return "мини легковая машина";
            case KROSSOVER:
                return "мини внедорожник";
            case UNIVERSAL:
                return "Универсальная машина";
            case VNEDOROZHNIK:
                return "Внедорожник тибиндеги машина";
            default:
                return "Мындай тип жок";
        }
    }
    public int determinationoYearOfManufacture(){
        LocalDate now = LocalDate.now();
        return now.getYear()-yearsOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearsOfManufacture=" + yearsOfManufacture +
                ", price=" + price +
                ", bodyType=" + bodyType +
                '}';
    }
}
