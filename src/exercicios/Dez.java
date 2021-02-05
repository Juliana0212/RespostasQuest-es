package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dez {

	public static void main(String[] args){

	    List<Integer> list1 = toList(new int[] {1,2,3,4,5,6});
	    List<Integer> list2 =  toList(new int[] {1,3,5});

	    List<Integer> list4 = Stream.concat(filterContaining(list1, list2),filterContaining(list2, list1)).collect(Collectors.toList());

	    System.out.println(list4);
	}

	private static List<Integer> toList(int[] ints){
	    List<Integer> list = new ArrayList<Integer>(ints.length);
	    for (int i : ints)
	        list.add(i);
	    return list;
	}

	private static Stream<Integer> filterContaining(List<Integer> original, List<Integer> filter){
	    return original.stream().filter( e -> !filter.contains(e));
	}

	}

