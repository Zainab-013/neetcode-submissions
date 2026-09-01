
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> ls = new ArrayList<>();
      HashMap<String, List<String>> map = new HashMap<>();

      for(String str:strs){
       char[] s = str.toCharArray();
       Arrays.sort(s);
       String key = new String(s);

       if(map.containsKey(key)){
        map.get(key).add(str);
       }
       else{
        map.put(key,new ArrayList<String>());
        map.get(key).add(str);
       }
      }
      for (Map.Entry<String, List<String>> e : map.entrySet()){
        ls.add(e.getValue());
      }
      return ls;
    }
}