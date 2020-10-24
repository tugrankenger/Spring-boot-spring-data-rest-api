# Spring-boot-spring-data-rest-api
java spring boot-data rest api CRUD 

Create rest api and use the http request methods for CRUD to database, these functions are quite simple with spring-data-rest :white_check_mark:

-First, create database (databaseName:lost, tableName:actors) and i will add few character of lost movie i love :

![db](https://user-images.githubusercontent.com/56650527/97080132-e9e7e800-1601-11eb-99ce-dd3af88fbafd.png)

now, go to:
```
https://start.spring.io/ 
```
and create spring initializr :

![initializr](https://user-images.githubusercontent.com/56650527/97080142-fc622180-1601-11eb-9977-ee90284a57ca.png)

now, open the file downloaded from the start.spring and write required codes :

![intellij-1](https://user-images.githubusercontent.com/56650527/97080168-20bdfe00-1602-11eb-9235-46ef8d99ed72.png)
![intellij-2](https://user-images.githubusercontent.com/56650527/97080181-3c290900-1602-11eb-9c25-1ee3c0464d24.png)
![intellij-3](https://user-images.githubusercontent.com/56650527/97080204-65499980-1602-11eb-87aa-209f172762eb.png)
![intellij-4](https://user-images.githubusercontent.com/56650527/97080216-6ed30180-1602-11eb-97e0-f69fb9c98a5a.png)
![intellij-5](https://user-images.githubusercontent.com/56650527/97080219-71355b80-1602-11eb-806d-0c96173593e5.png)
![intellij-6](https://user-images.githubusercontent.com/56650527/97080221-74304c00-1602-11eb-8d9d-c4ec4b88a84e.png)
![intellij-7](https://user-images.githubusercontent.com/56650527/97080224-78f50000-1602-11eb-9b2c-f97d2baae53f.png)
![intellij-8](https://user-images.githubusercontent.com/56650527/97080227-80b4a480-1602-11eb-8832-f5066c6e4f8f.png)

now, inject the database in project and set port number : 
## Note:
* if you want to run the project on your computer, you must be configure again to your database for database connection

![application-properties](https://user-images.githubusercontent.com/56650527/97080249-a2ae2700-1602-11eb-8f52-4235e247221e.png)

- [x] Let's open the postman and test the http request methods :

![rest-api-crud](https://user-images.githubusercontent.com/56650527/97080257-ae015280-1602-11eb-9da2-026caeaee7b7.gif)
