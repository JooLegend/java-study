package com.person.person01;

import com.person.person01.controller.Person;
import com.person.person01.dto.PersonRequestDto;
import com.person.person01.repository.PersonRepository;
import com.person.person01.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Person01Application {

    public static void main(String[] args) {
        SpringApplication.run(Person01Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(PersonRepository personRepository, PersonService personService){
        return (args) -> {
            personRepository.save(new Person("이순신",20,"서울"));

            System.out.println("데이터 인쇄");
            List<Person> personList = personRepository.findAll();
            for (int i = 0; i < personList.size(); i++) {
                Person person = personList.get(i);

                System.out.println(person.getId());
                System.out.println(person.getName());
                System.out.println(person.getAge());
                System.out.println(person.getAddress());

            }

//            PersonRequestDto requestDto = new PersonRequestDto("세종",24,"한양");
//            personService.update(1L,requestDto);
//            personList = personRepository.findAll();
//            for (int i = 0; i < personList.size(); i++) {
//                Person person = personList.get(i);
//
//                System.out.println(person.getId());
//                System.out.println(person.getName());
//                System.out.println(person.getAge());
//                System.out.println(person.getAddress());
//            }
//            personRepository.deleteAll();
        };
    }

}
