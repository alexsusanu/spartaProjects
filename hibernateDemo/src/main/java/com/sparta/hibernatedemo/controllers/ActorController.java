package com.sparta.hibernatedemo.controllers;

import com.sparta.hibernatedemo.entities.Actor;
import com.sparta.hibernatedemo.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActorController {

    @Autowired
    private ActorRepository theRepository;

    @GetMapping(value= "/sakila/actors")
    public List<Actor> getActors(){
        return theRepository.findAll();
    }

    @GetMapping(value = "/sakila/actor")
    public Actor getActor(@RequestParam Integer id){
        Optional<Actor> result = theRepository.findById(id);
        if(result.isPresent())
            return result.get();
        else
            return null;
    }

    @PutMapping(value="/sakila/actor/update")
    public Actor updateActor(@RequestBody Actor newState){
        Optional<Actor> oldState = theRepository.findById(newState.getId());
        if(oldState.isEmpty()) return null;
        theRepository.save(newState);
        return newState;
    }

    @DeleteMapping(value="sakila/actor/delete")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteActor(@RequestParam Integer id){
        theRepository.deleteById(id);
    }
    @GetMapping(value = "/sakila/actors/{id}")
    public ResponseEntity<?> getActorById(@PathVariable Integer id){
        Optional<Actor> actor = theRepository.findById(id);
        if(actor.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Actor not found");
        }else
            return ResponseEntity.ok(actor.get());
    }

}
