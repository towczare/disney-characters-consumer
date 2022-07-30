package pl.sda.disney.Disney.Characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class DisneyCharacterResponse {
    private List<DisneyCharacterJson> data;
    private Integer totalPages;
    private Integer size;
}





//{"data":[{"films":[],"shortFilms":[],"tvShows":[],"videoGames":[],"parkAttractions":[],"allies":[],"enemies":[],"_id":6,"name":"'Olu Mel","imageUrl":"https://static.wikia.nocookie.net/disney/images/6/61/Olu_main.png","url":"https://api.disneyapi.dev/characters/6"},{"films":[],"shortFilms":[],"tvShows":["Gravity Falls"],"videoGames":[],"parkAttractions":[],"allies":[],"enemies":[],"_id":7,"name":".GIFfany","imageUrl":"https://static.wikia.nocookie.net/disney/images/5/51/Giffany.png","url":"https://api.disneyapi.dev/characters/7"},{"films":[],"shortFilms":[],"tvShows":["Lilo & Stitch: The Series","Stitch!"],"videoGames":["Disney Tsum Tsum (game)"],"parkAttractions":[],"allies":[],"enemies":[],"_id":10,"name":"627","imageUrl":"https://static.wikia.nocookie.net/disney/images/8/80/Profile_-_627.png","url":"https://api.disneyapi.dev/characters/10"},{"films":[],"shortFilms":[],"tvShows":[],"videoGames":[],"parkAttractions":["The Timekeeper"],"allies":[],"enemies":[],"_id":11,"name":"9-Eye","imageUrl":"https://static.wikia.nocookie.net/disney/images/7/77/9-eye.jpg","url":"https://api.disneyapi.dev/characters/11"},{"films":[],"shortFilms":[],"tvShows":["Pickle and Peanut"],"videoGames":[],"parkAttractions":[],"allies":[],"enemies":[],"_id":12,"name":"90's Adventure Bear","imageUrl":"https://static.wikia.nocookie.net/disney/images/3/3f/90%27s_Adventure_Bear_profile.png","url":"https://api.disneyapi.dev/characters/12"},{"films":[],"shortFilms":[],"tvShows":[],"videoGames":["Epic Mickey 2: The Power of Two"],"parkAttractions":[],"allies":[],"en