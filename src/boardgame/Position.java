package boardgame;

public class Position {
	
	private int run;
	private int column;
	public Position(int run, int column) {
		this.run = run;
		this.column = column;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public String toString()
	{
		return run + ", " + column;
	}
}
