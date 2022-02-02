package flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightDao {
    private List<Flight> allFlights = new ArrayList<>();

    public FlightDao() {
        Flight flight1 = new Flight("code1", Destination.BER, LocalDateTime.of(2022, 1, 22, 9, 30), 0);
        Flight flight2 = new Flight("code2", Destination.BJS, LocalDateTime.of(2022, 2, 10, 10, 00), 2);
        Flight flight3 = new Flight("code3", Destination.BOD, LocalDateTime.of(2022, 3, 02, 13, 45), 2);

        allFlights.add(flight1);
        allFlights.add(flight2);
        allFlights.add(flight3);
    }
    public List<Flight> getAllFlights(){
        return allFlights;
    }
}













//    public List<Flight> readGarage() {
//
//        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/Flight/FlightDao.java";
//        String fileName = "AirportDB.txt";
//
//        File file = new File(dirName, fileName);
//
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//                System.out.println("Empty DB created!");
//                return null;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List <Flight> availableFlights = new ArrayList<>();
//        try {
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNext()) {
//                String[] arr = scanner.nextLine().split(",");
//
//                // Passenger[] = [p1, p2 , p3] - But this is all a string
//
//                String arrToStr = arr[4].replaceAll("\\[", "");
//                arrToStr = arr[4].replaceAll("]", "");
//
//
//
//
//
//                Flight flight = new Flight(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]),
//
//
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
//        }
//    }


//    public void postMapping() {
//
//        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/Flight/FlightDao.java";
//        String fileName = "AirportDB.txt";
//
//        File file = new File(dirName, fileName);
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            // create fileWriter with our txt file as an argument
//            FileWriter fileWriter = new FileWriter(file);
//            // create printWriter with fileWriter as argument
//            PrintWriter myWriter = new PrintWriter(fileWriter);
//
//            myWriter.println("Data for " + garage.getOwner().getName() + "'s Garage No." + garage.getGarageNumber());
//            for (Car car : garage.getCars()) {
//                if (car == null) {
//                    myWriter.println("Free space.");
//                } else {
//                    myWriter.println(car.toStringCsv());
//                }
//                ;
//            }
//            // end of writing
//            myWriter.flush();
//            myWriter.close();
//
//        } catch (Exception e) {
//            System.out.println("Couldn't write to file.");
//        }
//    }



  //  }
