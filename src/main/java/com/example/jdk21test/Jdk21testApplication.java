package com.example.jdk21test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Jdk21testApplication {

	public static void main(String[] args) {
		/*try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, 10_000).forEach(i -> {
				executor.submit(() -> {
					Thread.sleep(Duration.ofSeconds(1));
					return i;
				});
			});
		}*/

		출처: https://mangkyu.tistory.com/317 [MangKyu's Diary:티스토리]
		SpringApplication.run(Jdk21testApplication.class, args);
	}

}
