package com.sparta.hibernatedemo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.hibernatedemo.entities.Actor;
import com.sparta.hibernatedemo.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ActorController {

    @Autowired
    private ActorRepository theRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(value= "/sakila/actors")
    public List<Actor> getActors(){
        return theRepository.findAll();
    }

    @GetMapping(value = "/sakila/actor")
    public ResponseEntity<String> getActor(@RequestParam Integer id) {
        Optional<Actor> result = theRepository.findById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json; charset=utf-8");
        if (result.isPresent()) {
            try {
                ResponseEntity<String> resp = new ResponseEntity<String>(objectMapper.writeValueAsString(result.get()), headers, HttpStatus.OK);
                return resp;
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return new ResponseEntity<String>("{\"message\": \"That actor doesnt exist\"}", headers,HttpStatus.OK);
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
