package com.example.jdk21test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Jdk21testApplication {

	public static void main(String[] args) {
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, 10_000).forEach(i -> {
				executor.submit(() -> {
					Thread.sleep(Duration.ofSeconds(1));
					return i;
				});
			});
		}
		SpringApplication.run(Jdk21testApplication.class, args);
	}

}
