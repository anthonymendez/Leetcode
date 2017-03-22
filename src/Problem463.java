
public class Problem463 {
	public int islandPerimeter(int[][] grid) {
		int per = 0;
		for(int r = 0; r < grid.length; r++){
			for(int c = 0; c < grid[0].length; c++){
				if(grid[r][c] == 1){
					if(r-1 < 0 || grid[r-1][c] == 0)
						per++;
					if(c-1 < 0 || grid[r][c-1] == 0)
						per++;
					if(r+1 >= grid.length || grid[r+1][c] == 0)
						per++;
					if(c+1 >= grid[0].length || grid[r][c+1] == 0)
						per++;
				}
			}
		}
		return per;
	}
}
