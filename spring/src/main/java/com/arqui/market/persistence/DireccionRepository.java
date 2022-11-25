package com.arqui.market.persistence;

import com.arqui.market.domain.Direction;
import com.arqui.market.domain.User;
import com.arqui.market.domain.repository.DirectionRepository;
import com.arqui.market.persistence.crud.DireccionCrudRepository;
import com.arqui.market.persistence.entity.Direccion;
import com.arqui.market.persistence.mapper.DirectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DireccionRepository implements DirectionRepository {
    @Autowired
    private DireccionCrudRepository direccionCrudRepository;
    @Autowired
    private DirectionMapper mapper;


    @Override
    public List<Direction> getAll() {
        List<Direccion> direccions = (List<Direccion>) direccionCrudRepository.findAll();
        return mapper.toDirections(direccions);
    }

    @Override
    public Optional<List<Direction>> getByUser(String userId) {
        List<Direccion> direccions = direccionCrudRepository.findByIdUsuario(userId);
        return Optional.of(mapper.toDirections(direccions));
    }

    @Override
    public Optional<Direction> getDirection(int directionId) {
        return direccionCrudRepository.findById(directionId).map(direccion -> mapper.toDirection(direccion));
    }

    @Override
    public Direction save(Direction direction) {
        Direccion direccion = mapper.toDireccion(direction);
        return mapper.toDirection(direccionCrudRepository.save(direccion));
    }

    @Override
    public void delete(int directionId) {
        direccionCrudRepository.deleteById(directionId);
    }
}
