class Solution {

    public String encode(List<String> strs) {
        StringBuilder s= new StringBuilder();
        for(String st:strs){
            s.append(st.length());
            s.append("#");
            s.append(st);
        }

        return s.toString();

    }

    public List<String> decode(String str) {
        List<String>li = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            j++;
            li.add(str.substring(j,j+len));
            i=j+len;
        }

        return li;

    }
}
