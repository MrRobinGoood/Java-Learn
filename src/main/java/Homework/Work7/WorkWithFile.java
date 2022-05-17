package Homework.Work7;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WorkWithFile {
    static String URL =
            "https://github.com/rassafel/java-learn/blob/master/tasks/data/CAR_DATA.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";

    public static void main(String[] args) throws IOException {

        WorkWithFile task = new WorkWithFile();
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);

        List<Car> cars = parseCar(reader, PARSE_CAR);
        carsToFile(cars, "All_cars.txt");

        Map<String, List<Car>> groupColor = new HashMap<>();
        groupColor = groupColor(cars);
        carsMapToFile(groupColor, "Group_color.txt");

        List<CarMaker> carMakers = new LinkedList<>();
        carMakers = parseCarMakers(cars);
        carMakersToFile(carMakers, "carMakers.txt");
        System.out.println(task.printCarMakers(carMakers));

        List<CarMaker> sortMakers = carMakers.stream()
                .filter(maker -> maker.getCars().size() > 2)
                .sorted(Comparator.comparing(maker ->
                        maker.getMaker()))
                .collect(Collectors.toList());
        carMakersToFile(sortMakers, "Sort_carMakers.txt");
    }

    private final static Function<String[], Car> PARSE_CAR = (String[]
                                                                      values) -> {
        Car car = new Car();
        car.setCarModel(values[0]);
        CarMaker carMaker = new CarMaker(values[1]);
        car.setCarMaker(carMaker);
        car.setCarModelYear(values[2]);
        car.setColor(values[3]);
        return car;
    };

    static List<Car> parseCar(BufferedReader reader,
                              Function<String[], Car> function) throws
            IOException {
        List<Car> cars = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(DELIMITER);
            cars.add(function.apply(values));
        }
        return Collections.unmodifiableList(cars);
    }

    static Map<String, List<Car>> groupColor(List<Car> cars) throws
            IOException {
        return
                cars.stream().collect(Collectors.groupingBy(Car::getColor));
    }

    static BufferedReader getReader() throws IOException {
        URL url = new URL(WorkWithFile.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new
                InputStreamReader(connection.getInputStream()));
    }

    static Map<String, Integer> readHeaders(BufferedReader reader)
            throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(DELIMITER);
        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }

    static void carsToFile(List<Car> cars, String mainfile) throws
            IOException {
        try {
            File file = new File(mainfile);
            if (!file.exists())
                file.createNewFile();
            FileWriter filewriter = new FileWriter(file);
            for (int i = 0; i < cars.size(); i++)
                filewriter.append(cars.get(i).toString() + '\n');
            filewriter.close();
        } catch (IOException e) {
            System.err.println("Error 404: " + e);
        }
    }

    static void carMakersToFile(List<CarMaker> carMakers, String
            mainfile) throws IOException {
        try {
            File file = new File(mainfile);
            if (!file.exists())
                file.createNewFile();
            FileWriter filewriter = new FileWriter(file);
            for (int i = 0; i < carMakers.size(); i++)
                filewriter.append(carMakers.get(i).toString() + '\n');
            filewriter.close();
        } catch (IOException e) {
            System.err.println("Error 404: " + e);
        }
    }

    String printCarMakers(List<CarMaker> carMakers) {
        String str = "";
        for (int i = 0; i < carMakers.size(); i++)
            str = str + carMakers.get(i) + '\n';
        return str;
    }

    static List<CarMaker> parseCarMakers(List<Car> cars) throws
            IOException {
        Map<String, List<Car>> groupCarMakers = groupCarMaker(cars);
        List<CarMaker> carMakers = new LinkedList<>();
        CarMaker carMaker;
        Set<String> set = groupCarMakers.keySet();
        String[] carMakersStr = set.toArray(new String[set.size()]);

        for (int i = 0; i < carMakersStr.length; i++) {
            carMaker = new CarMaker(carMakersStr[i],
                    groupCarMakers.get(carMakersStr[i]));
            carMakers.add(carMaker);
        }
        return Collections.unmodifiableList(carMakers);
    }

    static Map<String, List<Car>> groupCarMaker(List<Car> cars) throws
            IOException {
        return
                cars.stream().collect(Collectors.groupingBy(Car::getCarMakerStr));
    }

    static void carsMapToFile(Map<String, List<Car>> groupColor,
                              String mainfile) throws IOException {
        File file = new File(mainfile);
        try {
            if (!file.exists())
                file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error 404: " + e);
        }
        FileWriter filewriter = new FileWriter(file);
        groupColor.forEach((color, cars) -> {
            try {
                filewriter.append("\n\n" + color + ":");
                for (Car car : cars) {
                    filewriter.append(car.toString());
                }
            } catch (IOException e) {
                System.out.println("Error 404: " + e);
            }
        });
        filewriter.close();
    }

    String printCars(List<Car> cars) {
        String str = "";
        for (int i = 0; i < cars.size(); i++)
            str = str + cars.get(i) + '\n';
        return str;
    }
}
