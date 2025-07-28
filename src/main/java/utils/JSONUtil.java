package utils;

import DTO.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utility class for converting {@link Transaction} objects to JSON strings.
 * <p>
 * This class uses the Jackson {@link ObjectMapper} to serialize Java objects.
 * It provides a static method to transform a {@code Transaction} instance into its JSON representation.
 * </p>
 *
 * <p>Example usage:
 * <pre>
 *     String json = JSONUtil.convertTransactionToJson(transaction);
 * </pre>
 * </p>
 *
 * <p>If the serialization fails, the method logs the stack trace and returns {@code null}.</p>
 */
public class JSONUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String convertTransactionToJson(Transaction transaction) {
        try {
            return objectMapper.writeValueAsString(transaction);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
