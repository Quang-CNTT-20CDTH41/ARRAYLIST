package Bai5_4;
import java.util.*;
public class Test {
	private List<Integer> list;

	public Test(List<Integer> list) {
		super();
		this.list = list;
	}
	public List<Integer> inAn() {
		return list;
	}
	public int demChan(List<Integer> list) {
		int x,y=0;
		for(int i=0; i< list.size(); i++) {
			x = list.get(i);
			if(x % 2==0) {
				y++;
			}
		}
		return y;
	}
	public List<Integer> sapXepGiam() {
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
}
