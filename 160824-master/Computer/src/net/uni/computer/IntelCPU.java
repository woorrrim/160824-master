package net.uni.computer;

import net.uni.CPU;

public class IntelCPU implements CPU {

	private String manufactor;
	private String coreType;

	public IntelCPU(String manufactor, String coreType) {
		this.manufactor = manufactor;
		this.coreType = coreType;
	}

	@Override
	public void printCPUInfo() {
		System.out.println("제조사 : " + manufactor);
		System.out.println("코어 타입 : " + coreType);
	}

}
