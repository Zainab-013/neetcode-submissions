class Solution {

    public String encode(List<String> strs) {
        String ans = "";

        for (String s : strs) {
            ans += s.length() + "#" + s;
        }

        return ans;
    }

    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));
            list.add(s.substring(j + 1, j + 1 + len));

            i = j + 1 + len;
        }

        return list;
    }
}