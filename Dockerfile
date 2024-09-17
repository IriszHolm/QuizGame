FROM ubuntu:20.04

RUN apt update
RUN apt-get install default-jdk -y
COPY . .
RUN javac Main.java

CMD [ "java", "Main"]


