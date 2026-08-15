import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();

        for (String e : emails) {
            String[] p = e.split("@");
            String l = p[0];

            int i = l.indexOf('+');
            if (i != -1) {
                l = l.substring(0, i);
            }

            l = l.replace(".", "");
            s.add(l + "@" + p[1]);
        }

        return s.size();
    }
}