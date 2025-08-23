package com.cursojava.dslist.services;

import com.cursojava.dslist.DTO.GameDTO;
import com.cursojava.dslist.DTO.GameMinDTO;
import com.cursojava.dslist.entities.Game;
import com.cursojava.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    //INJECAO DE DEPENDENCIA
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById (Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }


}
