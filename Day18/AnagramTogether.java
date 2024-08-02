class AnagramTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        
        
        // Code here
        
        Map<String,List> ans=new HashMap<>();
        
        for(String s:string_list){
            char[]  ch=s.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList());
            }
            
            ans.get(key).add(s);
        }
        
        return new ArrayList(ans.values());
    }
}
