package me.dyatkokg.geocodetask.service;

import lombok.RequiredArgsConstructor;
import me.dyatkokg.geocodetask.client.YandexGeocoderClient;
import me.dyatkokg.geocodetask.dto.geocoding.YandexGeocoderResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YandexGeocoderService {

    private final YandexGeocoderClient yandexGeocoderClient;

    public YandexGeocoderResponse convertAddress(String format, String apiKey, String geocode) {
        return yandexGeocoderClient.geocode(format, apiKey, geocode);
    }
}
