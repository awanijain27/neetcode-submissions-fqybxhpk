class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            if(strs[i]=="removed") continue;
            ArrayList<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            for(int j=i+1; j<strs.length; j++){
                if(strs[j]!="removed" && isAnagram(strs[i], strs[j])){
                    curr.add(strs[j]);
                    strs[j]="removed";
                }
            }
            res.add(curr);
            strs[i]="removed";
        }
        
        return res;
    }
}
