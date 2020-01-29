package model.entity;

public class CarEntity {
    private int number, build;
    long prise;
    private String model, color;

    public CarEntity setPrise(long prise){
        this.prise = prise;
        return this;
    }

    public long getPrise(){
        return prise;
    }
    public int getNumber() {
        return number;
    }

    public CarEntity setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getBuild() {
        return build;
    }

    public CarEntity setBuild(int build) {
        this.build = build;
        return this;
    }

    public String getModel() {
        return model;
    }

    public CarEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public CarEntity setColor(String color) {
        this.color = color;
        return this;
    }
}
