- Spring Guide : [Link](<https://spring.io/guides/gs/rest-service/>)

- what we want is to greet with 'hello world' as response on '/greeting' endpoint and 'Hello User' as response on '/greeting?name=User'

- Initialized a simple project with spring web

- so now we will create a resource representation class for the greetings, it will be a type of JSON, so we'll create a Record for Greeting with id as a parameter and message

- now create a controller file for greeting with @Controller annotation

- in that we'll create a @RequestMapping("/greeting") @ResponseBody annotation for '/greeting' end point

- for id we will need a long which can be updated automatically, so we'll use atomic long counter

- as you know we are sending hello world as a default response and Hello 'name' as response with query param, so we'll need a string template to return as message

- also when we're making a get request on '/greeting', we will require a parameter with value=name, and 'World' as default value,

- @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. If the name parameter is absent in the request, the defaultValue of World is used.

    The implementation of the method body creates and returns a new Greeting object with id and content attributes based on the next value from the counter and formats the given name by using the greeting template.

- @SpringBootApplication is a convenience annotation that adds all of the following:

    @Configuration: Tags the class as a source of bean definitions for the application context.

    @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.

    @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

- now to run this, go in terminal and run this mvn spring-boot:run

- a local host will be created and you can test your api



