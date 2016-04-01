
run io.github.szjug.greeting and io.github.szjug.who apps in parallel, e.g.

	$ start gradle :io.github.szjug.greeting:bootRun 
	$ start gradle :io.github.szjug.who:bootRun



http://localhost:8080/greeting?name=Florian
http://localhost:8090/person?id=1
http://localhost:8080/greetingto?id=2