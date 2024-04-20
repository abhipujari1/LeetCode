class Solution {
    public List<List<Integer>> generate(int numRows) {
                List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                int coefficient = binomialCoefficient(i, j);
                row.add(coefficient);
            }

            triangle.add(row);
        }

        return triangle;

    }
        private int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        long result = 1;

       for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return (int) result;
    }

}