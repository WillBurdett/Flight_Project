package passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    // Do business

    private PassengerDao passengerDao;

    public PassengerService(PassengerDao passengerDao) {
        this.passengerDao = passengerDao;
    }

    public Passenger getById(String id) {
        for (Passenger p : passengerDao.getAllPassengers()) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public List<Passenger> filterByName(String name){
        List<Passenger> matched = new ArrayList<>();
        for (Passenger p : passengerDao.getAllPassengers()) {
            if (name.trim().equalsIgnoreCase(p.getName())){ // watch for trims
                matched.add(p);
            }
        }
        return matched;
    }
}

