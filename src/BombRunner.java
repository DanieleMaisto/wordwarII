package turingbombsimulator;
public class BombRunner implements Runnable{
	private Bomb myBomb;
	public BombRunner(Bomb b){
		this.myBomb = b;
	}
	public void run(){
		this.myBomb.find();
	}

	public String[] getRes(){
		return this.myBomb.getResults();
	}

	public int[] getScamb(){
		return this.myBomb.getArray();
	}

	public String getSequence(){
		return this.myBomb.printSequence();
	}
}
