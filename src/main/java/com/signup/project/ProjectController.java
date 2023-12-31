package com.signup.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ProjectController {

    @Autowired
    public ProjectService projectService;
    
    @GetMapping("test")
    public String user()
    {
        return projectService.addService();
    }

    @GetMapping("ram")
    public String ram()
    {
        return "Jai Shree Ram! Yeah!";
    }
}   
