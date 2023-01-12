public class Car {
    private int id;
    private String  marka;
    private String model;
    private int year;
    private String color;
    private int price;
    private int reg_number;

    public Car(){
        this.id = 0;
        this.marka = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0;
        this.reg_number = 0;
    }

    public Car(int id, String marka, String model, int year, String color, int price, int registration_number) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.reg_number = registration_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        } else System.out.println("Год выпуска не может быть отрицательным или нулевым!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>0) {
            this.price = price;
        } else System.out.println("Цена не может быть отрицательной или нулевой!");
    }

    public int getRegistration_number() {
        return reg_number;
    }

    public void setRegistration_number(int registration_number) {
        this.reg_number = registration_number;
    }

    @Override
    public String toString() {
        return "Машина --- " +
                "id=" + id +
                ", Марка=" + marka  +
                ", Модель=" + model +
                ", Год выпуска=" + year +
                ", Цвет=" + color  +
                ", Цена=" + price +
                ", Регистрационный норм=" + reg_number;
    }

}