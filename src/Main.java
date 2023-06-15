public class Main {
    public static void main(String[] args) {
        Boss Pain = new Boss();
        Pain.setDamage(100);
        System.out.println(Pain.getDamage());
        Pain.setHealth(1500);
        System.out.println(Pain.getHealth());
        Pain.setBossDefencetype("Physical");
        System.out.println(Pain.getBossDefencetype());
        Hero Naruto = new Hero(350, 80, 150);
        Hero Sakura = new Hero(250, 50, 0);
        Hero Saske = new Hero(270, 70, 120);
    }
}