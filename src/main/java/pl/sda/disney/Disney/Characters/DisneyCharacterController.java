package pl.sda.disney.Disney.Characters;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class DisneyCharacterController {

    private final DisneyCharacterService disneyCharacterService;

    public DisneyCharacterController(DisneyCharacterService disneyCharacterService) {
        this.disneyCharacterService = disneyCharacterService;
    }

    @RequestMapping("/")
    public String index(@RequestParam("page") Optional<Integer> page, Model model) {
        DisneyCharactersPage allCharacters = disneyCharacterService.getAllCharacters(page);
        model.addAttribute("page", allCharacters);
        model.addAttribute("pages", IntStream.range(1,allCharacters.getTotalPages()).boxed().collect(Collectors.toList()));
        pageInfo(page, model);

        return "index";
    }

    private void pageInfo(Optional<Integer> page, Model model) {
        if(page.isEmpty()) {
            model.addAttribute("currentPage", 1);
        }else {
            model.addAttribute("currentPage", page.get());
        }
    }


}
