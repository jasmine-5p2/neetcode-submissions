class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>mp = new HashMap<>();
        for(String s:strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String st = new String(str);

            if(!mp.containsKey(st)){
                mp.put(st,new ArrayList<>());
            }
            mp.get(st).add(s);
        }

        return new ArrayList<>(mp.values());

    }
}
