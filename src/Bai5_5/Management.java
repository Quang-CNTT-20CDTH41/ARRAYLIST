package Bai5_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import dev1.Student;

public class Management {
	
	public static void main(String[] args) {
		List<SV> list = new ArrayList<SV>();
		Test a = new Test(list, "Quang", 23);
		list.add(a);
		Test a1 = new Test(list, "Quang", 23);
		list.add(a);
		a.inAn();
	}

}
