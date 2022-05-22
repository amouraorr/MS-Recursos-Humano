package br.com.alex.userapi;

import br.com.alex.userapi.domain.User;
import br.com.alex.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import java.util.List;


@SpringBootApplication
@EnableEurekaClient
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Alexsadro Mourão", "alexsandro@mail.com", "123", 20.0),
                new User(null, "Jp Oliveira", "jp@mail.com", "123", 30.0)
        ));
    }
}
