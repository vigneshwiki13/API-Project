package com.omrbranch.globaldata;

import lombok.Data;

@Data
public class GlobalData {

	private int statusCode;
	private String logtoken;

	private static GlobalData globalData;

	private GlobalData() {
	}

	public static GlobalData getGlobalDataInstance() {
		if (globalData == null) {
			globalData = new GlobalData();
		}
		return globalData;

	}


}
