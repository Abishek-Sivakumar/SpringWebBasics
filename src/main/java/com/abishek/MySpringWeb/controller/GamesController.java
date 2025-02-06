package com.abishek.MySpringWeb.controller;

import com.abishek.MySpringWeb.model.Games;
import com.abishek.MySpringWeb.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GamesController {

    @Autowired
    private GamesService gservice;

    @RequestMapping("/games")
    public List<Games> getGames(){
        return gservice.getGamesList();
    }

}
