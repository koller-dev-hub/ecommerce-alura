package code.koller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import java.util.regex.Pattern;

public class LogService {
    public static void main(String[] args) {
        var logService = new LogService();
        try (var consumer = new KafkaService(LogService.class.getSimpleName(), Pattern.compile("ECOMMERCE.*"), logService::parse)) {
            consumer.run();
        }
    }

    private void parse(ConsumerRecord<String, String> record) {
        System.out.println("------------ ### ------------");
        System.out.println("LOG: " + record.topic());
        System.out.println(record.key());
        System.out.println(record.value());
        System.out.println(record.partition());
        System.out.println(record.offset());
    }
}
