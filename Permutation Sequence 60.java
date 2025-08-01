class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder permutation = new StringBuilder();
        boolean[] visited = new boolean[n + 1];
      
        for (int i = 0; i < n; ++i) {
            int factorial = 1;
            for (int j = 1; j < n - i; ++j) {
                factorial *= j;
            }
          
            for (int j = 1; j <= n; ++j) {
                if (!visited[j]) {
                    if (k > factorial) {
                        k -= factorial;
                    } else {
                        permutation.append(j);
                        visited[j] = true;
                        break;
                    }
                }
            }
        }
        return permutation.toString();
    }
}
