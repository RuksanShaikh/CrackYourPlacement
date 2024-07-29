class Trie {


private static class Node{
    Node[] child;
    boolean isleaf;

    Node(){
        child=new Node[26];
    }
}

Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
    Node curr=root;
    for(int i=0;i<word.length();i++){
        int idx=word.charAt(i)-'a';
        if(curr.child[idx]==null)
            curr.child[idx]=new Node();

         curr=curr.child[idx];
    }

    curr.isleaf=true;
    }
    
    public boolean search(String word) {
        return search(word,-1,root);
    }

    private boolean search(String word, int i, Node node) {
        if (node == null)
            return false;
        if (i == word.length() - 1)
            return node.isleaf;
        if (word.charAt(++i) != '.') {
            return search(word, i, node.child[word.charAt(i) - 'a']);
        } else {
            for (int p = 0; p < 26; p++) {
                if (search(word, i, node.child[p])) {
                    if (node.child[p] == null)
                        continue;
                    return true;
                }
            }
            return false;
        }
    }

    
    public boolean startsWith(String prefix) {
        Node curr=root;

        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.child[idx]==null){
                return false;
            }

            curr=curr.child[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */