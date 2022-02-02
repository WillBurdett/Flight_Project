import util.Interface;
import flight.FlightService;
import flight.FlightDao;
import passenger.PassengerDao;
import passenger.PassengerService;

import java.util.Scanner;

public class Main {

    public static void menu() {

    }

    public static void main(String[] args) {

        FlightDao flightDao = new FlightDao();
        PassengerDao passengerDao = new PassengerDao();
        FlightService flightService = new FlightService(flightDao);
        PassengerService passengerService = new PassengerService(passengerDao);


////        System.out.println(flight1);
//          flightService.addPassengerToFlight(passenger1, flight1);
//          flightService.addPassengerToFlight(passenger1, flight2);
////        System.out.println(flight1);
//
//        System.out.println(flightService.onFlight(passenger1, flight1));
//        System.out.println(flightService.onFlight(passenger1, flight2));
//        System.out.println(flightService.onFlight(passenger2, flight1));
//
//        System.out.println("-----------------------");
//
//        flightService.checkPassengerFlights(passenger2);

        System.out.println(passengerService.filterByName("Andrew"));

        System.out.println("Welcome to the Flight Booking CLI!");

        //FlightService.displayAllFlights(allFlights);


        String[] options = {
                "Add a flight",
                "Display all flights",
                "Display booked flights",
                "Display flights for a specific user",
                "Book a flight for a user using his ID",
                "Cancel flight",
                "Quit the program"
        };

        while (true) {

            int option = Interface.getOption("Please select your option using the numbers:",
                    options);

            // Switch statements here
            switch (option) {
                case 1:
                    System.out.println("'Add flight' selected.");
                    flightService.addFlight();
                    break;
                case 2:
                    System.out.println("'Display all flights' selected.");
                    flightService.displayAllFlights();
                    break;
                case 3:
                    System.out.println("'Display fully-booked flights' selected.");
                    flightService.displayFullyBooked();
                    break;
                case 4:
                    System.out.println("Display flight for a specific user selected.");
                    break;
                case 5:
                    System.out.println("Book a flight for a user using their id selected.");
                    break;
                case 6:
                    System.out.println("Cancel a flight selected.");
                    break;
                case 7:
                    System.out.println("Thanks for using our management system!");
                    System.exit(0);
            }
            System.out.println("Press enter to continue.");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }
}







