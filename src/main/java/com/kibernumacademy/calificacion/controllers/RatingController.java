package com.kibernumacademy.calificacion.controllers;

import com.kibernumacademy.calificacion.entity.Rating;
import com.kibernumacademy.calificacion.services.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

  @Autowired
  private IRatingService ratingService;

  @PostMapping
  public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
    return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
  }

  @GetMapping
  public ResponseEntity<List<Rating>> listRatings() {
    return ResponseEntity.ok(ratingService.getRatings());
  }

  // calificaciones del usuario por id
  @GetMapping("/users/{userId}")
  public ResponseEntity<List<Rating>> listRatingsByUserId(@PathVariable String userId) {
    return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
  }
  // calificaciones del hotel por id
  @GetMapping("/hotels/{hotelId}")
  public ResponseEntity<List<Rating>> listRatingsByHotelId(@PathVariable String hotelId) {
    return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
  }
}
