package com.cursojava.dslist.controllers;

import com.cursojava.dslist.DTO.GameMinDTO;
import com.cursojava.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    //INJECAO DE DEPENDENCIA
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }

}
