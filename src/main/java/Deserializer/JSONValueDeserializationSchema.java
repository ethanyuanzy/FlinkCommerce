package Deserializer;

import DTO.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class JSONValueDeserializationSchema implements DeserializationSchema<Transaction> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void open(InitializationContext context) throws Exception {
        DeserializationSchema.super.open(context);
    }

    @Override
    public Transaction deserialize(byte[] bytes) throws IOException {
        System.out.println(Transaction.class.getName());
        return objectMapper.readValue(bytes, Transaction.class);
    }

    @Override
    public boolean isEndOfStream(Transaction transaction) {
        return false;
    }

    @Override
    public TypeInformation<Transaction> getProducedType() {
        return TypeInformation.of(Transaction.class);
    }

    public static void main(String[] args) throws Exception {
        String json = "{"
                + "\"transactionId\": \"TX123\","
                + "\"productId\": \"P123\","
                + "\"productName\": \"Widget\","
                + "\"productCategory\": \"Gadgets\","
                + "\"productPrice\": 9.99,"
                + "\"productQuantity\": 2,"
                + "\"productBrand\": \"Acme\","
                + "\"totalAmount\": 19.98,"
                + "\"currency\": \"USD\","
                + "\"customerId\": \"CUST001\","
                + "\"transactionDate\": \"2024-07-23T14:00:00.000Z\","
                + "\"paymentMethod\": \"Credit Card\""
                + "}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX"));
        Transaction tx = mapper.readValue(json, Transaction.class);
        System.out.println(tx);
    }
}
