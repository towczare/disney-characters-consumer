package pl.kodujmy.disney;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DisneyCharacterService {

    private final DisneyCharacterConsumer disneyCharacterConsumer;

    public DisneyCharacterService(DisneyCharacterConsumer disneyCharacterConsumer) {
        this.disneyCharacterConsumer = disneyCharacterConsumer;
    }

    public DisneyCharactersPage getAllCharacters(Optional<Integer> page) {
        DisneyCharacterResponse res = disneyCharacterConsumer.consume(page);
        return new DisneyCharactersPage(res.getData().stream().map(ch -> new DisneyCharacter(ch.getName(), ch.getImageUrl())).collect(Collectors.toList()), res.getTotalPages(), res.getSize());
    }


}
