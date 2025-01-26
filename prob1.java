import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= rowNum; i++) {
                row.add(1); // Initialize with 1
            }

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, triangle.get(rowNum - 1).get(j - 1) + triangle.get(rowNum - 1).get(j));
            }

            triangle.add(row);
        }

        return triangle;
    }
}
