package Bai5_4;
import java.util.*;
public class Management {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		// gán list có giá trị từ 1 đến 9
		for(int i=1; i<=9; i++) {
			list.add(i);
		}
		Test arr = new Test(list);
		System.out.println("In list: " + arr.inAn());
		System.out.println("Đếm số chẵn trong list: " + arr.demChan(list));
		System.out.println("sắp xếp giảm dần: " + arr.sapXepGiam());
	}

}
