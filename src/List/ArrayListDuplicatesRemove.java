package List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDuplicatesRemove {
	
	
public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(210);
	list1.add(471);
	list1.add(452);
	list1.add(85);
	list1.add(41);
	list1.add(74);
	list1.add(41);
	list1.add(85);
	list1.add(471);
	Collections.sort(list1);
	System.out.println(list1);
	
	 ArrayList<Integer> duplicateRemove=new ArrayList<>();
	 for(int a=0;a<list1.size()-1;a++)
	 {
		 if(!duplicateRemove.contains(list1.get(a)))
		 {
			 duplicateRemove.add(list1.get(a));
		 }
	 }
	 System.out.println(duplicateRemove);

}
}
