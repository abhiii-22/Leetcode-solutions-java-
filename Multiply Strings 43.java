class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2))
        return "0";

        int s1 = num1.length();
        int s2 = num2.length();
        int[] pa = new int[s1+s2];

        for(int i=s1-1;i>=0;i--){
            int d1= num1.charAt(i)-'0';
            for(int j=s2-1;j>=0;j--){
                int d2= num2.charAt(j)-'0';

                pa[i+j+1]+=d1*d2;
            }
        }
        for(int i=pa.length-1;i>0;--i){
        pa[i-1]+=pa[i]/10;
        pa[i]%=10;}

        int startindex = pa[0]==0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for(int i=startindex;i<pa.length;++i){
            sb.append(pa[i]);
        }
        return sb.toString();
        
    }
}
