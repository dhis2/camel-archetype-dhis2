## Camel Archetype DHIS2

This [Maven archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) is used to create a template [Apache Camel 3](https://camel.apache.org/) application Maven project that uses the [DHIS2 component](https://camel.apache.org/components/4.0.x/dhis2-component.html). Besides the standard archetype properties, this archetype has other mandatory properties that correspond to modules which can be included or excluded from the template by setting `Y` or `N`. These additional properties are:

| Property name | Description                                                                                  |
|---------------|----------------------------------------------------------------------------------------------|
| artemis       | Include and configure JMS and Artemis modules to stand-up an embedded Artemis server         |
| datasonnet    | Include DataSonnet module to apply template-based transformations                            |
| fhir          | Include FHIR module in order to integrate with FHIR repositories                             |
| hawtio        | Include and configure the Hawtio module in order to observe and manage the Camel application |

Running archetype example:
```
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
-DarchetypeGroupId=org.hisp.dhis.integration.camel \
-DarchetypeArtifactId=camel-archetype-dhis2 \
-DarchetypeVersion=1.0.3 \
-DgroupId=org.hisp.dhis.integration.camel \
-Dhawtio=Y \
-Ddatasonnet=Y \
-Dfhir=Y \
-Dartemis=Y \
-DartifactId=my-camel-dhis2-app \
-Dversion=1.0.0-SNAPSHOT
```