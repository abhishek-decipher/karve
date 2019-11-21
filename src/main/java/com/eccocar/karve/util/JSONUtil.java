package com.eccocar.karve.util;

import com.eccocar.karve.exceptions.KarveException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Map;

public class JSONUtil {

        private static final Logger LOGGER = LogManager.getLogger(JSONUtil.class);

        private JSONUtil() {
        }
        public static <T> T loadJson(final String json, final Class<T> clazz) {
            final ObjectMapper mapper = new ObjectMapper(new JsonFactory());
            try {
                return mapper.readerFor(clazz).readValue(json);
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
                throw new KarveException(e);

            }
        }

    public static Map<String, Object> loadJson(final String json) {
        final ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        try {
            return mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            throw new KarveException(e);
        }
    }

    public static String toJson(final Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new KarveException(e);
        }
    }



}
