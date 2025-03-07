// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int maxRow = Integer.MIN_VALUE;
		int minRow = Integer.MAX_VALUE;
		int maxCol = Integer.MIN_VALUE;
		int minCol = Integer.MIN_VALUE;
		int count = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == ch) {
					maxRow = Math.max(maxRow, row);
					minRow = Math.min(minRow, row);
					maxCol = Math.max(maxCol, col);
					minCol = Math.min(minCol, col);
					count++;
				}
			}
			if (count == 0) {
				return 0;
			}
			if (count == 1) {
				return 1;
			} else {
				int chieuRong = maxCol - minCol + 1;
				int chieuDai = maxRow - minRow + 1;
				return chieuDai * chieuRong;
			}
		}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int row=grid.length;
		int col=grid[0].length;
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int nh = 0;
				char temp = grid[i][j];
				Boolean isPlus = true;
				while (isPlus) {
					nh++;

					boolean up = (i - nh >= 0) && (grid[i - nh][j] == temp);
					boolean right = (j + nh < col) && (grid[i][j + nh] == temp);
					boolean left = (j - nh >= 0) && (grid[i][j - nh] == temp);
					boolean down = (i + nh < row) && (grid[i + nh][j] == temp);


					if (!(up && down && right && left)) {
						isPlus = false;
					}
					count++;

				}
				return count;
			}
		}
		return 0; // YOUR CODE HERE
	}
	
}
