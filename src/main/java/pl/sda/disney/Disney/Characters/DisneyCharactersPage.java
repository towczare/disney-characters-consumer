package pl.sda.disney.Disney.Characters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisneyCharactersPage {
    private List<DisneyCharacter> characters;
    private Integer totalPages;
    private Integer size;
}
