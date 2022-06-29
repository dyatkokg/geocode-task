package me.dyatkokg.geocodetask.repository;

import me.dyatkokg.geocodetask.entity.geocoding.YandexGeocoderResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResponseRepository extends MongoRepository<YandexGeocoderResponse,String> {
}
