package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefautCountingOutRhymer;

	public interface Rhymersfactory {
	
		public DefautCountingOutRhymer GetStandardRhymer();
		
		public DefautCountingOutRhymer GetFalseRhymer();
		
		public DefautCountingOutRhymer GetFIFORhymer();
		
		public DefautCountingOutRhymer GetHanoiRhymer();
		
	}
