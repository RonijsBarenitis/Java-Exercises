package com.develhope.Controller._con.GET.e.POST;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping(path = "/api")
    public String returnName(@RequestParam String nome){
        return "Your name is " + nome;
    }

    @PostMapping(path = "/api")
    public String returnNameInversed(@RequestParam String nome){
        StringBuilder nomeInverso = new StringBuilder();
        nomeInverso.append(nome);
        nomeInverso.reverse();
        return "Your name inverted is " +nomeInverso;
    }

}
