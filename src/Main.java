import Flight.Flight;
import Passenger.Passenger;
import Util.Interface;
import Flight.Destination;
import Flight.FlightService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){


        List<Flight> availableFlights = new ArrayList<>();

        Flight flight1 = new Flight("code1", Destination.BER, LocalDateTime.of(2022,1,22, 9, 30), 5);
        Flight flight2 = new Flight("code2", Destination.BJS, LocalDateTime.of(2022,2,10, 10, 00), 2);
        Flight flight3 = new Flight("code3", Destination.BOD, LocalDateTime.of(2022,3,02, 13, 45), 2);

        // FlightService.displayFlight(flight1);


        availableFlights.add(flight1);
        availableFlights.add(flight2);
        availableFlights.add(flight3);
        // System.out.println(availableFlights);

        Passenger passenger1 = new Passenger("Will", "will@gmail.com", "0789 567 4563", "07897890");
        Passenger passenger2 = new Passenger("Nasir", "nasir@gmail.com", "0785 567 4122", "AFGHK890");
        Passenger passenger3 = new Passenger("Yang", "yang@gmail.com", "0785 567 1678", "HJKLHJ90");
        Passenger passenger4 = new Passenger("Andrew", "andrew@gmail.com", "0776 547 2178", "CBNMMM90");

//        System.out.println(flight1);
          FlightService.addPassengerToFlight(passenger1, flight1);
          FlightService.addPassengerToFlight(passenger1, flight2);
//        System.out.println(flight1);

        System.out.println(FlightService.onFlight(passenger1, flight1));
        System.out.println(FlightService.onFlight(passenger1, flight2));
        System.out.println(FlightService.onFlight(passenger2, flight1));

        System.out.println("-----------------------");

        FlightService.checkPassengerFlights(passenger2, availableFlights);









        System.out.println("Welcome to the Flight Booking CLI");

        //FlightService.displayAllFlights(availableFlights);

        String[] options = {
                "Add a flight",
                "Display all flights",
                "Display booked flights",
                "Display flights for a specific user",
                "Book a flight for a user using his ID",
                "Cancel flight",
                "Quit the program"
        };
        int option = Interface.getOption("Please select your option using the numbers:",
                options);

         // Switch statements here
        switch (option){
            case 1:
                System.out.println("'Add flight' selected.");
                FlightService.addFlight(availableFlights);
                break;
            case 2:
                System.out.println("'Display all flights' selected.");
                FlightService.displayAllFlights(availableFlights);
                break;
            case 3:
                System.out.println("'Display fully-booked flights' selected.");
                FlightService.displayFullyBooked(availableFlights);
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

       //  System.out.println(availableFlights);

        System.out.println();




        }





    }

