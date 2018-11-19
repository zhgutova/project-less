package less10.Task5;

public class Cat implements Movable, Eatable, Eat {
	private String cl = "Cat";
	private int dist;
	private boolean isAlive = true;
	
	private int getDist() {
		return dist;
	}

	private void setDist(int dist) {
		this.dist = dist;
	}

	private boolean isAlive() {
		return isAlive;
	}

	private void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public Cat() {
	}

	@Override
	public void eat(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Mouse)
			((Mouse) obj).eaten();
		else System.out.println("Кот не может съесть это животное");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.setDist(2);
	} 
	
	@Override
	public void eaten() {
		// TODO Auto-generated method stub
		if (this.isAlive()) {
			this.setAlive(false);
			System.out.println("Кот съеден");
		}
		else System.out.println("Кот уже съеден");
	}
}
