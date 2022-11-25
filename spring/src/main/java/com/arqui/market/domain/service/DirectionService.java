package com.arqui.market.domain.service;

import com.arqui.market.domain.Direction;
import com.arqui.market.persistence.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionService {
    @Autowired
    private DireccionRepository direccionRepository;

    public List<Direction> getAll(){
        return direccionRepository.getAll();
    }

    public Optional<Direction> getDirection(int directionId){
        return direccionRepository.getDirection(directionId);
    }

    public Optional<List<Direction>> getByUser(String userId){
        return direccionRepository.getByUser(userId);
    }

    public Direction save(Direction direction){
        return direccionRepository.save(direction);
    }

    public Boolean delete(int directionId){
        return getDirection(directionId).map(direction -> {
            direccionRepository.delete(directionId);
            return true;
        }).orElse(false);
    }
}

