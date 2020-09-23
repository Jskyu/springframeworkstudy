package com.example.springframeworkstudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonService personService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }

    @GetMapping("/peoples")
    public String showPeoples(Model model){
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);

        return "showList";
    }

    @GetMapping("/createPeople")
    public String createForm(Model model){
        model.addAttribute("form", new Person());
        return "peopleForm";
    }

    @PostMapping("/createPeople")
    public String createPerson(Person person){
        personService.save(person);
        return "redirect:/peoples";
    }
}