package com.vlad;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoocerPlayer ronaldo = new SoocerPlayer("Ronaldo");

        Team<FootballPlayer> realTeam = new Team("Real Madrid");
        realTeam.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> barca = new Team<>("Barcelona");
        FootballPlayer marica = new FootballPlayer("Marica");
        barca.addPlayer(marica);
        Team<FootballPlayer> manch = new Team<>("Manchester");
        Team<FootballPlayer> liver = new Team<>("Liverpool");

        manch.matchResult(liver,2,1);
        manch.matchResult(realTeam,3,4);

        realTeam.matchResult(liver,2,1);
        realTeam.matchResult(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(realTeam.getName() + ": " + realTeam.ranking());
        System.out.println(barca.getName() +": " + barca.ranking());
        System.out.println(liver.getName() + ": " + liver.ranking());
        System.out.println(manch.getName() + ": " + manch.ranking());

        System.out.println(realTeam.compareTo(barca));
        System.out.println(barca.compareTo(liver));
    }
}
