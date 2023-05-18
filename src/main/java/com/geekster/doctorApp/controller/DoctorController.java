package com.geekster.doctorApp.controller;


import com.geekster.doctorApp.model.Appointment;
import com.geekster.doctorApp.model.Doctor;
import com.geekster.doctorApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService docService;

    @PostMapping()
    void addDoctors(@RequestBody Doctor doc)
    {
        docService.addDoc(doc);
    }
    @GetMapping("{docId}/appointments")
    public ResponseEntity<List<Appointment>> getMyAppointment(@PathVariable Long docId){
        List<Appointment> myAppointment=null;
        HttpStatus status;
        try {
            myAppointment = docService.getMyAppointment(docId);
            if(myAppointment.isEmpty()){
                status=HttpStatus.NO_CONTENT;
            }else{
                status=HttpStatus.OK;
            }
        }catch (Exception e){
            System.out.println("Doctor Id is not valid");
            status=HttpStatus.BAD_REQUEST;
        }
        return  new ResponseEntity<List<Appointment>>(myAppointment,status);
    }
}
