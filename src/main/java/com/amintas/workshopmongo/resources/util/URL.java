package com.amintas.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.data.mongodb.core.aggregation.StringOperators.ToLower;

public class URL {

	public static String decodeParam(String text) {
		
		try {
			return URLDecoder.decode(text, "UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			
			return "";
		}
	}
}