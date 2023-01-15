package com.icm.IcmPortal.controllers;

import com.icm.IcmPortal.models.Comentario;
import com.icm.IcmPortal.models.Louvor;
import com.icm.IcmPortal.repositories.ComentariosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;
import java.util.List;

@Controller
public class ComentarioController {

    @Autowired
    ComentariosDAO comment;

    @GetMapping("/comentario")
    public String index(Model model){

        List<Comentario> lvl = (List<Comentario>) comment.findByUsuarioId(1);
        model.addAttribute("louvores", lvl);

        return "comentario";
    }

    @PostMapping("/comentario")
    public String sendComment(Comentario comentario){

        System.out.println(comentario);

        comment.save(comentario);

        return "comentario";
    }
}
