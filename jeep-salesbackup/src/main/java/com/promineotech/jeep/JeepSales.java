package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.promineotech.ComponentScanMarker;


@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})
public class JeepSales {

	// add a comment to test something 
	
	public static void main(String[] args) {
		SpringApplication.run(JeepSales.class, args);

	}

}
