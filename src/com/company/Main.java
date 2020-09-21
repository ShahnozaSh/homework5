package com.company;

public class Main {

    public static void main(String[] args) {
      Boss boss= new Boss();
      boss.setHealth(1000);
      boss.setDamage(70);
      boss.setTypeDefence("fly");
      boss.print();
        for (Hero hero : createHeroes()) {
            System.out.println(hero.getHealth() + " " + hero.getDamage()+" " + hero.getSuperpower());

        }
    }

    public static Hero[] createHeroes() {
        Hero archer = new Hero(150, 78,"fly");
        Hero thor =  new Hero(34,45);
        Hero magic = new Hero(100, 20);
        return new Hero[]{archer, thor, magic};

    }
}
