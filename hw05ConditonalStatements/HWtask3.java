package hw05ConditonalStatements;

import java.util.Scanner;

public class HWtask3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ERROR Code:");
		int Code = sc.nextInt();
		
		switch (Code) {
		case 400: System.out.println ("Bad Request"); 			break;
		case 401: System.out.println ("Unauthorized");			break;
		case 402: System.out.println ("Payment Required");			break;
		case 403: System.out.println ("Forbidden");			break;
		case 404: System.out.println ("Not Found");			break;
		case 405: System.out.println ("Method Not Allowed");			break;
		case 406: System.out.println ("Not Acceptable");			break;
		case 407: System.out.println ("Proxy Authentication Required");			break;
		case 408: System.out.println ("Request Timeout");			break;
		case 409: System.out.println ("Conflict");			break;
		case 410: System.out.println ("Gone");			break;
		case 411: System.out.println ("Length Required");			break;
		case 412: System.out.println ("Precondition Failed");			break;
		case 413: System.out.println ("Payload Too Large");			break;
		case 414: System.out.println ("URI Too Long");			break;
		case 415: System.out.println ("Unsupported Media Type");			break;
		case 416: System.out.println ("Range Not Satisfiable");			break;
		case 417: System.out.println ("Expectation Failed");			break;
		case 418: System.out.println ("I'm a Teapot");			break;
		case 421: System.out.println ("Misdirected Request");			break;
		case 422: System.out.println ("Unprocessable Entity");			break;
		case 423: System.out.println ("Locked");			break;
		case 424: System.out.println ("Failed Dependency");			break;
		case 425: System.out.println ("Too Early");			break;
		case 426: System.out.println ("Upgrade Required");			break;
		case 428: System.out.println ("Precondition Required");			break;
		case 429: System.out.println ("Too Many Requests");			break;
		case 431: System.out.println ("Request Header Fields Too Large");			break;
		case 451: System.out.println("Unavailable For Legal Reasons");			break;
		default: 
			System.out.println("no such http client error code");
			break;
		
		}
		sc.close();


	}
}
