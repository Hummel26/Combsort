import java.util.Comparator;


public class student {
	int id;
	String name;
	double gpa;
	
	public student(int id,String name,double gpa){
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String toString(){
		return id + " " + name + " " + gpa;
	}
	
	public static Comparator<student> idComp = new Comparator<student>(){
		public int compare(student o1,student o2){
			return o1.id - o2.id;
		}
	};
	
	public static Comparator<student> nameComp = new Comparator<student>(){
		public int compare(student o1,student o2){
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator<student> gpaComp = new Comparator<student>(){
		public int compare(student o1,student o2){
			if(o1.gpa - o2.gpa < 0){
				return -1;
			}else if(o1.gpa - o2.gpa > 0){
				return 1;
			}
			return 0;
		}
	};
}
