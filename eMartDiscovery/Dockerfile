# Install the base requirements for the app.
# This stage is to support development.
FROM java:8
ADD target/emart.discovery-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]