import java.org.springframework.web.bind.annotation.GetMapping;
import java.org.springframework.web.bind.annotation.RequestParam;
import java.org.springframework.web.bind.annotation.PostMapping;

public class EmailController{

@GetMapping
public String ShowForm() {
    return "index";
}
}
}
@PostMapping("/Save-Email")
Public.String save_email(@RequestParam("email")string.emailModel model){

if(email == null /!email.endsWith. gmail.com) {
model.addAttribute("message","Invalid Gmail address.");
return "index";
}

try (FileWriter writer = new FileWriter("emails.txt",true)){
write.write(email +"\n");
model.addAttribute("message", "Email saved succesfuly!");

}
catch(IOException e){
e.PrintStackTrace();
model.addAttribute("message" , "Failed to save email.");
return "index";
}
}

