public class Ninja extends Human{
    int stealth = 10;
	private Human j;

    public void steal(Human h){
      h.setHealth(j.getHealth() - stealth);
      setHealth(j.getHealth() + stealth);
    }

    public void runAway() {
		setHealth(getHealth() - 10);
	}

}