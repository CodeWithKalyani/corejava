package in.co.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("kallu");
		l.add("vaish");
		l.add("shreya");
		l.add("mohit");
		l.add("krishna");
		l.add("ballu");
		l.add("aniket");
		l.add("j");
		l.add("j");
		l.add("jinny");

//		l.stream().sorted().forEach(e -> {
//			System.out.println(e);
//		});
//
//		l.stream().map(e -> e.toUpperCase()).forEach(e -> {
//			System.out.println(e);
//
//		});

		List list=l.stream().filter(e -> e.startsWith("j")).map(e -> e.toUpperCase()).distinct().collect(Collectors.toList());{
			System.out.println(list);
			//System.out.println(l);
		}

	}

}
