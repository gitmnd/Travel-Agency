FROM openjdk:8-jdk-alpine
COPY Travel-Agency/target/TravelAgency.war /usr/
ARG version=local
ARG runtime=dev
ENV VERSION $version
ENV RUNTIME $runtime