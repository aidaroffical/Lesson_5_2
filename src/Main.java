public class Main {
    public static void main(String[] args) {
        Boss Pain = new Boss();
        Pain.setDamage(100);
        System.out.println(Pain.getDamage());
        Pain.setHealth(1500);
        System.out.println(Pain.getHealth());
        Pain.setBossDefencetype("Physical");
        System.out.println(Pain.getBossDefencetype());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println( "Суперспособность: " + heroes[i].getSuperFly());
            System.out.println( "Урон: " + heroes[i].getDamage());
            System.out.println( "Здоровье: " + heroes[i].getHealth());
        }
    }

    public static Hero[] createHeroes(){
        Hero[] allHeroes = new Hero[3]; //
        allHeroes[0] = new Hero("Naruto", 350, 80, 150);
        allHeroes[1] = new Hero("Sakura", 250, 50, 0);
        allHeroes[2] = new Hero("Saske", 270, 70, 120);
        return allHeroes;
    }
}
