class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> ans = solve(expression);

        List<String> res = new ArrayList<>(ans);
        Collections.sort(res);

        return res;
    }
    Set<String> solve(String s) {

        Set<String> result = new HashSet<>();

        // 1. Find top-level comma
        int level = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '{') level++;
            else if (s.charAt(i) == '}') level--;

            else if (s.charAt(i) == ',' && level == 0) {

                Set<String> left = solve(s.substring(0, i));
                Set<String> right = solve(s.substring(i + 1));

                result.addAll(left);
                result.addAll(right);

                return result;
            }
        }

        // 2. No top-level comma
        //    Now we need concatenation

        result.add("");

        for (int i = 0; i < s.length();) {

            Set<String> part;

            // Bracket expression
            if (s.charAt(i) == '{') {

                int level2 = 1;
                int j = i + 1;

                while (level2 > 0) {

                    if (s.charAt(j) == '{') level2++;
                    else if (s.charAt(j) == '}') level2--;

                    j++;
                }

                // Remove { }
                part = solve(s.substring(i + 1, j - 1));

                i = j;
            }

            // Normal character
            else {

                part = new HashSet<>();
                part.add(String.valueOf(s.charAt(i)));

                i++;
            }

            // Concatenate
            Set<String> next = new HashSet<>();

            for (String a : result) {
                for (String b : part) {
                    next.add(a + b);
                }
            }

            result = next;
        }

        return result;
    }
}
