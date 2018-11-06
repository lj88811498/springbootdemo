#Dockerfile-package
FROM maven:3.5.0-jdk-8-alpine

LABEL maintainer "misha"

WORKDIR /project
ADD . /project

RUN mvn package -Dmaven.test.skip=true
CMD ["mvn"]


#Dockerfile-publish 
FROM java

LABEL maintainer "misha"

COPY /project/target/labs-demo-0.0.1-SNAPSHOT.jar /usr/src/myapp/labs-demo-0.0.1-SNAPSHOT.jar

WORKDIR /usr/src/myapp/

ENTRYPOINT java -jar labs-demo-0.0.1-SNAPSHOT.jar



#pom.xml
<repositories>
	<repository>
		<id>nexus-daocloud</id>
		<name>Nexus daocloud</name>
		<url>http://nexus.daocloud.io/repository/maven-public/</url>
	</repository>
</repositories>
