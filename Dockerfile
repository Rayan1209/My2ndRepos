
#Pull Tomcat Base Image
FROM tomcat:8-jre8

#Maintainer
MAINTAINER ByBuzz

#Image Build Steps :

#Working directory
#WORKDIR

#Copy App War file into tomcat server running inside the container
COPY ./GitTest2-0.0.1-SNAPSHOT.war  /usr/localtomcat/webapps
