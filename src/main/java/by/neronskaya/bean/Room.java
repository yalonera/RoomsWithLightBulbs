package by.neronskaya.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private int id;
    private String name;
    private String country;
    private String countryCode;
}

