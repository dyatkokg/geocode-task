package me.dyatkokg.geocodetask.service;

import lombok.RequiredArgsConstructor;
import me.dyatkokg.geocodetask.client.YandexGeocoderClient;
import me.dyatkokg.geocodetask.entity.geocoding.YandexGeocoderResponse;
import me.dyatkokg.geocodetask.repository.ResponseRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YandexGeocoderService {

    private final YandexGeocoderClient yandexGeocoderClient;

    private final ResponseRepository repository;

    public YandexGeocoderResponse convertAddress(String format, String apiKey, String geocode) {
        YandexGeocoderResponse response = yandexGeocoderClient.geocode(format, apiKey, geocode);
        repository.save(response);
        return response;
    }
}
