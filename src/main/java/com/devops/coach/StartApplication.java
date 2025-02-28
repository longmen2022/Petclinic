package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        // Get today's date
        String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d, yyyy"));

        // Update messages with today's date and your name
        model.addAttribute("title", "Welcome folks..We are learning Kubernetes Deployment using Helm, Jenkins Pipeline. Today's date is " + todayDate);
        model.addAttribute("msg", "Hello All..This is Long Men. We are deploying a Spring Boot application into an EKS cluster using Helm + Jenkins Pipeline!!!!");

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
