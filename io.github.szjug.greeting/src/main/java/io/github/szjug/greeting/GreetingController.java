package io.github.szjug.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.szjug.who.Person;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingRepository repository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	Greeting greeting = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    	repository.save(greeting);
        return greeting;
    }

    @RequestMapping("/greetingto")
    public Greeting greeting(@RequestParam(value="id", defaultValue="0") int id) {
        RestTemplate restTemplate = new RestTemplate();
        Person person = restTemplate.getForObject("http://localhost:8090/person?id="+id, Person.class);
        Greeting greeting = new Greeting(counter.incrementAndGet(),
                            String.format(template, person!=null?person.getName():"#"+id ));
    	repository.save(greeting);
        return greeting;
    }

}
