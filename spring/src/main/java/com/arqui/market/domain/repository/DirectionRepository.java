package com.arqui.market.domain.repository;

import com.arqui.market.domain.Direction;
import com.arqui.market.domain.User;

import java.util.List;
import java.util.Optional;

public interface DirectionRepository {
    List<Direction> getAll();
    Optional<List<Direction>> getByUser(String userId);
    Optional<Direction> getDirection(int directionId);
    Direction save(Direction direction);
    void delete(int directionId);
}
