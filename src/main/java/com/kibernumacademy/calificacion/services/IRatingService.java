package com.kibernumacademy.calificacion.services;

import com.kibernumacademy.calificacion.entity.Rating;

import java.util.List;

public interface IRatingService {

  Rating create(Rating rating);
  List<Rating> getRatings();
  List<Rating> getRatingsByUserId(String userId);
  List<Rating> getRatingsByHotelId(String hotelId);
}
