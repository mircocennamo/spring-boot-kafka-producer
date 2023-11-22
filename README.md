# Spring Boot with Kafka Producer Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON message to a Kafka topic

## On Linux Machine

## Start Zookeeper
    bin/zookeeper-server-start.sh ../config/zookeeper.properties

## Start Kafka Server
    bin/kafka-server-start.sh ../config/server.properties

## Create Kafka Topic
    bin/kafka-topics.sh --create --topic exampletopic --bootstrap-server localhost:9092

## Modify partition number to 4
    bin/kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic exampletopic --partitions 4

## Modify retention time to 86400000 ms
    bin/kafka-configs.sh --bootstrap-server localhost:9092 --alter --entity-type topics --entity-name exampletopic --add-config retention.ms=86400000

## -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## On Windows Machine

## Start Zookeeper
    bin/windows/zookeeper-server-start.bat ../../config/zookeeper.properties

## Start Kafka Server
    bin/windows/kafka-server-start.bat ../../config/server.properties

## Create Kafka Topic
    bin/windows/kafka-topics.bat --create --topic exampletopic --bootstrap-server localhost:9092

## Modify partition number to 4
    bin/windows/kafka-topics.bat --bootstrap-server localhost:9092 --alter --topic exampletopic --partitions 4

## Modify retention time to 86400000 ms
    bin/windows/kafka-configs.bat --bootstrap-server localhost:9092 --alter --entity-type topics --entity-name exampletopic --add-config retention.ms=86400000



## Publish message via WebService
- curl --location 'localhost:8081/avanade/publish/newUser' --header 'Content-Type: application/json' --data '{"name":"bob","dept": "engineering","salary": "100000"}'
- curl --location 'localhost:8081/avanade/publish/newUserCallBack' --header 'Content-Type: application/json' --data '{"bob":"wee","dept": "engineering","salary": "800000"}'



