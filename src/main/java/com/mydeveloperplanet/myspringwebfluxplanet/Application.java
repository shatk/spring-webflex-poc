package com.mydeveloperplanet.myspringwebfluxplanet;

import com.mydeveloperplanet.myspringwebfluxplanet.greeting.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration 
@SpringBootApplication    
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    } 
}
