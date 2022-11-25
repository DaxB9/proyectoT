package com.arqui.market.web.controller;

import com.arqui.market.domain.Direction;
import com.arqui.market.domain.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direction")
public class DirectionController {
    @Autowired
    private DirectionService directionService;

    @GetMapping("/all")
    public ResponseEntity<List<Direction>> getAll(){
        return new ResponseEntity<>(directionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{directionId}")
    public ResponseEntity<Direction> getDirection(@PathVariable("directionId") int directionId){
        return directionService.getDirection(directionId)
                .map(direction -> new ResponseEntity<>(direction, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Direction>> getByUser(@PathVariable("userId") String userId){
        return directionService.getByUser(userId)
                .map(directions -> new ResponseEntity<>(directions,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<Direction> save(@RequestBody Direction direction){
        return new ResponseEntity<>(directionService.save(direction), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{directionId}")
    public ResponseEntity delete(@PathVariable("directionId") int directionId){
        if (directionService.delete(directionId)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
