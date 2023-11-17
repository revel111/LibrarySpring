package library.web;

import library.custom.Writer;
import library.data.WriterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("showWriters")
public class ShowWritersController {
    @Autowired
    WriterRepository writerRepository;

    @GetMapping(value = "/static")
    public String goToManePage() {
        return "redirect:/";
    }

    @GetMapping
    public String getAllWriters(Model model) {
        model.addAttribute("writers", writerRepository.findAll());
        return "html/showWriters";
    }
}