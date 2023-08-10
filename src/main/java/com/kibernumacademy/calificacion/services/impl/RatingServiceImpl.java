package com.kibernumacademy.calificacion.services.impl;

import com.kibernumacademy.calificacion.entity.Rating;
import com.kibernumacademy.calificacion.repository.IRatingRepository;
import com.kibernumacademy.calificacion.services.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements IRatingService {

  @Autowired
  private IRatingRepository ratingRepository;

  @Override
  public Rating create(Rating rating) {
    return ratingRepository.save(rating);
  }

  @Override
  public List<Rating> getRatings() {
    return ratingRepository.findAll();
  }

  @Override
  public List<Rating> getRatingsByUserId(String userId) {
    return ratingRepository.findByUserId(userId);
  }

  @Override
  public List<Rating> getRatingsByHotelId(String hotelId) {
    return ratingRepository.findByHotelId(hotelId);
  }

}
