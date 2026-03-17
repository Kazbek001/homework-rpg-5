package com.narxoz.rpg.hero;

public class HeroProfile {
    private final String name;
    private int health;

    public HeroProfile(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int amount) {
        // Уронды азайтамыз және HP 0-ден төмен түсіп кетпеуін қадағалаймыз.
        // Бұл "зомби-батыр" (теріс денсаулықпен жүру) қателігінен сақтайды.
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        // Батырдың денсаулығы 0-ден көп болса, ол әлі шайқаса алады.
        return health > 0;
    }
}