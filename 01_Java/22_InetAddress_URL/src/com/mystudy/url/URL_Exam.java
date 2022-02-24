package com.mystudy.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		// 프로토콜://호스트(서버):포트/경로(패스)?질의(query)
		// https://sports.news.naver.com/news?oid=117&aid=0003579518
		
		URL url = new URL("http", "java.mystudy.com", 8080, 
				"aaa/bbb/index.jsp?id=hong&password=1234#content");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		
		
		
	}

}
