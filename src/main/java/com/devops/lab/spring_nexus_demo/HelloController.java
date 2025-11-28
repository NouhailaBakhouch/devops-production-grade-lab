package com.devops.lab.spring_nexus_demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indique que cette classe répond à des requêtes HTTP
public class HelloController {

    @GetMapping("/hello") // URL : http://localhost:8080/hello
    public String hello() {
        // on renvoie une petite page HTML très simple
        return """
                <html>
                    <head>
                        <title>Hello Spring</title>
                    </head>
                    <body>
                        <h1>Hello Spring 👋</h1>
                        <p>Contenu très simple pour me rappeler Spring.</p>
                    </body>
                </html>
               """;
    }
    @GetMapping("/me")
    public String me() {
        return "Bonjour, je m'appelle Nouhaila et je revois Spring 😄";
}

}
