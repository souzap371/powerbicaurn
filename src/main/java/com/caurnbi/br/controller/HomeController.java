package com.caurnbi.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/powerbi/painel1")
    public String abrirPainel1() {
        
        return "redirect:https://app.powerbi.com/groups/{sua_id_do_grupo}/dashboard/{seu_id_do_painel1";
    }

    @GetMapping("/powerbi/painel2")
    public String abrirPainel2() {
        
        return "redirect:https://app.powerbi.com/groups/{sua_id_do_grupo}/dashboard/{seu_id_do_painel2";
    }

    @GetMapping("/powerbi/painel3")
    public String abrirPainel3() {
        return "redirect:https://app.powerbi.com/groups/{sua_id_do_grupo}/dashboard/{seu_id_do_painel3";
    }

    @GetMapping("/powerbi/painel4")
    public String abrirPainel4() {
        return "redirect:https://app.powerbi.com/groups/{sua_id_do_grupo}/dashboard/{seu_id_do_painel4";
    }

    //Adicionar mais paineis se necessário
}
