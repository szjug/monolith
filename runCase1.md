
run io.github.szjug.greeting and io.github.szjug.who apps in parallel, e.g.

	$ start gradle :io.github.szjug.greeting:bootRun 
	$ start gradle :io.github.szjug.who:bootRun



- <http://localhost:8080/greeting?name=Florian>  
- <http://localhost:8090/person?id=1>  
- <http://localhost:8080/greetingto?id=2>  

It works. 

/io.github.szjug.greeting/src/main/java/io/github/szjug/greeting/GreetingController.java has

    RestTemplate restTemplate = new RestTemplate();
    Person person = restTemplate.getForObject("http://localhost:8090/person?id="+id, Person.class);

/io.github.szjug.who/src/main/resources/application.properties

	server.port = 8090

The problem, this was done in an assumption that 2 apps will run locally on known ports.

Now try to make it one app and run.

The shadow plugin fails.
