package com.arafiei.appointment.controllers;

import com.arafiei.appointment.managers.ITutorManager;
import com.arafiei.appointment.views.ViewTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tutor")
public class TutorController {

    @Autowired
    private ITutorManager tutorManager;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<ViewTutor>> getAllTutors(){
        return new ResponseEntity<List<ViewTutor>>(tutorManager.getAllTutors(), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<ViewTutor> createTutor(@RequestBody ViewTutor viewTutor){
        return new ResponseEntity<ViewTutor>(tutorManager.createTutor(viewTutor), HttpStatus.OK);
    }

    @RequestMapping(value = "/{tutorId}", method = RequestMethod.PUT)
    ResponseEntity<ViewTutor> updateTutor(@PathVariable Long tutorId, @RequestBody ViewTutor viewTutor){
        return new ResponseEntity<ViewTutor>(tutorManager.updateTutor(tutorId, viewTutor), HttpStatus.OK);
    }

    @RequestMapping(value = "/{tutorId}", method = RequestMethod.DELETE)
    ResponseEntity<ViewTutor> deleteTutor(@PathVariable Long tutorId){
        return new ResponseEntity<ViewTutor>(tutorManager.deleteTutor(tutorId), HttpStatus.OK);
    }

    @RequestMapping(value = "/list/{status}", method = RequestMethod.GET)
    ResponseEntity<List<ViewTutor>> getAllTutorsByStatus(@PathVariable String status){
        return new ResponseEntity<List<ViewTutor>>(tutorManager.getTutorsByStatus(status), HttpStatus.OK);
    }

    @RequestMapping(value = "/tutors/{day}", method = RequestMethod.GET)
    ResponseEntity<List<ViewTutor>> getAllTutorsByDay(@PathVariable String day){
        return new ResponseEntity<List<ViewTutor>>(tutorManager.getTutorsByDay(day), HttpStatus.OK);
    }

    @RequestMapping(value = "/{tutorId}", method = RequestMethod.GET)
    ResponseEntity<ViewTutor> getTutor(@PathVariable Long tutorId){
        return new ResponseEntity<ViewTutor>(tutorManager.getTutorById(tutorId), HttpStatus.OK);
    }

}
