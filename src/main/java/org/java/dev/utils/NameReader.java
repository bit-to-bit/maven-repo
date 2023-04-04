package org.java.dev.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.java.dev.App;
import org.java.dev.dto.NameDto;

import java.io.IOException;
import java.io.InputStream;

public class NameReader {
    public static String get() throws IOException {
        try (InputStream stream = App.class.getClassLoader().getResourceAsStream("myName.json")) {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .serializeNulls()
                    .create();
            NameDto nameDto = gson.fromJson(new String(stream.readAllBytes()), NameDto.class);
            return gson.toJson(nameDto);
        }
    }
}