package tiny.service;

import jakarta.inject.Singleton;

import java.util.Random;

@Singleton
public class CreateUrlService {
    private final Random random;

    CreateUrlService() {

        random = new Random();
    }

    public String createUrl(String url) {

        return "https://tinyurl.com/" + random.nextLong();

    }

    private String getTinyUrlFromDatabase(String longUrl) {
        // get the tiny url from the database
        return "https://tinyurl.com/" + longUrl;
    }

}
