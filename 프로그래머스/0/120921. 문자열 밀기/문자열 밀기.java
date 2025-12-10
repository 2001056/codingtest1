class Solution {
    public int solution(String A, String B) {

        if (A.equals(B)) return 0;

        StringBuilder sb = new StringBuilder(A);

  
        for (int i = 1; i < A.length(); i++) {  
        
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.deleteCharAt(sb.length() - 1);

            if (sb.toString().equals(B)) {
                return i;
            }
        }
        return -1;
    }
}