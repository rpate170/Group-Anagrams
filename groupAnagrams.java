class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        if (strs == null){
            return result;
        }
        
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        result.addAll(map.values());
        return result;
    }
}