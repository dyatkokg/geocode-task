package me.dyatkokg.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostalCode {
    @JsonProperty(value = "PostalCodeNumber")
    private String postalCodeNumber;

}
