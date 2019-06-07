package com.gymfox;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        System.out.println(soldier);
        System.out.println(soldier.roarFace());
        System.out.println(soldier.soldierVoice());
    }
}

class Unit {
    String name;
    int hp;
    int dmg;

    public Unit(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public Unit() {
        this("Unit", 100,10);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void attack(Unit enemy) {
        enemy.takeDamage(dmg);
    }

    public void takeDamage(int dmg) {
        setHp(getHp() - dmg);
    }

    public String roarFace() {
        return "ARRGGH!!!!";
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nHP: %d\nDMG: %d\n", getName(), getHp(), getDmg());
    }
}

class Soldier extends Unit {
    public Soldier(String name, int hp, int dmg) {
        super(name, hp, dmg);
    }

    public Soldier() {
        this("Soldier", 100, 15);
    }

    @Override
    public String roarFace() {
        return "мамку твою по театрам водил";
    }

    public String soldierVoice() {
        return "IN BATTLE!";
    }
}