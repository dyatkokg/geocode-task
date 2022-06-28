package me.dyatkokg.geocodetask.dto.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Envelope {
    private String lowerCorner;
    private String upperCorner;
}
