package web.model;

public class Car {

    private String brand;
    private String type;
    private Integer series;

    public Car() {}

    public Car(String brand, String type, Integer series) {
        this.brand = brand;
        this.type = type;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public Integer getSeries() {
        return series;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", series=" + series +
                '}';
    }
}
