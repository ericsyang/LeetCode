
public class Solution {
	public int reverse(int x) {
        
		int reversedInt = 0;
		String result = "";
		String symbol = "";
		String intToString = Integer.toString(x);
		
		for(int i=intToString.length(); i>=1; i--){
			
			String target = intToString.substring(i-1, i);
			
			if(i==1 && target.equals("-")){
				
				symbol = target;
				
				
			}else{
				
				result = result + target;
			}
		}
	
		int reResult = Integer.parseInt(result);
		
		if(symbol.equals("-")){
			reversedInt = (-1) * reResult;
		}else{
			reversedInt = reResult;
		}
		
		

		return reversedInt;
		
    }
	


	public static void main(String[] args){
		int i = 234;
		
		int result = new Solution().reverse(i);
		System.out.println(result);
		
	}
}
