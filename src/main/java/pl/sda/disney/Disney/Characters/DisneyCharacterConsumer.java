package pl.sda.disney.Disney.Characters;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class DisneyCharacterConsumer {


    public static final String HTTPS_API_DISNEYAPI_DEV_CHARACTERS = "https://api.disneyapi.dev/characters";
    private final RestTemplate restTemplate;

    public DisneyCharacterConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DisneyCharacterResponse consume(Optional<Integer> page) {
        String url = HTTPS_API_DISNEYAPI_DEV_CHARACTERS;
        if(!page.isEmpty()) {
            url += "?page=" + page.get();
        }
        DisneyCharacterResponse disneyResponse = restTemplate.getForObject(url, DisneyCharacterResponse.class);
        return disneyResponse;
    }


}

