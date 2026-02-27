class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res=new ArrayList<>();
    for(int i=0;i<bulbs.size();i++)
            {
                int bulb = bulbs.get(i);
                if(!(res.contains(bulb)))
                {
                    res.add(bulb);
                }
                else
                {
                    res.remove(Integer.valueOf(bulb));
                }
            }
        Collections.sort(res);
        return res;
    }
}