class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            int length=strs.get(i).length();
            sb.append(length);
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String>result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
        int j=i;
        while(str.charAt(j)!='#'){
            j++;
        }
        int length=Integer.parseInt(str.substring(i,j));
         i=j+1;
        String word=str.substring(i,i+length);
        result.add(word);
        i=i+length;

    }
    return result;
    }
}
