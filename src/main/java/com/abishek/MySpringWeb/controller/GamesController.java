package com.abishek.MySpringWeb.controller;

import com.abishek.MySpringWeb.model.Games;
import com.abishek.MySpringWeb.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GamesController {

    @Autowired
    private GamesService gservice;

    @GetMapping("/games")
    public List<Games> getGames(){
        return gservice.getGamesList();
    }

    @GetMapping("/games/{gameId}")
    public Games findGameById(@PathVariable int gameId){
        return gservice.getGameById(gameId);
    }

    @PostMapping("/games")
    public void addGametoList(@RequestBody Games game){
        gservice.addGametoList(game);
    }
}
