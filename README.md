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

### Step 3 : Deploy manualy

Copy the generated app.war to Tomcat Directory/webapps/

### Step 3 : Deploy using maven plugin

1. Add an user with roles `manager-gui` and `manager-script` in path  `%TOMCAT7_PATH%/conf/tomcat-users.xml`

        <user username="tomcat" password="123456" roles="manager-gui,manager-script"/>

2. Add above Tomcat’s user in the Maven setting file, later Maven will use this user to login Tomcat server ,in path `%MAVEN_PATH%/conf/settings.xml`.

		 <server>
		    <id>tomcat</id>
		      <username>tomcat</username>
		     <password>123456</password>
	     </server>	   

3. Declare a Maven Tomcat plugin.

		<plugin>
			<groupId>org.apache.tomcat.maven</groupId>
			<artifactId>tomcat7-maven-plugin</artifactId>
			<version>2.2</version>
			<configuration>
				<url>http://localhost:8080/manager/text</url>
				<server>TomcatServer</server>
				<path>/mkyongWebApp</path>
			</configuration>
	    </plugin>

4. Commands to manipulate WAR file on Tomcat.
   
    	mvn tomcat7:deploy 

# Authors
 + [**Sallak Imane**](https://github.com/SallakImane) 
