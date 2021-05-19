package Bai5_3;
import java.util.*;
public class Management {

	public static void main(String[] args) {
		// khởi tạo list1
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=4; i<=10; i++) {
			list1.add(i);
		}
		// Khởi tạo list2
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=15; i<=17; i++) {
			list2.add(i);
		}

		// In dữ liệu list1
		System.out.println("In list1: " + list1);
		// In dữ liệu list2 theo kiểu Iterator
		System.out.printf("In list 2 : ");
		Iterator<Integer> iter= list2.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.printf(i + ",");
		}
		System.out.println();
		// Tại vị trí số 3 chèn số 20
		list1.set(2,20);
		System.out.println("In list1 sau khi bi chen: " + list1);
		// Nối list2 vào list1
		list1.addAll(list2);
		System.out.println("In list1 khi duoc noi list2: " + list1);
		// �?ếm xem trong list1 có bao nhiêu phần tử
		System.out.println("So phan tu trong list1: " + list1.size());
		// Sắp xếp list1 giảm dần
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("list1 giam dan: " + list1);
	}

}
