package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.org.springframework.steryotype.controller;
import java.org.springframework.ui.Model;
import java.org.springframework.web.bind.annotation.GetMapping;
import java.org.springframework.web.bind.annotation.RequestParam;
import java.org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
public class JavaGmailwiev {

    public static void main(String args[]) {

@Controller
public class EmailController{

@GetMapping
public String ShowForm() {
    return "index";
   }
}

@PostMapping("/Save-Email")
Public.string save_email(@RequestParam("email")String email; Model model]){

if(email == null /!email.endsWith. gmail.com) {
model.addAttribute("message","Invalid Gmail address.");
return "index";
}

try (FileWriter writer = new FileWriter("emails.txt",true));
write.write(email +"\n");
model.addAttribute("message", "Email saved succesfuly!");

catch(IOException e){
e.PrintStackTrace();
model.addAttribute("message" , "Failed to save email.");
return "index";
}
}
}
}
