package com.supermap.android.monitors;

import android.graphics.Color;

import com.supermap.android.communication.CarData;

/**
 * ×´Ì¬¼à¿Ø£¬¸ºÔðÅÐ¶Ï×´Ì¬
 * @author Congle
 *
 */
public class StatusMonitor {
	private DisplayManager mDisplayManager = null;
	
	/**
	 * ¹¹Ôìº¯Êý
	 * @param mgr
	 */
	public StatusMonitor(DisplayManager mgr){
		mDisplayManager = mgr;
	}
	
	/**
	 * ¼à¿Ø³µÁ¾×´Ì¬
	 * @param cardata
	 */
	public void monitor(CarData cardata){
		int status = cardata.getState();
		switch (status) {
		case 1:
			mDisplayManager.updateElementStyle(cardata, Color.GREEN);
			break;
		case 2:
			mDisplayManager.updateElementStyle(cardata, Color.RED);
			mDisplayManager.flashing(cardata,1);
			break;
		case 3:
			mDisplayManager.updateElementStyle(cardata, Color.YELLOW);
			break;
		}
	}
}
