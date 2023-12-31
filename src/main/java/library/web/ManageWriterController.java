package library.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("manageWriter")
public class ManageWriterController {
    @GetMapping(value = "/main")
    public String goToManePage() {
        return "/";
    }

    @GetMapping
    public String home() {
        return "html/manageWriter";
    }
}
