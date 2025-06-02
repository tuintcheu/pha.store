package PHA.STORE.STORE.Controller;



import PHA.STORE.STORE.model.Poste;
import PHA.STORE.STORE.Service.PosteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequiredArgsConstructor
@RequestMapping("/poste")
public class PosteController {
    private final PosteService posteService;

    public PosteController(PosteService posteService) {
        this.posteService = posteService;
    }

    @GetMapping
    public String listPostes(Model model) {
        model.addAttribute("postes", posteService.getAllPostes());
        return "poste/listposte";
    }

    @PostMapping("/save")
    public String savePoste(
            @Valid @ModelAttribute("poste") Poste poste,
            BindingResult bindingResult,
            RedirectAttributes ra
    ) {
        if (bindingResult.hasErrors()) return "poste/addposte";
        posteService.addPoste(poste);
        ra.addFlashAttribute("msg", "Poste créé avec succès !");
        return "redirect:/poste";
    }
}