class Solution {
    public String frequencySort(String s) {
    Map<Character,Integer>map=new HashMap<>();
    for(char c:s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
   PriorityQueue<Character> pq =new PriorityQueue<>((a, b)->{
        int freq= map.get(b) - map.get(a);
        if (freq == 0) return a - b;
        return freq;
    });
     pq.addAll(map.keySet());
    StringBuilder sb=new StringBuilder();
    while(!pq.isEmpty()){
        char c=pq.poll();
        for(int i=0;i<map.get(c);i++) sb.append(c);    
     }
     return sb.toString();   
    }
}