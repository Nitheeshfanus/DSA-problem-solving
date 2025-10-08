class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashSet<String> wordset=new HashSet<>(wordList);
        if(!wordset.contains(endWord)) return 0;

        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int level=1;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String curr=q.poll();

                if(curr.equals(endWord)) return level;

                char[] chars=curr.toCharArray();
                for(int j=0; j<chars.length; j++){
                    char original=chars[j];
                    for(char c='a'; c<='z'; c++){
                        if (c == original) continue;

                        chars[j]=c;
                        String check=new String(chars);
                        if(wordset.contains(check)){
                            q.offer(check);
                            wordset.remove(check);
                        }
                    }
                    chars[j]=original;
                }
            }
            level++;
        }
        return 0;
    }
}