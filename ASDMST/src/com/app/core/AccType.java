package com.app.core;

public enum AccType {
	SAVING, CURRENT, FD, LOAN, DMAT;
	//overriding form of toString
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
