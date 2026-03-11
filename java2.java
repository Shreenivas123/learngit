import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {

    @GetMapping("/")
    public String home() {
        return "Welcome to my Java Web App!";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Java!";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
