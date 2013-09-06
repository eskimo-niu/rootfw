/*
 * This file is part of the RootFW Project: https://github.com/spazedog/rootfw
 *  
 * Copyright (c) 2013 Daniel Bergløv
 *
 * RootFW is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * RootFW is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with RootFW. If not, see <http://www.gnu.org/licenses/>
 */

package com.spazedog.lib.rootfw3;

import android.os.Build;

public class Common {
	protected static Boolean mEmulator = false;
	
	static {
		mEmulator = Build.BRAND.equalsIgnoreCase("generic") || 
				Build.MODEL.contains("google_sdk") || 
				Build.MODEL.contains("Emulator") || 
				Build.MODEL.contains("Android SDK");
	}
	
	/**
	 * Check if the current device is an emulator 
	 */
	public static Boolean isEmulator() {
		return mEmulator;
	}
}
