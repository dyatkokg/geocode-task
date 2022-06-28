package me.dyatkokg.geocodetask.dto.geocoding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YandexGeocoderResponse {

    private Response response;
}
