class TimeMap {
    class Node {
        String val;
        int time;
    }

    HashMap<String, List<Node>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Node newNode = new Node();
        newNode.val = value;
        newNode.time = timestamp;

        if (map.containsKey(key)) {
            map.get(key).add(newNode);
        } else {
            List<Node> list = new ArrayList<>();
            map.put(key, list);
            map.get(key).add(newNode);
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Node> list = map.get(key);

        int l = 0;
        int r = list.size() - 1;
        Node res = new Node();

        while (l <= r) {
            int mid = (r+l) / 2;

            if (list.get(mid).time <= timestamp) {
                res = list.get(mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return res.val;
    }
}
