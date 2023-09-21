package it.controller;

import it.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user/controller")
public class UserController {
    private static List<Student> list = new ArrayList<>();

    @GetMapping("/find/all")
    public String find(Model model) {
        model.addAttribute("st", list);
        return "find";
    }

    @GetMapping("/find/by/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("student", list.get(id - 1));
        return "findbyid";
    }

    @GetMapping("/save")
    public String save() {
        return "save-form";
    }

    @PostMapping("/save/student")
    public String save(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        Student student = new Student();
        student.setId(list.size() + 1);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        list.add(student);
        return "redirect:/user/controller/find/all";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("student", list.get(id - 1));
        return "update-form";
    }

    @PostMapping("/update/student/{id}")
    public String update(
            @PathVariable int id,
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        Student student = list.get(id - 1);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        list.get(id - 1).setName(name);
        list.get(id - 1).setEmail(email);
        list.get(id - 1).setPassword(password);
        return "redirect:/user/controller/find/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        list.remove(id - 1);
        return "redirect:/user/controller/find/all";
    }
}