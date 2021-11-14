package _04_conditionStatementsFile.hw1;
import java.util.Arrays;
import java.util.Scanner;

class App {
	////////////////////////////////////////////////////////////////////////////
	private static final App instance = new App();
	private static final Scanner in = new Scanner(System.in);
	////////////////////////////////////////////////////////////////////////////
	private boolean belongToRange(int from, int to, float num) {
		return num >= from && num <= to;
	}
	////////////////////////////////////////////////////////////////////////////
	private int maxInt(int... nums) {
		int res = nums[0];
		for(int num: Arrays.copyOfRange(nums, 1, nums.length))
			if(num > res)
				res = num;
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	private int minInt(int... nums) {
		int res = nums[0];
		for(int num: Arrays.copyOfRange(nums, 1, nums.length))
			if(num < res)
				res = num;
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	private String getClientHttpErrorCodeMeaning(int code) {
		switch (code) {
		 case 400: return "Bad Request";
		 case 401: return "Unauthorized";
		 case 402: return "Payment Required";
		 case 403: return "Forbidden";
		 case 404: return "Not Found";
		 case 405: return "Method Not Allowed";
		 case 406: return "Not Acceptable";
		 case 407: return "Proxy Authentication Required";
		 case 408: return "Request Timeout";
		 case 409: return "Conflict";
		 case 410: return "Gone";
		 case 411: return "Length Required";
		 case 412: return "Precondition Failed";
		 case 413: return "Payload Too Large";
		 case 414: return "URI Too Long";
		 case 415: return "Unsupported Media Type";
		 case 416: return "Range Not Satisfiable";
		 case 417: return "Expectation Failed";
		 case 418: return "I'm a Teapot";
		 case 421: return "Misdirected Request";
		 case 422: return "Unprocessable Entity";
		 case 423: return "Locked";
		 case 424: return "Failed Dependency";
		 case 425: return "Too Early";
		 case 426: return "Upgrade Required";
		 case 428: return "Precondition Required";
		 case 429: return "Too Many Requests";
		 case 431: return "Request Header Fields Too Large";
		 case 451: return "Unavailable For Legal Reasons";
		 default: return "no such http client error code";
		}
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		for(int i = 0; i < 3; ++i)
			try {
				System.out.println(instance.belongToRange(
						-5, 5, Float.parseFloat(in.nextLine())) ? '+' : '-');
			} catch (NumberFormatException e) {
				System.out.println(e.getClass().getSimpleName() + ' ' +  e.getMessage());
			}
		int[] nums = new int[3];
		for(int i = 0; i < 3; ++i)
			try {
			nums[i] = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getClass().getSimpleName() + ' ' +  e.getMessage());
			}
		System.out.println("max = " + instance.maxInt(nums) +
				"\tmin" + instance.minInt(nums));
		try {
		System.out.println(instance.getClientHttpErrorCodeMeaning(
				Integer.parseInt(in.nextLine())));
		} catch (NumberFormatException e) {
			System.out.println(e.getClass().getSimpleName() + ' ' +  e.getMessage());
		}
	}
	////////////////////////////////////////////////////////////////////////////
}