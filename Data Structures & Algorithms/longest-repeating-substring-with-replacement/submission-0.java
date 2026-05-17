class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0, i=0, j=0, ml=0;
        Map<Character, Integer> map=new HashMap<>();

        while(j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);

            maxf=Math.max(maxf, map.get(c));

            if(j-i-maxf+1<=k){
                ml=Math.max(ml, j-i+1);
            } 
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                i++;
            } 
            j++;
        }

        return ml;
    }
}
