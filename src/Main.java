import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> autoPark = new ArrayList<>();
        autoPark.add(new Car(1, "audi", "Q8", 1999, "white", 10000, 1001));
        autoPark.add(new Car());
        autoPark.add(new Car(2, "ford", "A1", 2002, "red", 450000, 4532));
        autoPark.add(new Car(3, "ford", "B7", 2002, "black", 70000, 4577));
        autoPark.add(new Car(4, "ferrari", "A1", 2020, "white", 1000000, 9090));
        autoPark.add(new Car(5, "audi", "K1", 2016, "red", 700000, 4444));

        List<Car> byMarka = CarHelper.getCarsByMarka(autoPark, "audi");
        System.out.println(",kf,fk");
        CarHelper.printCars(byMarka);

        List<Car> byModel = CarHelper.getCarsByModelAndYear(autoPark, "A1", 1);
        System.out.println(",kf,fk");
        CarHelper.printCars(byModel);

        List<Car> byYear = CarHelper.getCarsByYearAndPrice(autoPark, 2002, 100000);
        System.out.println(",kf,fk");
        CarHelper.printCars(byYear);
    }
}
