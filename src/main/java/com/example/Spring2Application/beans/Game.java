package com.example.Spring2Application.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@AllArgsConstructor
//@Component
public class Game {
    private ITeam homeTeam;
    private ITeam awayTeam;



    @PostConstruct
    public void initGame(){
        System.out.println("@@@@@@@@@@ GAME IS ON @@@@@@@@@@@@@@");
    }
   @PreDestroy
    public void destroy(){
        System.out.println("@@@@@@@@@@ GAME ENDED @@@@@@@@@@@@");
    }

    public ITeam playGame(){
       return Math.random()*10>1 ? homeTeam : awayTeam;
    }



}
