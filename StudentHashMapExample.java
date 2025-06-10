package jyothi;
import java.util.HashMap;
import java.util.List;

public class StudentHashMapExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> stu=new HashMap<>();
		stu.put(1, "jyothi");
		stu.put(2, "siva");
		stu.put(3, "keerthan");
		stu.put(4, "tejaswanth");
		stu.put(5, "sudhakar");
		System.out.println(stu);
		stu.remove(1);
		System.out.println(stu);
		stu.replace(3, "pavan");
		System.out.println(stu);
			if(stu.containsKey(4)){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			for(int i=1;i<stu.size()+1;i++) {
				System.out.println(stu.get(i));
			}
		//stu.keySet();
		System.out.println(stu.keySet());
	}

}