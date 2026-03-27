# UrlScanner

#This is urlScanner in this url Scanner online one url is add in the database table if someone else
# same person add new same url it give or thrown exception

#project structure

-AppConfig(ModelMapper)
-controller(addUrl)
-service(BusinessLogic)
-repo(database(connection))
-entity(userTable)
-dto(dto of entity)


#properties
-spring.datasource.url=jdbc:postgresql://localhost:5432/urlscanner
-spring.datasource.username=
-spring.datasource.password=
-spring.jpa.hibernate.ddl-auto=create
-spring.jpa.show-sql=true

-server.port=8081


#dependencies
-spring-boot-web
-spring-boot-jpa
-spring-boot-postgresql
-spring-boot-lombok
-spring-boot-modelMapper


#Assignment Question

q:what happens when you type a url in the browser
 # when we have the write the url it add in database but when we add again same url it thrown exception

q:which version of java and spring boot do you currently use?

# Spring Boot :: (v3.5.13)
# Java 17.0.12

#@springBootApllication : it is manage all annotation is manage by spring boot using @componentScan
# and @EnableAutoConfiguration

#@Entity: In sql data this annotation used to make a class as table in database.

#@Service: The service annotation is manage all Business logics and connect to database and when call to api it perfoem the action on database

#@Autowired : Autowired annotation is used to inject the dependency to the using @Autowried 
# there are three type field injection , construction injection , setter-based

#@Repository:This is the annotation which make a interface to extend to JpaRepository and make all the query to database

#@Id: This annotation is used to make a primary key in the table which is uniquely define not stored the duplicate key

#@Transactional : it is make a presistancecontext which is take the previous hibernate query and then when we 
# run the new query it check first persistentcontext if exist give other wise find so when code run succesfully then 
# come out from the code run all the part which is return in the query

