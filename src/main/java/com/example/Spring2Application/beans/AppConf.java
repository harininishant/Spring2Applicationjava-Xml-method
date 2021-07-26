package com.example.Spring2Application.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")// sourse from where to get the data
public class AppConf {
    @Value("${Game.home.team}") String homeName;
    @Value("${game.home.score}") int homeScore;
    @Value("${game.away.team}") String awayName;
    @Value("${game.away.score}") int awayScore;

    @Bean
    public ITeam redSox() {
        //@Value take from spring boot not lombok
        //return new RedSox("Boston Red Sox", 20); this waynit is hardcoding hence we do the other way
        return new RedSox(homeName, homeScore);
    }

    @Bean //Game.home.team and game.away.team are keys taken from resources/application properties
    public ITeam whiteSox(){
       // return new WhiteSox("Chicago White Sox", 30);
        return new WhiteSox(awayName, awayScore);
    }

    @Bean
    public Game game() {
        return new Game(redSox(), whiteSox());
    }
}
