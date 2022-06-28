package me.dyatkokg.geocodetask.dto.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dyatkokg.geocodetask.dto.address.Address;
import me.dyatkokg.geocodetask.dto.address.AddressDetails;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocoderMetaData {

    private String precision;

    private String text;

    private String kind;

    @JsonProperty(value = "Address")
    private Address address;

    @JsonProperty(value = "AddressDetails")
    private AddressDetails addressDetails;
}
