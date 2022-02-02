package Flight;

import Passenger.Passenger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Flight{
    private String flightCode;
    private Destination destination;
    private LocalDateTime departureTime;
    private int maxCapacity;
    private Passenger[] passenger;

    public Flight() {
    }

    public Flight(String flightCode, Destination destination, LocalDateTime departureTime, int maxCapacity) {
        this.flightCode = flightCode;
        this.destination = destination;
        this.departureTime = departureTime;
        this.maxCapacity = maxCapacity;
        this.passenger = new Passenger[maxCapacity];
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Passenger[] getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger[] passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightCode='" + flightCode + '\'' +
                ", destination=" + destination +
                ", departureTime=" + departureTime +
                ", maxCapacity=" + maxCapacity +
                ", passenger=" + Arrays.toString(passenger) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return maxCapacity == flight.maxCapacity && Objects.equals(flightCode, flight.flightCode) && destination == flight.destination && Objects.equals(departureTime, flight.departureTime) && Arrays.equals(passenger, flight.passenger);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flightCode, destination, departureTime, maxCapacity);
        result = 31 * result + Arrays.hashCode(passenger);
        return result;
    }
}
