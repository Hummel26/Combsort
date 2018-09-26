import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class sort {
	public static void main(String[] Args){
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String type = kb.next();
		String ing = kb.next();
		student[] stu = new student[n];
		for(int i = 0; i < n;i++){
			stu[i] = new student(kb.nextInt(),kb.next(),kb.nextDouble());
		}
		
		if(type.equals("a")){
			if(ing.equals("id")){
				Arrays.sort(stu, student.idComp);
			}else if(ing.equals("name")){
				Arrays.sort(stu, student.nameComp);
			}else if(ing.equals("gpa")){
				Arrays.sort(stu, student.gpaComp);
			}
		}else if(type.equals("d")){
			if(ing.equals("id")){
				Arrays.sort(stu, student.idComp.reversed());
			}else if(ing.equals("name")){
				Arrays.sort(stu, student.nameComp.reversed());
			}else if(ing.equals("gpa")){
				Arrays.sort(stu, student.gpaComp.reversed());
			}	
		}
		
		for(student temp: stu){
			System.out.println(temp.toString());
		}
	}
}

