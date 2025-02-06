package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("characterMapping")
public class CharacterMappingController {
    @GetMapping(path = "test1/I???")
    public String getCharacterMapping() {
        return "Character Mapping Controller";
    }
}
