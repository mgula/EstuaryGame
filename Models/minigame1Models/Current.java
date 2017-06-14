package minigame1Models;

import enums.Direction;

/**
 * Currents move the player in a certain direction. Location changes from currents stack with location
 * changes from button presses. Crab's collision detection doesn't treat currents as surfaces - the player 
 * can move through (and cannot land on) a current.
 * 
 * @author marcusgula
 *
 */
public class Current implements Minigame1Model {
	private final int xloc; 
	private final int yloc;
	private int height;
	private int width;
	private Direction flowDir;
	private int incr;
	
	public Current(int x, int y, int h, int w, Direction d, int incr) {
		this.xloc = x;
		this.yloc = y;
		this.height = h;
		this.width = w;
		this.flowDir = d;
		this.incr = incr;
	}
	
	@Override
	public int getXloc() {
		return this.xloc;
	}

	@Override
	public int getYloc() {
		return this.yloc;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}
	
	public int getIncr() {
		return this.incr;
	}
	
	public Direction getFlowDirection() {
		return this.flowDir;
	}
	
	public void setIncr(int s) {
		this.incr = s;
	}
	public void setFlowDirection(Direction d) {
		this.flowDir = d;
	}
}
