## Quarkus Maven Packaging Bug Reproducer

- cd plugin
  - mvn install 
- cd example
  - mvn package # works
  - mvn compile quarkus:dev # fails with error

```
[ERROR] Failed to execute goal io.quarkus:quarkus-maven-plugin:0.13.1:dev (default-cli) on project quarkus-maven-packaging-bug-example: Failed to run: Failed to resolve Quarkus application model: Failed to resolve dependencies for com.acme:quarkus-maven-packaging-bug-example:blah:1.0-SNAPSHOT: Could not find artifact com.acme:quarkus-maven-packaging-bug-example:blah:1.0-SNAPSHOT -> [Help 1]
```
