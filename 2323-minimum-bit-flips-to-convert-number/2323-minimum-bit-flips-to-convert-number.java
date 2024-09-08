class Solution {
    public int minBitFlips(int start, int goal) {
        int result=start^goal;
        int bitcount=Integer.bitCount(result);
        return bitcount;
    }
}