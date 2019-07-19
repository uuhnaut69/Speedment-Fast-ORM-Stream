package com.uuhnaut69.springspeedment;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		SpringApplication.run(App.class, args);
	}
}
