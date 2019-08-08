# Java-war-maven-basics

Example project of how to use maven to deploy jar file.

# Getting Started 

## Apache Maven Project Structure 

[The project's structure looks like this](https://maven.apache.org/plugins/maven-war-plugin/usage.html)

### Step 1 : Create Project  

1. Generate a new project from an archetype with this command:

		mvn archetype:generate -DgroupId=com.imane -DartifactId=project-4 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

2. Add in pom.xml the plugin :

   + `maven-compiler-plugin` : set compiler support java 11

3. Add in pom.xml the dependency 
  
   + `javax.servlet-api` : Java Servlet API

3.  Create a Java Servlet ”src/main/java/com/imane/App.java” that extends `HttpServlet` and redefine doGet() methode.

### Step 2 : Compile and Build

1. Take the compiled code and package it in its distributable format WAR with this command : 

		mvn package

### Step 3 : Deploy

Copy the generated app.war to Tomcat Directory/webapps/

# Authors
 + **Sallak Imane** 
