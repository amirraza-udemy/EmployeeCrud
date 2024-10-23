package com.iant.thymeleafIntro.controller;

import com.iant.thymeleafIntro.entity.Employee;
import com.iant.thymeleafIntro.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DemoController {
    private EmpService empService;

    public DemoController(EmpService empService) {
        this.empService = empService;
    }


    @GetMapping("/")
    public String showAllEmp(Model model)
    {
      List<Employee> emplist=  empService.getAllEmp();

      model.addAttribute("emplist",emplist);
      if(emplist.size()==0)
          return "No Record";
      else
      return "welcome";
    }
    @GetMapping("/showaddform")
    public String showForm(Model M)
    {
        Employee E = new Employee();
        M.addAttribute("employee",E);
        return "insertform";
    }
    @PostMapping("/save")
    public String insertRecord(@ModelAttribute Employee E)
    {
        empService.saveEmp(E);
        return "redirect:/";
    }
    @GetMapping("/search/{id}")
    public String showEMpById(@PathVariable int id,Model m)
    {
        Employee E= empService.getEmpById(id);
        m.addAttribute("EMP",E);
        return "search";
    }
}
