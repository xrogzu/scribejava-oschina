package com.github.scribejava.apis.examples;

import com.github.scribejava.apis.OschinaApi;
import com.github.scribejava.apis.QQApi;
import com.github.scribejava.apis.SinaWeiboApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class OsChinaExample {

	public static void main(String[] args) {

		final OAuth20Service oschina = new ServiceBuilder().apiKey("CTJlkYcnBaZCsi4GGgUk")
				.apiSecret("TlKrmPCKImAKEzk1ORZtdwooJKDIgXrF").callback("http://www.yichisancun.com/oschinalogin.htm")
				.responseType("code").build(OschinaApi.instance());
		System.out.println(oschina.getAuthorizationUrl());
	}
}
