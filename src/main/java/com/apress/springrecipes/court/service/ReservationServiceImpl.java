package com.apress.springrecipes.court.service;

import com.apress.springrecipes.court.domain.Player;
import com.apress.springrecipes.court.domain.Reservation;
import com.apress.springrecipes.court.domain.SportType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType SOCCER = new SportType(2, "Soccer");

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceImpl() {
        reservations.add(new Reservation("Tennis #1", LocalDate.of(2008, 1, 14), 16, new Player("Roger", "N/A"), TENNIS));

    }

    @Override
    public List<Reservation> query(String courtName) {
        return null;
    }
}
