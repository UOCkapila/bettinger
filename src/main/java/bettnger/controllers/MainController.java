package bettnger.controllers;

import bettnger.models.Account;
import bettnger.models.Event;
import bettnger.models.Greeting;
import bettnger.repositories.AccountRepository;
import bettnger.repositories.EventRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

//    @RequestMapping("/")
//    @ResponseBody
//    public String index() {
//        return "index";
//    }

    @RequestMapping(value = "/bettinger/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String signUp(@RequestBody Account account, @RequestHeader HttpHeaders headers, HttpServletRequest httpRequest) {
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

    @RequestMapping("/bettinger/user/get/account")
    public Account getAccount(String userName){
        Account account = accountRepository.findByUsername(userName);
        return account;
    }
}