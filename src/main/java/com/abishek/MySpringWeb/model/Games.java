package com.abishek.MySpringWeb.model;

import org.springframework.stereotype.Component;

@Component
public class Games {
    private int gameId;
    private String gameName;
    private String gameGenre;

    public Games(){
    }

    public Games(int gameId, String gameName, String gameGenre) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameGenre = gameGenre;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    @Override
    public String toString() {
        return "Games{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameGenre='" + gameGenre + '\'' +
                '}';
    }
}
