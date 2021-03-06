package com.gbahut.surfDiary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner()
    {
        return args -> {
            System.out.println(
                "Nice way to create the command line runner with lambda");


        };
    }

}


