import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 40, 20,10);
		Set<Integer> item = new HashSet();

		Set<Integer> updatedSet = list.stream().filter(n -> !item.add(n)).collect(Collectors.toSet());

		System.out.println(updatedSet);

	}

}
