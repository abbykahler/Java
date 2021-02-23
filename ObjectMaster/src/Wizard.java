public class Wizard extends Human{
    int health= 50;
    int intelligence= 8;

    public void heal(Human h){
        h.setHealth(h.getHealth() + intelligence);
    }
    public void fireball(Human h){
        h.setHealth(h.getHealth() - intelligence *3);
    }
    
}
