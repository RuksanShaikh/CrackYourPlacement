class WordDictionary {

    private static class TrieNode {
        TrieNode[] child;
        boolean isLeaf;

        TrieNode() {
            child = new TrieNode[26];
        }
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        int len = word.length();
        TrieNode temp = root;
        for (int i = 0; i < len; i++) {
            int c = word.charAt(i) - 'a';
            if (temp.child[c] == null)
                temp.child[c] = new TrieNode();
            temp = temp.child[c];
        }
        temp.isLeaf = true;
    }

    public boolean search(String word) {
        return search(word, -1, root);
    }

    private boolean search(String word, int i, TrieNode node) {
        if (node == null)
            return false;
        if (i == word.length() - 1)
            return node.isLeaf;
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

}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */