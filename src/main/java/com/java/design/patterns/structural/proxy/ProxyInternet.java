package com.java.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	
	Internet realInternet = new InternalInternet();
	
	static List<String> blockedSite = new ArrayList<String>();
	
	static {
		blockedSite.add("www.gmail.com");
		blockedSite.add("www.yahoo.com");
		blockedSite.add("www.facebook.com");
		blockedSite.add("www.web.whatsapp.com");
	}

	@Override
	public void connect(String siteName) throws Exception {
		if(blockedSite.contains(siteName.toLowerCase())) {
			throw new Exception("Site is blocked");
		}
		
		realInternet.connect(siteName);
		
		
	}


}
