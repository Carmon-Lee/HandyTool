package files;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		for (int i = 0; i <4; i++) {
			list1.add("1379445241"+i);			
		}
		List<String> list2=new ArrayList<>(list1);
		duplicateRemoval(list1, list2);
		System.out.println(list1);
	}
	
	public static void duplicateRemoval(List listPhone, List listSmPh) {
		Set set = new HashSet();
		List listSmPhone = new ArrayList();

		for (Iterator iter = listSmPh.iterator(); iter.hasNext();) {
			Object element = iter.next();
			String[] ele = element.toString().split(",");
			String str;
			for (int i = 0; i < ele.length; i++) {
				ele[i] = ele[i].replace("[", "").trim();
				ele[i] = ele[i].replace("]", "");
				element = "[" + ele[i] + "]";

				//假如set添加成功，则加入listSmPhone
				if (set.add(element)) {
					listSmPhone.add(element);

				} else {
					//假如已经存在，则
					element = element.toString().replace("[", "");
					element = element.toString().replace("]", "");
					listPhone.remove(element);
				}
			}
		}
		listPhone.add("hi");
		//return listPhone;
	}
}
