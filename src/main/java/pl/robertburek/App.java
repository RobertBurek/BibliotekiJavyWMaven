package pl.robertburek;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.java.Log;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) throws Exception {

        //Tworzymy klienta http
        OkHttpClient client = new OkHttpClient();

        //Tworzemy zapytanie http (gdzie są dane?)
        // generator Json : https://www.json-generator.com/
        Request request = new Request.Builder()
                .url("http://www.json-generator.com/api/json/get/cgdEyBqTCa?indent=2")
                .build();

        //Tworzymy reakcję na pobranie lub nie pobranie danych
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                log.info(e.toString());
            }
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String json = response.body().string();
                Type type = new TypeToken<List<Ubranie>>() {
                }.getType();
                List<Ubranie> ubrania = new Gson().fromJson(json, type);
                log.info(ubrania.get(0).toString());
                log.info(ubrania.toString());
            }
        });

        log.info("koniec bloku");
    }
}
