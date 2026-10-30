class Solution {
    public int partitionString(String s) {

        // Pehli substring count kar rahe hain
        int partitions = 1;

        // Current substring ke unique characters store karenge
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {

            // Agar character already present hai,
            // to current substring me duplicate aa gaya
            if (set.contains(ch)) {

                // Naya partition start karo
                partitions++;

                // Purane substring ke characters hata do
                set.clear();
            }

            // Current character ko add karo
            set.add(ch);
        }

        return partitions;
    }
}