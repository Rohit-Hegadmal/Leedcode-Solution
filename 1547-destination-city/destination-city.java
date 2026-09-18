class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set  = new HashSet<>();
        for( List<String> pa: paths)
        {
            set.add(pa.get(0));
        }
        for(List<String> pa : paths)
        {
            if(!set.contains(pa.get(1)))
            {
                return pa.get(1);
            }
        }
        return null;
    }
}