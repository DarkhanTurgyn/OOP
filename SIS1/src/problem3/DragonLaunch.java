package problem3;

import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> launch = new Vector<Person>();
	
	private void kidnap(Person p) {
		launch.add(p);
	}
	private boolean willDragonEatOrNot() {
		int boyCnt = 0, vanishedPairs=0;
		for (int i = 0; i < launch.size(); i++) {
			Gender curGen = launch.get(i).getGender();
			if(curGen==Gender.BOY) boyCnt++;
			else {
				if(boyCnt>0) {
					boyCnt--;
					vanishedPairs++;
				}
			}
		}
		if(vanishedPairs*2 == launch.size()) return false;
		else return true;
	}
	public static void main(String[] args) {
		DragonLaunch dl = new DragonLaunch();
		dl.kidnap(new Person("Bob", Gender.GIRL));
		dl.kidnap(new Person("Tom", Gender.BOY));
		dl.kidnap(new Person("Anna", Gender.GIRL));
		dl.kidnap(new Person("Kate", Gender.BOY));
		
		String ans;
		if(dl.willDragonEatOrNot()) ans = "Will eat";
		else ans = "Everyone escapes";
		System.out.println(ans);
	}

}
