package by.neronskaya.bean;

public class Room {
    private int id;
    private String name;
    private String country;
    private String countryCode;

    public Room() {

    }

    public Room(int id, String name, String country, String countryCode) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.countryCode = countryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


}
