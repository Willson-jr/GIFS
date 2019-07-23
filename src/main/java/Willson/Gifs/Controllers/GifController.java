package Willson.Gifs.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GifController {

    @GetMapping("/")
    public String home() {
        return "home";
    }


}
