FROM openjdk

COPY java .

WORKDIR /java/com/client

RUN ["javac", "Main.java"]


ENTRYPOINT ["java", "main"]
