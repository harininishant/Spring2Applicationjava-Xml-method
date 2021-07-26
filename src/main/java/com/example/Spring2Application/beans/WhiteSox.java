package com.example.Spring2Application.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
//@Component // this passes the value on its own
public class WhiteSox implements ITeam{

    private String name;
    private int score;

    @Override
    public String getTeamName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }
}
