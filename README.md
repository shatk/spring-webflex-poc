# myspringwebfluxplanet
Spring Webflux example project

The corresponding blog post can be found here: 

https://mydeveloperplanet.wordpress.com/2018/03/07/spring-webflux-getting-started/

> To build the project :

mvn clean install

> To run the project :

java -jar target/myspringwebfluxplanet-1.0-SNAPSHOT.jar 

or use STS 

--- CURL Request ---

curl --location --request GET 'http://localhost:8080/hello' \
--header 'Content-Type: application/json'

--- API Response ---

200OK
Hello, Spring!









