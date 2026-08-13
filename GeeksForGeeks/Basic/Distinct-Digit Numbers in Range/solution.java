class solution {
    ArrayList<Integer> uniqueNumbers(int l, int r) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int n = l; n <= r; n++) {
            String s = "" + n;
            HashSet<Character> set = new HashSet<>();

            for (char c : s.toCharArray())
                set.add(c);

            if (set.size() == s.length())
                ans.add(n);
        }

        return ans;
    }
}