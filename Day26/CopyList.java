// Definition for a Node.
/*class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/

class CopyList {
    private Map<Node, Node> map;

    public Node copyRandomList(Node head) {
        map = new HashMap<>();
        return dfs(head);
    }

    private Node dfs(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node cur = new Node(node.val, null, null);
        map.put(node, cur);

        cur.next = dfs(node.next);
        cur.random = dfs(node.random);

        return cur;
    }
}
