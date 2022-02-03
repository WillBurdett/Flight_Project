package passenger;

import flight.Destination;
import flight.Flight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerDao {
    private List<Passenger> allPassengers = new ArrayList<>();

    public PassengerDao() {
//        Passenger passenger1 = new Passenger("1", "Will", "will@gmail.com", "0789 567 4563", "07897890");
//        Passenger passenger2 = new Passenger("2","Nasir", "nasir@gmail.com", "0785 567 4122", "AFGHK890");
//        Passenger passenger3 = new Passenger("3", "Yang", "yang@gmail.com", "0785 567 1678", "HJKLHJ90");
//        Passenger passenger4 = new Passenger("4","Andrew", "andrew@gmail.com", "0776 547 2178", "CBNMMM90");
//
//        allPassengers.add(passenger1);
//        allPassengers.add(passenger2);
//        allPassengers.add(passenger3);
//        allPassengers.add(passenger4);

        ////////////////////////////////////////////////

        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/passenger";
        String fileName = "PassengerDB.txt";

        File file = new File(dirName, fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Empty DB created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] info = scanner.nextLine().split(",");
                Passenger passenger = new Passenger(info[0], info[1], info[2], info[3], info[4]);
                allPassengers.add(passenger);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
        }

    }

    public List<Passenger> getAllPassengers() {
        return allPassengers;
    }

    public void updateAllPassengers() {
        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/Flight_Project/src/passenger";
        String fileName = "PassengerDB.txt";

        List<Flight> test = new ArrayList<>();

        File file = new File(dirName, fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Empty DB created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // create fileWriter with our txt file as an argument
            FileWriter fileWriter = new FileWriter(file);
            // create printWriter with fileWriter as argument
            PrintWriter myWriter = new PrintWriter(fileWriter);

            for (Passenger p : getAllPassengers()) {
                if (p == null) {
                    myWriter.println("Free space.");
                } else {
                    myWriter.println(p.toStringCSV());
                }
            }
            // end of writing
            myWriter.flush();
            myWriter.close();

        } catch (Exception e) {
            System.out.println("Couldn't write to file.");
        }
    }
}
