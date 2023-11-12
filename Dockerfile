FROM openjdk:20
ENV MONGO_URI=mongodb://localhost:27017/my_db
LABEL maintainer="a.nyang@gmx.de"
EXPOSE 8080
ADD backend/target/testFullstack.jar testFullstack.jar
CMD [ "sh", "-c", "java -jar /testFullstack.jar" ]