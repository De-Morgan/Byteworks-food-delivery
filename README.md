# Byteworks-food-delivery Api
"You are to design and implement a RESTFUL API that will allow developers to order for food from the vendor, from a menu of predefined meal options. Each meal option has a fixed price. When a developer request for food from the vendor, your endpoint should respond to the cost of the meal.". This is a statement from the assement project as can be found here: https://gitlab.byteworks.com.ng/bw-assessment/bw.backend.javahttps://gitlab.byteworks.com.ng/bw-assessment/bw.backend.java

## How to get the project running

1. **Clone the project**

2. The project uses Mongo database, so it is required that you have [Mongodb](https://docs.mongodb.com/manual/installation/) install on your system.

3. Onces you run the project, a number of Meal items are created in the database using the CommandLineRunner.


#API ENDPOINTS

1. ##Food Api endpoints

| **HTTP VERBS** | **ENDPOINTS**                 | **DESCRIPTION**
| -------------- | ----------------------------- | ----------------------------
|GET             | api/v1/foods                  | Get the total food available
|GET             | api/v1/foods/{foodName}       | Get a particular food by name



1. ##User Api endpoints

| **HTTP VERBS** | **ENDPOINTS**                 | **DESCRIPTION**
| -------------- | ----------------------------- | ----------------------------
| POST           | api/v1/users                  | Register a user



1. ##Order Api endpoints

| **HTTP VERBS** | **ENDPOINTS**                 | **DESCRIPTION**
| -------------- | ----------------------------- | ----------------------------
|GET             | api/v1/orders                 | Get all the available orders
|POST            | api/v1/orders                 | post food other 
|GET             | api/v1/orders/{developerName} | get all the others by a developer


You can also see the Swagger2 documentation: http://localhost:8080/swagger-ui.html





