package library.web;

import library.custom.Writer;
import library.data.WriterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/addWriter")
@SessionAttributes("Writer")
public class AddWriterController {
    @ModelAttribute(name = "Writer")
    public Writer writer() {
        return new Writer();
    }

    @GetMapping
    public String showAddWriter() {
        return "html/addWriter";
    }

    @PostMapping
    public String processWriter(@Valid Writer writer, Errors errors, SessionStatus sessionStatus) {
        if (errors.hasErrors())
            return "html/addWriter";

        log.info("Writer added: {}", writer);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}