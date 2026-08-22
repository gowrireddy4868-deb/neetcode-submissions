class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxodd=0;
        int mineven=Integer.MAX_VALUE;


        for(int freq :map.values()){
            
            if(freq%2==1){
                maxodd=Math.max(maxodd,freq);
            }
            else{
                mineven=Math.min(mineven,freq);
            }
        }
        return maxodd-mineven;
    }
}