package sde_1;

import java.util.*;

public class Upgrading_junction_box {
	public static void main(String[] args) {
		String [] args1= {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		String [] ans=reorderLogFiles(args1);
//		System.out.println(ans.toString());
		for (String val:ans) {
			System.out.println(val);
		}
	}

	public static String[] reorderLogFiles(String[] logs) {
		List<String> letterList = new ArrayList<>();
		String[] result = new String[logs.length];
		if (logs.length > 0) {
			List<String> digList = new ArrayList<>();
			for (int i = 0; i < logs.length; i++) {
				int sec1 = logs[i].split(" ")[1].charAt(0);
				boolean isDig = sec1 >= 48 && sec1 <= 57;
				if (isDig)
					digList.add(logs[i]);
				else
					letterList.add(logs[i]);
			}
			Collections.sort(letterList, new Comparator<String>() {
				public int compare(String s1, String s2) {
					int strt1 = s1.indexOf(' ');
					int strt2 = s2.indexOf(' ');
					String shortS1 = s1.substring(strt1, s1.length());
					String shortS2 = s2.substring(strt2, s2.length());
					return shortS1.contentEquals(shortS2) ? s1.compareTo(s2) : shortS1.compareTo(shortS2);
				}
			});
			letterList.addAll(digList);
		}

		return letterList.toArray(result);
	}

}
