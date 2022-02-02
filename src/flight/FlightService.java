package flight;

import passenger.Passenger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightService {
    //This is a service class which will deal with the following methods
    //1. Add a flight
    private FlightDao flightDao;
    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }


    public void addFlight() {
        System.out.println("Flight Code?");

        Scanner scanner = new Scanner(System.in);
        String flightCode = scanner.nextLine();


        System.out.println("Destination?\n1. Germany\n2. China\n3. France\n4. Denmark\n5. UAE\n6. USA\n7. Czech Republic");
        String selection = scanner.nextLine();
        Destination destination = null;


        switch (selection){
            case "1":
                destination = Destination.BER;
                break;
            case "2":
                destination = Destination.BJS;
                break;
            case "3":
                destination = Destination.BOD;
                break;
            case "4":
                destination = Destination.CPH;
                break;
            case "5":
                destination = Destination.DXB;
                break;
            case "6":
                destination = Destination.LAX;
                break;
            case "7":
                destination = Destination.PRG;
                break;
            default:
                System.out.println("Not a valid choice.");
                addFlight();
        }

        System.out.println("Departure Date/Time:");
        System.out.println("Year?");
        int year = scanner.nextInt();
        System.out.println("Month?");
        int month = scanner.nextInt();
        System.out.println("Day?");
        int day = scanner.nextInt();
        System.out.println("Hour?");
        int hour = scanner.nextInt();
        System.out.println("Minute?");
        int minute = scanner.nextInt();
        // create date time with given values
        LocalDateTime departureTime = LocalDateTime.of(year, month, day, hour, minute);

        System.out.println("Flight capacity?");
        int capacity = scanner.nextInt();

        Flight flight = new Flight(flightCode, destination, departureTime, capacity);

        flightDao.getAllFlights().add(flight);
    }
    // All flights
    public static int availableSeats(Flight flight){
        int counter = 0;
        for (String passenger : flight.getPassengerIds()) {
            if (passenger == null){
                counter++;
            }
        }
        return counter;
    }

    public static String displayFlight(Flight flight){
        return "Destination: " + flight.getDestination() + " | " + "Departure time: " + flight.getDepartureTime() + " | " + "Available seats: " + availableSeats(flight);
    }

    public void displayAllFlights(){
        for (Flight flight : flightDao.getAllFlights()) {
            System.out.println("--------------------");
            System.out.println(displayFlight(flight));
        }
    }

    public void displayFullyBooked(){
        System.out.println("Fully booked flights:");
        for (Flight flight : flightDao.getAllFlights()) {
            if (availableSeats(flight) == 0){
                System.out.println(displayFlight(flight));
                System.out.println("--------------------");
            }
        }
    }



    public static void addPassengerToFlight(Passenger passenger, Flight flight){
        for (int i = 0; i < flight.getPassengerIds().length; i++) {
            if (flight.getPassengerIds()[i] == null){
                flight.getPassengerIds()[i] = passenger.getId();
                break;
            }
        }
    }

    public boolean onFlight(Passenger passenger, Flight flight){
        for (String passengerId : flight.getPassengerIds()) {
            if (passenger.getId().equals(passengerId)){
                return true;
            }
        }
        return false;
    }

    public void checkPassengerFlights(Passenger passenger){
        List<Flight> onboard = new ArrayList<>();
        for (Flight flight : flightDao.getAllFlights()) {
            if (onFlight(passenger, flight)){
                onboard.add(flight);
            }
        }
        System.out.println("Flights for passenger: " + passenger.getName());
        if (onboard.size() > 0){
            for (Flight flight : onboard) {
                System.out.println(displayFlight(flight));
            }
        } else {
            System.out.println("No flights available.");
        }
        System.out.println("---------------------");
    }

}
