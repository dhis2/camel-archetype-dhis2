## Camel Archetype DHIS2

This [Maven archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) is used to create a template [Apache Camel 4](https://camel.apache.org/) application powered by [Spring Boot](https://spring.io/projects/spring-boot/) that uses the [DHIS2 component](https://camel.apache.org/components/4.4.x/dhis2-component.html). Besides the standard archetype properties, this archetype has other mandatory properties that correspond to modules which can be included or excluded from the template by setting `Y` or `N`. These additional properties are:

| Property name | Description                                                                                                                             |
|---------------|-----------------------------------------------------------------------------------------------------------------------------------------|
| artemis       | Include and configure JMS and [Artemis](https://activemq.apache.org/components/artemis/) modules to stand-up an embedded Artemis server |
| fhir          | Include FHIR module in order to integrate with FHIR repositories                                                                        |
| hawtio        | Include and configure the [Hawtio](https://hawt.io/) module in order to observe and manage the Camel application                        |
| openHim       | Expose the Camel application as an [OpenHIM mediator](https://openhim.org/docs/configuration/mediators/)                                |

### Running Archetype Example

#### Unix Shell
```
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
-DarchetypeGroupId=org.hisp.dhis.integration.camel \
-DarchetypeArtifactId=camel-archetype-dhis2 \
-DarchetypeVersion=2.0.0-SNAPSHOT \
-DgroupId=org.hisp.dhis.integration.camel \
-Dhawtio=Y \
-Dfhir=Y \
-Dartemis=Y \
-DopenHim=Y \
-DartifactId=my-camel-dhis2-app \
-Dversion=1.0.0-SNAPSHOT
```

#### Windows Command Prompt
```
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate ^
-DarchetypeGroupId=org.hisp.dhis.integration.camel ^
-DarchetypeArtifactId=camel-archetype-dhis2 ^
-DarchetypeVersion=2.0.0-SNAPSHOT ^
-DgroupId=org.hisp.dhis.integration.camel ^
-Dhawtio=Y ^
-Dfhir=Y ^
-Dartemis=Y ^
-DopenHim=Y ^
-DartifactId=my-camel-dhis2-app ^
-Dversion=1.0.0-SNAPSHOT
```
