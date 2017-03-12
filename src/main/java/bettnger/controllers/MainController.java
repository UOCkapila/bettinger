package bettnger.controllers;

import bettnger.models.Account;
import bettnger.models.Event;
import bettnger.models.Greeting;
import bettnger.repositories.AccountRepository;
import bettnger.repositories.EventRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {

    static final Logger logger = LogManager.getLogger(MainController.class.getName());
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private AccountRepository accountRepository;

//    @RequestMapping("/bettinger/signup")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @RequestMapping("/bettinger/signup")
    public String signUp(Account account) {
        accountRepository.save(account);
        return "success";
    }

    @RequestMapping("/bettinger/user/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/bettinger/user/add/event")
    @ResponseBody
    public String addEvent(Event event) {
//        Event event = new Event(type,dateTime, information);
        try {
            eventRepository.save(event);
        } catch (Exception e) {
            logger.error(e.getMessage());
            System.out.println(e);
            return e.getMessage();
        }
        return "success";
    }

    @RequestMapping("/bettinger/user/get/event")
    public Iterable<Event> getEvent() {
        Iterable<Event> events = eventRepository.findAll();
        return events;

    }
}