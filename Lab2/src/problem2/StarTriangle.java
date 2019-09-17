package problem2;

public class StarTriangle {
	public String[][] triangle;

	public StarTriangle(int width) {
		triangle = new String[width][width];
		for (int row = 0; row < width; row++) {
			for (int coulumn = 0; coulumn < width; coulumn++) {
				if (coulumn <= row)
					triangle[row][coulumn] = "[*]";
				else
					triangle[row][coulumn] = " ";
			}
		}
	}

	public String toString() {
		String s = "";
		for (int row = 0; row < triangle.length; row++) {
			for (int coulumn = 0; coulumn < triangle[row].length; coulumn++) {
				s += triangle[row][coulumn];
			}
			s += '\n';
		}
		return s;
	}
}
