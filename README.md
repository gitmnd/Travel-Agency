# Travel Agency

This project contains the source code for Travel agency. The App has been made using following technologies

`Spring boot` -  Controller
`Spring boot thymeleaf` -  UI
`webjars,bootstrap` - UI

## Table of Contents

* [Prerequisites](#prerequisites)
* [Configuarations](#configuarations)
* [Usage](#usage)
* [Build Information](#build-information)
* [Development Hints - TECHNICAL](#development-hints-technical)

## Prerequisites

* Spring boot 2.0.2 , Java 1.8 , Maven 3 used to setup and run


## Configurations

 ``` application.properties ```


## Usage

* To run this app locally , import the project in to any Editor and look for the <!--comment this when running in local--> entry in pom.xml and do necessary
* Run the TravelAgencyApplication.java from IDE or use maven ( ```spring-boot:run``` )
* Acces local URL using : ``localhost:7201``
* Note (Optional):  Use maven shade pluggin to create a uber jar and run as a standalone spring boot app   

## Build Information

* tomcat7-maven-plugin is used to deploy in to server. More information in JenkinsFile.
* Nexus as artifactory repository



	
