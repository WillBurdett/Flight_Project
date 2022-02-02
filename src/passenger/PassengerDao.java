package passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerDao {
    private List<Passenger> allPassengers = new ArrayList<>();

    public PassengerDao() {
        Passenger passenger1 = new Passenger("1", "Will", "will@gmail.com", "0789 567 4563", "07897890");
        Passenger passenger2 = new Passenger("2","Nasir", "nasir@gmail.com", "0785 567 4122", "AFGHK890");
        Passenger passenger3 = new Passenger("3", "Yang", "yang@gmail.com", "0785 567 1678", "HJKLHJ90");
        Passenger passenger4 = new Passenger("4","Andrew", "andrew@gmail.com", "0776 547 2178", "CBNMMM90");

        allPassengers.add(passenger1);
        allPassengers.add(passenger2);
        allPassengers.add(passenger3);
        allPassengers.add(passenger4);
    }

    public List<Passenger> getAllPassengers(){
        return allPassengers;
    }
}
