- run docker

```bash
docker-compose up -d
```

- run view logs

```bash
docker-compose logs zookeeper
```

- access container

```bash
docker-compose exec kafka bash
```

- create topic

```bash
kafka-topics --create --topic LOJA_NOVO_PEDIDO --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1
```

- view topic created 

```bash
kafka-topics --list --bootstrap-server localhost:9092
```

- access producer for send message

```bash
kafka-console-producer --broker-list localhost:9092 --topic LOJA_NOVO_PEDIDO
```

- read messages of topic

```bash
kafka-console-consumer --bootstrap-server localhost:9092 --topic LOJA_NOVO_PEDIDO --from-beginning
```

- view all groups

```bash
kafka-consumer-groups.sh --all-groups --bootstrap-server localhost:9092 --describe
```
