package by.neronskaya.bean;

public class Room {
    private int idRoom;
    private String roomName;
    private String country;
    private String countryCode;

    public Room() {

    }

    public Room(int idRoom, String roomName, String country, String countryCode) {
        this.idRoom = idRoom;
        this.roomName = roomName;
        this.country = country;
        this.countryCode = countryCode;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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
