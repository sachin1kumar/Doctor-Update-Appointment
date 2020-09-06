package com.doctor.appointments.flag.updatedoctorappointmentsfalg.repositories;

import com.doctor.appointments.flag.updatedoctorappointmentsfalg.model.DoctorAppointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface DoctorAppointmentsRepository extends JpaRepository<DoctorAppointments, BigInteger> {
}
