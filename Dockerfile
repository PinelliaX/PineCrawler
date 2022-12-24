FROM maven
COPY pom.xml .
RUN mvn clean install
COPY src ./src
CMD ["mvn","spring-boot:run"]