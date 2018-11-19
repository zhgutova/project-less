package less10.Task5;

public class Mouse implements Movable, Eatable, Eat{
	private String cl = "Mouse";
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
	
	public Mouse() {
	}

	@Override
	public void eat(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Мышь никого не может съесть!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.setDist(1);
	}

	@Override
	public void eaten() {
		// TODO Auto-generated method stub
		if (this.isAlive()) {
			this.setAlive(false);
			System.out.println("Мышь съедена");
		}
		else System.out.println("Мышь уже съедена");
	}
}
