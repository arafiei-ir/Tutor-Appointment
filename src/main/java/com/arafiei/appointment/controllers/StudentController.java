package com.arafiei.appointment.controllers;

import com.arafiei.appointment.managers.IStudentManager;
import com.arafiei.appointment.views.ViewStudent;
import com.arafiei.appointment.views.ViewTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private IStudentManager studentManager;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<ViewStudent>> getAllStudents(){
        return new ResponseEntity<List<ViewStudent>>(studentManager.getAllStudents(), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<ViewStudent> createStudent(@RequestBody ViewStudent viewStudent){
        return new ResponseEntity<ViewStudent>(studentManager.createStudents(viewStudent), HttpStatus.OK);
    }


}
