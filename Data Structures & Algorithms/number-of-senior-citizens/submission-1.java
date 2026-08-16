class Solution {
    public int countSeniors(String[] details) {
        int count=0;
       /* StringBuilder sb=new StringBuilder();
          for(int i=0;i<details.length;i++){
            sb.setLength(0);
            sb.append(details[i].charAt(11));
            sb.append(details[i].charAt(12));

            int age=Integer.parseInt(sb.toString());
            if(age>60){
                count++;
            }   
          }
          return count;
        */
        for(int i=0;i<details.length;i++){

       String strage=""+details[i].charAt(11)+details[i].charAt(12)+"";
       int age=Integer.parseInt(strage);
       if(age>60){
        count++;
       }
        }


return count;

    }
}