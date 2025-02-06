package com.abishek.MySpringWeb.service;

import com.abishek.MySpringWeb.model.Games;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GamesService {
    List<Games> gamesList =
            Arrays.asList(new Games(201,"Elden Ring","Souls Like"),
                    new Games(202,"Grand Theft Auto","Open World")
    );

    public List<Games> getGamesList(){
        return gamesList;
    }

}
