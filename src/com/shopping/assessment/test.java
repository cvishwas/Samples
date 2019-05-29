package com.shopping.assessment;

public class test {
	
	private static void testHollow(boolean expectation,int sampleArray[]) throws Exception{
		if(expectation != isHollow(sampleArray)) {
			throw new Exception("The code does not work");
		}
		
	}
	
	private static boolean isHollow(int[] sampleArray) {

		boolean result = false;
		StringBuffer sb = new StringBuffer();
		if((sampleArray.length) % 2 == 1) {
			int middleNum = ((sampleArray.length - 1)/2)+1;
			if(sampleArray[middleNum - 1] == 0) {
				int count0After = 0;
				int count0Before = 0;
				for(int i = middleNum; i < sampleArray.length; i++ ) {
					if(sampleArray[i] == 0) {
						count0After++;
					}else {
						break;
					}
//					sb.append(sampleArray[i]);
				}
				for(int i = (middleNum - 2); i >=0 ; i-- ) {
					if(sampleArray[i] == 0) {
						count0Before++;
					}else {
						break;
					}
//					sb.append(sampleArray[i]);
				}
				if((count0After == count0Before) && (count0Before+1+count0After)>=3)
					result = true;
			}
		}else {
			int middleNum = (sampleArray.length/2);
			int count0After = 0;
			int count0Before = 0;
			for(int i = middleNum; i < sampleArray.length; i++ ) {
				if(sampleArray[i] == 0) {
					count0After++;
				}else {
					break;
				}
//				sb.append(sampleArray[i]);
			}
			for(int i = (middleNum-1); i >=0 ; i-- ) {
				if(sampleArray[i] == 0) {
					count0Before++;
				}else {
					break;
				}
//				sb.append(sampleArray[i]);
			}
			if((count0After == count0Before) && (count0Before+count0After)>=3)
				result = true;			
			
		}
//		System.out.println(sb.toString());
		return result;
		
	}

	public static void main(String args[]) throws Exception{
		testHollow(true, new int[] {1,1,1,0,0,0,1,1,1});
		testHollow(true, new int[] {1,2,3,4,0,0,0,0,4,5,6,7});
		testHollow(false, new int[] {1,2,3,4,0,4,5,6,7});
		testHollow(false, new int[] {1,0,3,4,0,4,1,2,3});
		testHollow(false, new int[] {2,3,0,0,4,5});
		testHollow(false, new int[] {1,0,0,0,2,3,4,5,6});
		System.out.println("Your code works!!");
	}
}
