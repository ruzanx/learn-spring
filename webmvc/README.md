# learn-spring

1. create new maven project with maven-archetype-webapp
2. insert following in pom.xml

<dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-webmvc</artifactId>
    	<version>4.3.5.RELEASE</version>
    </dependency>
    <dependency>
    	<groupId>javax.servlet</groupId>
    	<artifactId>servlet-api</artifactId>
    	<version>2.5</version>
    	<scope>provided</scope>
    </dependency>
    <dependency>
    	<groupId>javax.servlet</groupId>
    	<artifactId>jstl</artifactId>
    	<version>1.2</version>
    	<scope>provided</scope>
    </dependency>