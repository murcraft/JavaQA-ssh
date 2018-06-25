package by.htp.kyzniatsova.entity;

import java.util.Comparator;

public class SortComparator implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		int res = u1.getName().compareTo(u2.getName());
		if(res == 0){
			return u1.getAge() - u2.getAge();
		}
		return res;
	}

}
