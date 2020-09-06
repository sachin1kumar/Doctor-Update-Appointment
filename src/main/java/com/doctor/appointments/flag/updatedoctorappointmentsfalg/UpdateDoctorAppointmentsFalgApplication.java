package com.doctor.appointments.flag.updatedoctorappointmentsfalg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class UpdateDoctorAppointmentsFalgApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateDoctorAppointmentsFalgApplication.class, args);
	}

}
