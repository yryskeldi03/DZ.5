package com.company;

public class Hero {

    private int heroHealth;
    private int heroDamage;
    private String heroAbility;


    public Hero(){}


    public Hero(int heroHealth, int heroDamage, String heroAbility){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAbility = heroAbility;
    }

    public Hero(int heroHealth, int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroAbility() {
        return heroAbility;
    }

    @Override
    public String toString() {
        return "Hero["
                + "Hero health:" + heroHealth
                + "  Hero damage:" + heroDamage
                + "  Hero ability:'" + heroAbility + '\''
                + ']';
    }
}
