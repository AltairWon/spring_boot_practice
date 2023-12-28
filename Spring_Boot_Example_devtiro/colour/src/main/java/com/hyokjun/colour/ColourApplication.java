package com.hyokjun.colour;

import com.hyokjun.colour.services.ColourPrinter;
import com.hyokjun.colour.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColourApplication implements CommandLineRunner {

	private final ColourPrinter colourPrinter;

	public ColourApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColourApplication.class, args);
	}

	@Override
	public  void run(final String... args) {
		log.info(colourPrinter.print());
	}

}
