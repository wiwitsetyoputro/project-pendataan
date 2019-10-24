package com.pendataan.commonServices;

public class CommonStatus {

	public static String getStatusEkonomi(Integer penghasilan) {
		
		String status = null;
		if (penghasilan < 1000000) {
			status = "KURANG MAMPU";
		} else if (penghasilan > 1000000 && penghasilan < 3500000) {
			status = "SEDERHANA";
		} else if (penghasilan > 3600000 && penghasilan <= 7000000 || penghasilan > 7000000) {
			status = "BERKECUKUPAN";
		}
		return status;
	}

}
