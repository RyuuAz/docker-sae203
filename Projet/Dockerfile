FROM debian:latest

RUN apt-get update && apt-get install -y openjdk-11-jdk

COPY ./*.java /app/

RUN javac /app/*.java

EXPOSE 9000 

CMD ["java", "-classpath", "/app", "ChatServer"]