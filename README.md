# Spring Boot with Kafka Producer Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON message to a Kafka topic

## On Linux Machine

## Start Zookeeper
    bin/zookeeper-server-start.sh ../config/zookeeper.properties

## Start Kafka Server
    bin/kafka-server-start.sh ../config/server.properties

## Create Kafka Topic
    bin/kafka-topics.sh --create --topic exampletopic --bootstrap-server localhost:9092

## modify partition number to 4
    bin/kafka-topics.sh --bootstrap-server localhost:9092 --alter --topic exampletopic --partitions 4

## modify retention time to 86400000 ms
    bin/kafka-configs.sh --bootstrap-server localhost:9092 --alter --entity-type topics --entity-name exampletopic --add-config retention.ms=86400000

## -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## On Windows Machine

## Start Zookeeper
    bin/windows/zookeeper-server-start.bat ../../config/zookeeper.properties

## Start Kafka Server
    bin/windows/kafka-server-start.bat ../../config/server.properties

## Create Kafka Topic
    bin/windows/kafka-topics.sh --create --topic exampletopic --bootstrap-server localhost:9092

## modify partition number to 4
    bin/windows/kafka-topics.bat --bootstrap-server localhost:9092 --alter --topic exampletopic --partitions 4

## modify retention time to 86400000 ms
    bin/windows/kafka-configs.bat --bootstrap-server localhost:9092 --alter --entity-type topics --entity-name exampletopic --add-config retention.ms=86400000



## Publish message via WebService
- `http://localhost:8081/avanade/publish/nome1`
- `http://localhost:8081/avanade/publish/nome2`



