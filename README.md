# Api

This source code is part of a blogpost about what you need to configure to enable Application Insights with distributed tracing (correlation) for your Angular-Java stack.

More info: A quick intro: Application Insights for your Angular Java stack

To setup the demo:

```
mvnw clean install
```

Update the properties file to include the correct Instrumentation Key (/src/main/resources/application.properties)

```
azure.application-insights.instrumentation-key=#{INSTRUMENTATION_KEY}#
spring.application.name=api
```

To run the demo api:

```
mvnw spring-boot:run
```


