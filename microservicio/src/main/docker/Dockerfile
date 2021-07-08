FROM openjdk:8-jre-alpine

LABEL maintainer="CouchJava ACastillo andres.castillo@ceiba.com.co"
LABEL authors="Andres Castillos"

ENV JAVA_OPTIONS ""
ENV LOGS_DIR /var/log/app
ENV APP_DIR /usr/share/app

#Create an execution user
RUN adduser -D java

#Create directories for logs and for our java binaries
RUN mkdir -p $LOGS_DIR $APP_DIR && \
    chown -R java $LOGS_DIR $APP_DIR

#Specify that Logs dir can be mounted
VOLUME $LOGS_DIR
ENV LOGGING_FILE $LOGS_DIR/my-app.log

# Exposed Ports
ENV PORT 8888
ENV SERVER_PORT $PORT
EXPOSE $PORT

#Add an entrypoint
#COPY docker-entrypoint.sh /
#RUN chmod u+x /docker-entrypoint.sh &&\
#    chmod java /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]

# All the remaining actions will be performed as user "java"
USER java
# Add generated binaries
ENV JAR_NAME "./buil/libs/adn-0.0.1-SNAPSHOT"
COPY $JAR_NAME.jar $APP_DIR/bin/


#COPY my-application.jar \
#    $APP_DIR/my-app.jar

#CMD java -jar
#    $APP_DIR/my-app.jar

#Command to execute!!
CMD ["java","${JAVA_OPTIONS}","-jar","${APP_DIR}/bin/${JAR_NAME}.jar"]