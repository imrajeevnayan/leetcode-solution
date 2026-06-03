class Solution {
      boolean isValid(int num) {
        String s = String.valueOf(num);
        for (char ch : s.toCharArray()) {
            if (ch != '1' && ch != '2' && ch != '3') {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> filterByDigits(int[] arr) {
     ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (isValid(num)) {
                result.add(num);
            }
        }
        if (result.size() == 0) {
            result.add(-1);
        }
        return result;
    
        
    }
}
