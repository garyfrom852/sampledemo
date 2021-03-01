# Sample Demo System

## Introduction
This is a simple application with three web pages for the user can browse all his/her Samples from index page with maximum result control and expiry day if it will be expired in 7 days. Also, can click the “Detail” button to look for more details and check for which Container it is in.

### Setup
-After the project pull from GitHub, Please Refresh Gradle Dependencies first.
-Check your device port availability that incase your can change the [server.port] value at application.propertites from resources folder.
-You can run this Spring Boot application now.

### Project Structure
•	Inside com.example.demo:
	o	Config package – It is the main area application config from Spring Application.
	o	Controller package – It is all the controller access point from the client-side.
	o	Dao – data model
	o	Exception – It contain a global exception handler to handle all the exception case to meaningful error message to user.
	o	Response – It contains a response object to for RestTemplate exchange from Api.
	o	Services – Business logic services class.
•	Inside resources:
	o	Application.properties – It includes the global statics value and server config.
	o	Inside templates – all the Thymeleaf html 

