package org.example.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class JsonFormatter {

    private static Logger LOGGER = LoggerFactory.getLogger(JsonFormatter.class);

    public static String formatObjectToJson(Object object) {

        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return  objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (Exception e){
            LOGGER.info("Unable to convert Object to JSON {}",e.getMessage());
            return null;
        }
    }

    private JsonFormatter() {
        throw new IllegalStateException("Utility Class");
    }
}
