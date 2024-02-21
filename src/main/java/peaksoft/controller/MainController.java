package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.service.UserService;


@Controller
@RequestMapping("/insta")
@RequiredArgsConstructor
public class MainController {
    private UserService userService;
    @GetMapping
    public String greetings(){
        return "/insta/insta";
    }

}
