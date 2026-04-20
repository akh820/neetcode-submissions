class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();;

        for(String e : strs){
            char[] charList = e.toCharArray();
            Arrays.sort(charList);
            String key = new String(charList);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(e);
        }

        return new ArrayList<>(map.values());
    }
}
