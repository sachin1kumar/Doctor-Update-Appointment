package com.doctor.appointments.flag.updatedoctorappointmentsfalg.controllers;

import com.doctor.appointments.flag.updatedoctorappointmentsfalg.model.DoctorAppointments;
import com.doctor.appointments.flag.updatedoctorappointmentsfalg.repositories.DoctorAppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor-update-appointments")
public class DoctorUpdateAppointmentsController {

    @Autowired
    private DoctorAppointmentsRepository doctorAppointmentsRepository;

    @RequestMapping(value = "/", method = RequestMethod.PATCH)
    public ResponseEntity<String> setAppointmentFlag(@RequestBody DoctorAppointments doctorAppointments) {
        DoctorAppointments currentDoctorAppointments = doctorAppointmentsRepository.findById(doctorAppointments.getId()).get();
        currentDoctorAppointments.setAppointment_limit(doctorAppointments.getAppointment_limit());
        currentDoctorAppointments.setNext_appointment_limit(doctorAppointments.getNext_appointment_limit());
        currentDoctorAppointments.setEnable_disable(doctorAppointments.isEnable_disable());
        currentDoctorAppointments.setToday_date(doctorAppointments.getToday_date());
        doctorAppointmentsRepository.save(currentDoctorAppointments);
        return ResponseEntity.status(HttpStatus.OK).build();
    }



}
