package br.com.mynetwork.mynetwork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.mynetwork.mynetwork.enumeration.Status;
import br.com.mynetwork.mynetwork.model.Server;
import br.com.mynetwork.mynetwork.repository.ServerRepository;

@SpringBootApplication
public class MynetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MynetworkApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.1", "Ubuntu 19", "16 Gb", "PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.2", "Ubuntu 20", "15 Gb", "PC",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
		};
	}

}
