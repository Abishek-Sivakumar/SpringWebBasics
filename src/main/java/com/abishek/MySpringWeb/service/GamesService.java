package com.abishek.MySpringWeb.service;

import com.abishek.MySpringWeb.model.Games;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GamesService {
    List<Games> gamesList =new ArrayList<>(
            Arrays.asList(new Games(201,"Elden Ring","Souls Like"),
                    new Games(202,"Grand Theft Auto","Open World")
    ));

    public List<Games> getGamesList(){
        return gamesList;
    }

    public Games getGameById(int gameId){
        return gamesList.stream().filter(g -> g.getGameId()==gameId).findFirst().get();
    }

    public void addGametoList(Games game){
        gamesList.add(game);
    }

}
