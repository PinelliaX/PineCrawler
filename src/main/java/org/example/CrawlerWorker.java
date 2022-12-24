package org.example;

//import org.jsoup.*;
//import org.jsoup.nodes.*;
//import org.jsoup.select.*;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrawlerWorker {
    public static void main(String[] args) {
//        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
//        System.out.println(doc.title());
//        System.out.println(doc.body());
//
//        Elements links = doc.select("a[href]");
//        System.out.println("Links: " + links.size());
//        for (Element link : links) {
//            System.out.println(link.attr("abs:href"));
//        }

        SpringApplication.run(CrawlerWorker.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}

