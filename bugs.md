
- EGit Follow Renames is not applied for refactoring
- Gradle subprojects{ eclipse { project { name is only applied to root project
- Build fails over possible conflict of shadow and spring-boot-gradle-plugin plugins :  [sh#199](https://github.com/johnrengelman/shadow/issues/199)

	D:\Workspaces\GitHub\monolith>gradle :shadow:shadowJar
	                                                                                                                       
	FAILURE: Build failed with an exception.
	                            
	* What went wrong:          
	Could not resolve all dependencies for configuration ':shadow:runtime'.
	> Could not find org.springframework.boot:spring-boot-starter-data-mongodb:.
	  Searched in the following locations:
	      https://jcenter.bintray.com/org/springframework/boot/spring-boot-starter-data-mongodb//spring-boot-starter-data-mongodb-.pom
	      https://jcenter.bintray.com/org/springframework/boot/spring-boot-starter-data-mongodb//spring-boot-starter-data-mongodb-.jar
	  Required by:              
	      monolith:shadow:1.0 > monolith:io.github.szjug.greeting:1.0
	      monolith:shadow:1.0 > monolith:io.github.szjug.who:1.0
	> Could not find org.springframework.boot:spring-boot-starter-web:.
	  Searched in the following locations:
	      https://jcenter.bintray.com/org/springframework/boot/spring-boot-starter-web//spring-boot-starter-web-.pom
	      https://jcenter.bintray.com/org/springframework/boot/spring-boot-starter-web//spring-boot-starter-web-.jar
	  Required by:              
	      monolith:shadow:1.0 > monolith:io.github.szjug.greeting:1.0
	      monolith:shadow:1.0 > monolith:io.github.szjug.who:1.0
	                            
	* Try:                      
	Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.
	                            
	BUILD FAILED                
	                            
	Total time: 10.006 secs     