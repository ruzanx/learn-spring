# learn-spring

1. create new maven project
2. insert following in pom.xml

<build>
  	<plugins>
  		<plugin>
  			<groupId>org.apache.maven.plugins</groupId>
  			<artifactId>maven-compiler-plugin</artifactId>
  			<version>3.2</version>
  			<configuration>
  				<source>1.8</source>
  				<target>1.8</target>
  			</configuration>
  		</plugin>
  	</plugins>
  </build>

3. add a model
4. add repository for the model
5. extract interface from the repository
6. add service and implement business logics there
7. extract interface from service
8. add spring-context dependency in pom