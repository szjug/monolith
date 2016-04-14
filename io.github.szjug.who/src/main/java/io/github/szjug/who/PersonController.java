package io.github.szjug.who;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final AtomicLong counter = new AtomicLong();
    Map<Integer, Person> map = new HashMap<>();
    
    PersonController(){
    	map.put(Integer.valueOf(1), new Person(1, "Antony"));
    	map.put(Integer.valueOf(2), new Person(2, "Brent"));
    }

    @RequestMapping("/person")
    public Person greeting(@RequestParam(value="id", defaultValue="0") int id) {
    	counter.incrementAndGet();
        return map.get(Integer.valueOf(id));
    }
}
