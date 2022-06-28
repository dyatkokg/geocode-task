package me.dyatkokg.geocodetask.client;


import me.dyatkokg.geocodetask.dto.geocoding.YandexGeocoderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "${api.external.yandex-geocoder.name}",
        url = "${api.external.yandex-geocoder.url}",
        configuration = FeignConfig.class
)

public interface YandexGeocoderClient {

    @GetMapping()
    YandexGeocoderResponse geocode(@RequestParam("format") String format,
                                   @RequestParam("apikey") String apiKey,
                                   @RequestParam("geocode") String geocode);
}
