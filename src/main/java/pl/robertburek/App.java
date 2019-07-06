package pl.robertburek;

import lombok.extern.java.Log;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;


/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) throws Exception {

        //Tworzymy klienta http
        OkHttpClient client = new OkHttpClient();

        //Tworzemy zapytanie http (gdzie są dane?)
        // generator xml : https://countwordsfree.com/xmlviewer#save
        Request request = new Request.Builder()
                .url("https://countwordsfree.com/download/txt/34d6c2f8-a9b3-4b3d-a6c8-3302ebc4a588")
                .build();

        //Tworzymy reakcję na pobranie lub nie pobranie danych
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                log.info(e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String xml = response.body().string();
                Serializer serializer = new Persister();
                try {
                    Ubranie noweUbranie = serializer.read(Ubranie.class, xml);
                    log.info(noweUbranie.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        log.info("koniec bloku");
    }
}
