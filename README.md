# monolith
Make your app monolith

Modern framework target cloud environment and suppose you to pursue distributed deployment right from the beginning.
But with more than one app already, we as developer have to handle growing complexity of data exchange between apps 
and solve problems like orchestration,
that may be handled automatically by cloud PaaS, but add unneeded concerns when running on one machine would be enough, 
e.g. for UAT functional testing, or first versions with limited local user base and existing server.

This work explores how to make two or more apps run as one process, e.g. starting from one .jar file, 
using in memory calls instead of converting objects into JSON text.

## Case 1

Make 2 Spring Boot app (that call one another) to run as one app.


## History

This start as panel discussion on one of [SZJUG](http://szjug.github.io/) meeting.
