package com.develogical;

public class QueryProcessor {

	public String process(String query) {
		if (query.toLowerCase().contains("shakespeare")) {
			return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
					+ "English poet, playwright, and actor, widely regarded as the greatest "
					+ "writer in the English language and the world's pre-eminent dramatist.";
		}
		if (query.toLowerCase().contains("name") || query.toLowerCase().contains("team")) {
			return "atalay";
		}
		if (query.toLowerCase().contains("largest")) {
			// query.matches("^\\s*(\\w+)\\s*\\(\\s*(\\d+)\\D+(\\d+)\D+\)\s*$");

		}
		// %20what%20is%2016%20plus%209"
		if (query.toLowerCase().contains("plus")) {
			int i = query.indexOf("plus", 0);
			int j = query.indexOf("is", 0);
			int first = Integer.parseInt((query).substring(j + 1, i));
			int second = Integer.parseInt((query).substring(i + 3, query.length()));
			int answer = first + second;
			return Integer.toString(answer);

		}
		return "";
	}
}
