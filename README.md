# tagSvc

* Sample microservice with SpringBoot
* To run, go to prompt and "gradlew bootrun"
    * Requires internet connection  to download dependencies

## Database
* Uses in memory database H4 and Hibernate
* Uses Flyway to create schema and sample data at the beginning
    * DDL and DML are under resources/db/migration
    * These database tables will be removed from memory after each run
* Pay attention to the /repository/TagRepository.java
    * It is an interface only
    * We don't need actual implementation
    * Many of the CRUD operations are available just by this

## Security
* Spring security is in the classpath, but disabled in application.properties
* if enabled, will prompt for user name and password
    * User name: admin
    * Password: A GUID will be printed in the console log, when service starts

## REST interface
* GET /console 
    * H4 database console
* GET /tags
    * return all tags
* POST /tags
    * add a list of tags
```json
    [
        {
            "name": "TAG.HOME1.AC1.CURRENT",
            "type": "CURRENT"
        },
        {
            "name": "TAG.HOME1.AC2.CURRENT",
            "type": "CURRENT"
        }
    ]
```

NOTE:
- I added some error checking etc. as a sample, to give an idea
- Not all REST verbs are implemented