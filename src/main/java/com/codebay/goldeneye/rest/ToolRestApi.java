package com.codebay.goldeneye.rest;

import java.io.IOException;

import org.springframework.web.bind.annotation.RestController;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@RestController
public class ToolRestApi {
	
	private  ToolRestApi() {}
	
	//TODO Implement API HERE
	public static String checkWord(String name) {
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()	
					.url("")	
					.get()	
					.addHeader("host", "")	
					.addHeader("key", "")	
					.build();
			Response response = client.newCall(request).execute();
			
			return response.body().string();
			
		}catch(IllegalArgumentException | IOException e) {
			return "";
		}
}
	
}
