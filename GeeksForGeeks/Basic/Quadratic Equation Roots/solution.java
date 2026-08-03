class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ans = new ArrayList<>();

        long d = 1L * b * b - 4L * a * c;

        if (d < 0) {
            ans.add(-1);
            return ans;
        }

        double sqrtD = Math.sqrt(d);

        int r1 = (int) Math.floor((-b + sqrtD) / (2.0 * a));
        int r2 = (int) Math.floor((-b - sqrtD) / (2.0 * a));

        if (r1 >= r2) {
            ans.add(r1);
            ans.add(r2);
        } else {
            ans.add(r2);
            ans.add(r1);
        }

        return ans;
    }
}