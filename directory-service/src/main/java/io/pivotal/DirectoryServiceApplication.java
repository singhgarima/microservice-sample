package io.pivotal;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.pivotal.directoryservice.controller.domain.Directory;
import io.pivotal.directoryservice.controller.domain.Person;
import io.pivotal.directoryservice.controller.repository.DirectoryRepository;

import static java.util.Arrays.asList;

@SpringBootApplication
public class DirectoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirectoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner addPersons(DirectoryRepository repo){
        return args -> {
            List<Person> people = asList(
                    new Person("John","Doe","john@email.com","Denver,CO","1-800-9012345"),
                    new Person("Carl","Doe","carl@email.com","Albuquerque,NM","404-2346781"),
                    new Person("Trish","Doe","trish@email.com","Miamu,FL","305-4562789")
            );

            repo.save(new Directory("my-directory", people));
        };
    }
}
