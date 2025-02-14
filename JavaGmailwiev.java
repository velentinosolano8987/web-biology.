/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class JavaGmailwiev {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }
}

package com.example.demo;

import java.org.springframework.steryotype.controller;
import java.org.springframework.ui.Model;
import java.org.springframework.web.bind.annotation.GetMapping;
import java.org.springframework.web.bind.annotation.RequestParam;
import java.org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController{

@GetMapping
public String ShowForm() {
    return "index";
   }
}

@PostMapping("/Save-Email")
Public string save.Email(@RequestParam("email")String email,Model Model{

if((email == null /!email.endsWith (@gmail.com ){
model.addAttribute("message","Invalid Gmail address.");
return."index";)
}

try(FileWriter writer = new FileWriter("emails.txt",true))
write.write(email +"\n");
model.addAttribute("message", "Email saved succesfuly!")
}catch(IOException e){
e.PrintStackTrace();
model.addAttribute("message" , "Failed to save email.");
Return "index";

