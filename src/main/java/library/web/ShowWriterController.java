package library.web;

import library.data.WriterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("showWriter")
public class ShowWriterController {
    @Autowired
    private WriterRepository writerRepository;

    @GetMapping(value = "/main")
    public String goToManePage() {
        return "/";
    }

    @GetMapping
    public String getAllWriters(Model model) {
        model.addAttribute("writers", writerRepository.findAll());
        return "html/showWriter";
    }
}