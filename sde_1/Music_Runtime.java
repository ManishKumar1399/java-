package sde_1;

import java.util.ArrayList;
import java.util.List;

public class Music_Runtime {
	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		int[] duration = { 1, 10, 27, 35,2, 60 };

		song_sel(duration, 90, ans,new ArrayList<>());
		System.out.println(ans);
	}

	public static void song_sel(int[] duration, int Ride_dur, List<List<Integer>> ans,List<Integer> an) {

		int max_dur = 0;

		for (int i = 0; i < duration.length - 1; i++) {
			for (int j = i + 1; j < duration.length; j++) {
				int ride = duration[i] + duration[j];
				if (ride == Ride_dur - 30) {
					int temp = Math.max(duration[i], duration[j]);
					if (temp > max_dur) {
						max_dur = Math.max(duration[i], duration[j]);
						an.add(i);
						an.add(j);
						ans.add(new ArrayList<Integer>(an));
					}
				}
			}
		}
		if (ans.isEmpty()) {
			an.add(-1);
			an.add(-1);
			ans.add(new ArrayList<Integer>(an));
			
		}
	}

}
