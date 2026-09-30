class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String st[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> ans = new HashSet<>();
        for(String ch  : words)
        {
            StringBuilder sb = new StringBuilder();
            for(char s : ch.toCharArray())
            {
                sb.append(st[s - 'a']);
            }
            ans.add(sb.toString());
        }
        return ans.size();
    }
}