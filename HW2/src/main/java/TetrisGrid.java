//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int rows= grid.length;
		int cols=grid[0].length;
		int count=0;
		Boolean newgrid[][]=new Boolean[rows][cols]
		for(int j=0;j<cols;j++)
		{
			Boolean ba =true;
			for(int i=0;i<rows;i++)
			{
				if(grid[i][j]==false)
				{
					ba=false;
					break;
				}

			}
			if(ba=false)
			{
				for(int i=0;i<rows;i++)
				{
					newgrid[i][count]=newgrid[i][j];


				}
				count++;
			}

		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return null; // YOUR CODE HERE
	}
}
