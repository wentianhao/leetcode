package leetcode.tree;
//前缀树 or 字典树
public class Trie_208 {
    static class Trie {
        private Trie[] children;
        private boolean isEnd;
        /** Initialize your data structure here. */
        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie node = this;
            for(char ch : word.toCharArray()){
                int index = ch - 'a';
                if(node.children[index] == null){
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie node = searchPrefix(word);
            return node !=null && node.isEnd;
        }

        public Trie searchPrefix(String prefix){
            Trie node = this;
            for (char ch:prefix.toCharArray()){
                int index = ch - 'a';
                if (node.children[index] == null)
                    return null;
                node = node.children[index];
            }
            return node;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie node = searchPrefix(prefix);
            return node!=null;
        }

    }

    public static void main(String[]args){
        Trie obj = new Trie();
        String word = "apple";
        obj.insert(word);
    }
}
