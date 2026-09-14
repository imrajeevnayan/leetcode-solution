class Solution {
    String reverses(String s) {
        char[] arr = s.toCharArray();

        int left = 0,right = arr.length - 1;

        while (left < right) {
            // Left pointer ko space ke aage le jao
            if (arr[left] == ' ') {
                left++;
            }
            // Right pointer ko space ke aage le jao
            else if (arr[right] == ' ') {
                right--;
            }
            // Dono non-space hain, swap karo
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
