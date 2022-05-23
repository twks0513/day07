package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList nameArr = new ArrayList();
		ArrayList phoneArr = new ArrayList();
		String name,phone;
		int choice;
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>");
			choice = scan.nextInt();
			
			if(choice==1) {
				System.out.println("연락처를 등록합니다.");
				System.out.println("이름 등록");
				System.out.print(">>>");
				name = scan.next();
				if(nameArr.contains(name)==false) {
					nameArr.add(name);
					System.out.println("전화번호 등록");
					System.out.print(">>>");
					phone = scan.next();
					if(phoneArr.contains(phone)==false) {
						phoneArr.add(phone);
						System.out.println("등록이 완료 되었습니다");
					}				
				}else if(nameArr.contains(name)) {
					System.out.println("이미 등록된 이름입니다");
					continue;
				}
			}else if(choice ==2) {
				System.out.println("연락처를 확인할 이름을 입력해주세요");
				System.out.print(">>>");
				String checkName = scan.next();
				if(nameArr.contains(checkName)) {					
					int i =nameArr.indexOf(checkName);
					
					System.out.println(nameArr.get(i));
					System.out.println(phoneArr.get(i));
				}else if(nameArr == null||nameArr.contains(checkName)==false) {
					System.out.println("해당 사용자는 등록되지 않았습니다");
					continue;
				}
			}else if(choice ==3) {
				System.out.println("삭제할 연락처의 이름을 입력해주세요");
				System.out.print(">>>");
				String removeName=scan.next();
				if(nameArr.contains(removeName)) {
					int i =nameArr.indexOf(removeName);
					nameArr.remove(i);
					phoneArr.remove(i);
					System.out.println(removeName+"사용자의 연락처가 삭제되었습니다.");
					continue;
				}else if(nameArr ==null||nameArr.contains(removeName)==false) {
					System.out.println("해당 사용자는 등록되지 않았습니다");
					continue;
				}
			}else if(choice ==4) {
				System.out.println("전체 연락처를 출력합니다");
				if(nameArr.size()!=0&&phoneArr.size()!=0) {
					for(int i=0;i<nameArr.size();i++) {
						System.out.println("이름 : "+nameArr.get(i));
						System.out.println("전화번호 : "+phoneArr.get(i)+"\n");
						continue;
					}
				}else if(nameArr.size()==0){
					System.out.println("등록된 연락처가 없습니다.");
					continue;
				}
			}else if(choice ==5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			
		}
	}

}
