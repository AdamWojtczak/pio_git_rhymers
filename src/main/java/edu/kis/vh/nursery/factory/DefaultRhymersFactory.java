package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefautCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefautCountingOutRhymer GetStandardRhymer() {
		return new DefautCountingOutRhymer();
	}

	@Override
	public DefautCountingOutRhymer GetFalseRhymer() {
		return new DefautCountingOutRhymer();
	}

	@Override
	public DefautCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefautCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
