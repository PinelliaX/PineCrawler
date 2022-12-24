FROM maven
COPY ./ ./
CMD ["mvn","clean","install","exec:java@crawler"]