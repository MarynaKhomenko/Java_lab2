import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class CarHelper {
    public static List<Car> getCarsByMarka(List<Car> initialList, String marka) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : initialList) {
            if (car.getMarka().equals(marka)) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    public static void printCars(List<Car> cars) {
        for (Car car : cars)
            System.out.println(car.toString());
    }

    public static List<Car> getCarsByModelAndYear(List<Car> initialList, String model, int year) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : initialList) {
            if (car.getModel().equals(model) & car.getYear() < Year.now().getValue() - year) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    public static List<Car> getCarsByYearAndPrice(List<Car> initialList, int year, int price) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : initialList) {
            if (car.getYear() == year & car.getPrice() > price) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }
}
