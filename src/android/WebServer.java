package com.rjfun.cordova.httpd;

import android.content.res.AssetManager;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServer extends NanoHTTPD
{
	public WebServer(InetSocketAddress localAddr, AndroidFile wwwroot, AssetManager wwwAssets) throws IOException {
		super(localAddr, wwwroot, wwwAssets);
	}

	public WebServer(int port, AndroidFile wwwroot, AssetManager wwwAssets ) throws IOException {
		super(port, wwwroot, wwwAssets);
	}
}
