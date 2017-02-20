package bettnger;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello, %s!";

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

}