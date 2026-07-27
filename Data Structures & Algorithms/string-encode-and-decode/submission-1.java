class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(Integer.toString(str.length()) + "#" + str);
        }
        return sb.toString();
    }

    // 3#sdf
    public List<String> decode(String str) {
        ArrayList<String> res = new ArrayList<>();

        int index = 0;
        while (index < str.length()) {
            StringBuilder sb_len = new StringBuilder();
            StringBuilder sb_str = new StringBuilder();
            char c = str.charAt(index);
            while (c != '#') {
                sb_len.append(c);
                c = str.charAt(++index);
            }
            int len = Integer.parseInt(sb_len.toString());
            for (int i = index + 1; i < len + index + 1; i++) {
                sb_str.append(str.charAt(i));
            }
            res.add(sb_str.toString());
            index = index + len + 1;
        }

        return res;
    }
}
