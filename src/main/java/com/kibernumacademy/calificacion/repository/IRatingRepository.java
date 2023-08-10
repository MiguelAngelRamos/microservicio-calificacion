package com.kibernumacademy.calificacion.repository;

import com.kibernumacademy.calificacion.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IRatingRepository extends MongoRepository<Rating, String> {

  // métodos custom
  List<Rating> findByUserId(String userId);
  List<Rating> findByHotelId(String hotelId);
}
