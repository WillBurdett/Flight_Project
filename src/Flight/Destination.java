package Flight;

public enum Destination {
    BOD("Bordeaux", "France"),
    PRG("Prague", "Czech Republic"),
    CPH("Copenhagen", "Denmark"),
    BER("Berlin", "Germany"),
    LAX("Los Angeles", "USA")

    ;


    private final String location;
    private final String country;

    private Destination(String location, String country) {
        this.location = location;
        this.country = country;
    }
}
