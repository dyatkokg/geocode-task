package me.dyatkokg.geocodetask.controller;

import lombok.RequiredArgsConstructor;
import me.dyatkokg.geocodetask.dto.geocoding.YandexGeocoderResponse;
import me.dyatkokg.geocodetask.service.YandexGeocoderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class YandexGeocoderController {

    private final YandexGeocoderService yandexGeocoderService;


    @GetMapping("geocode")
    public YandexGeocoderResponse convertAddress(@RequestParam("format") String format,
                                                 @RequestParam("apikey") String apiKey,
                                                 @RequestParam("geocode") String geocode) {
        return yandexGeocoderService.convertAddress(format, apiKey, geocode);
    }
}
