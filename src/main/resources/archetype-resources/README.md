#set( $symbol_pound = '#' )
${symbol_pound}${symbol_pound} ${artifactId}

This is the documentation page of ${artifactId}. This Apache Camel 4 project uses [Spring Boot](https://spring.io/projects/spring-boot) and the [Camel DHIS2 component](https://camel.apache.org/components/3.21.x/dhis2-component.html) to spin up an HTTP server that acts as a proxy for fetching organisation units from a DHIS2 server.

From your terminal, within the project root directory path, enter `mvn clean package` to build the project. Enter `mvn clean package -DskipTests` to build the project without running the test suite. The test suite starts Docker containers so you should skip the tests if you do not have [Docker Engine](https://docs.docker.com/engine/) installed locally. Project settings like the DHIS2 server address can be changed from `application.yaml` in `src/main/resources`. Alternatively, you can override the settings when launching the application as [documented](https://docs.spring.io/spring-boot/docs/2.7.16/reference/html/features.html#features.external-config) in the Spring Boot website.

Run `java -jar target/${artifactId}-${version}.jar` to launch the application from your terminal. The Camel route returning organisation units can be accessed from `http://127.0.0.1:8080/api/orgUnits`. If you included [Hawtio](https://hawt.io/) during archetype generation, the web console can be opened from `http://127.0.0.1:8080/management/hawtio`. Note that the default username is `user` and the default password will be printed in the terminal at the time when your application starts.
