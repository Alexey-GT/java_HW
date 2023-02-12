package homework_6;

public class Laptop {
    private String brand;
    private String color;
    private Integer memory;
    private Integer price;

    Laptop(String brand,String color,Integer memory,Integer price){
        this.brand=brand;
        this.color=color;
        this.memory=memory;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Результат поиска:" +
                "brand:" + brand + '\'' +
                ", color:" + color + '\'' +
                ", memory:" + memory +"Гб"+
                ", price:" + price +"Т.р."+
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getPrice() {
        return price;
    }
}