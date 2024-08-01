package com.Test3;

public class StudentTest {

	public static void main(String[] args) {

		Student studentArray[] = new Student[3];
		Student student1 = new Student("홍길동",15,170,80);
		Student student2 = new Student("한사람",13,180,70);
		Student student3 = new Student("임걱정",16,175,65);
		
		studentArray[0] = student1;
		studentArray[1] = student2;
		studentArray[2] = student3;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].studentInfo());
		}
		System.out.println();
		
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
		}
		
		System.out.println("나이 평균: " + String.format("%.3f",(sumAge/3.0)));
		System.out.println("신장 평균: " + String.format("%.3f",(sumHeight/3.0)));
		System.out.println("몸무게 평균: " + String.format("%.3f",(sumWeight/3.0)));
		System.out.println();
		
		int ageH = 0;
		int ageL = 0;
		int heightH = 0;
		int heightL = 0;
		int weightH = 0;
		int weightL = 0;
		for (int i = 1; i < studentArray.length; i++) {
			if(studentArray[i].getAge() > studentArray[ageH].getAge()) {
				ageH = i;
			}
			if(studentArray[i].getAge() < studentArray[ageL].getAge()) {
				ageL = i;
			}
			if(studentArray[i].getHeight() > studentArray[heightH].getHeight()) {
				heightH = i;
			}
			if(studentArray[i].getHeight() < studentArray[heightL].getHeight()) {
				heightL = i;
			}
			if(studentArray[i].getWeight() > studentArray[weightH].getWeight()) {
				weightH = i;
			}
			if(studentArray[i].getWeight() < studentArray[weightL].getWeight()) {
				weightL = i;
			}
		}
		System.out.println("나이가 가장 많은 학생: " + studentArray[ageH].getName());
		System.out.println("나이가 가장 적은 학생: " + studentArray[ageL].getName());
		System.out.println("신장이 가장 큰 학생: " + studentArray[heightH].getName());
		System.out.println("신장이 가장 작은 학생: " + studentArray[heightL].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생: " + studentArray[weightH].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + studentArray[weightL].getName());
		
		
	}

}
