package edu.kis.vh.nursery;

public class FIFORhymer extends DefautCountingOutRhymer {

	public DefautCountingOutRhymer temp = new DefautCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
