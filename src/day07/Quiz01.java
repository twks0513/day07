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
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.print(">>>");
			choice = scan.nextInt();
			
			if(choice==1) {
				System.out.println("����ó�� ����մϴ�.");
				System.out.println("�̸� ���");
				System.out.print(">>>");
				name = scan.next();
				if(nameArr.contains(name)==false) {
					nameArr.add(name);
					System.out.println("��ȭ��ȣ ���");
					System.out.print(">>>");
					phone = scan.next();
					if(phoneArr.contains(phone)==false) {
						phoneArr.add(phone);
						System.out.println("����� �Ϸ� �Ǿ����ϴ�");
					}				
				}else if(nameArr.contains(name)) {
					System.out.println("�̹� ��ϵ� �̸��Դϴ�");
					continue;
				}
			}else if(choice ==2) {
				System.out.println("����ó�� Ȯ���� �̸��� �Է����ּ���");
				System.out.print(">>>");
				String checkName = scan.next();
				if(nameArr.contains(checkName)) {					
					int i =nameArr.indexOf(checkName);
					
					System.out.println(nameArr.get(i));
					System.out.println(phoneArr.get(i));
				}else if(nameArr == null||nameArr.contains(checkName)==false) {
					System.out.println("�ش� ����ڴ� ��ϵ��� �ʾҽ��ϴ�");
					continue;
				}
			}else if(choice ==3) {
				System.out.println("������ ����ó�� �̸��� �Է����ּ���");
				System.out.print(">>>");
				String removeName=scan.next();
				if(nameArr.contains(removeName)) {
					int i =nameArr.indexOf(removeName);
					nameArr.remove(i);
					phoneArr.remove(i);
					System.out.println(removeName+"������� ����ó�� �����Ǿ����ϴ�.");
					continue;
				}else if(nameArr ==null||nameArr.contains(removeName)==false) {
					System.out.println("�ش� ����ڴ� ��ϵ��� �ʾҽ��ϴ�");
					continue;
				}
			}else if(choice ==4) {
				System.out.println("��ü ����ó�� ����մϴ�");
				if(nameArr.size()!=0&&phoneArr.size()!=0) {
					for(int i=0;i<nameArr.size();i++) {
						System.out.println("�̸� : "+nameArr.get(i));
						System.out.println("��ȭ��ȣ : "+phoneArr.get(i)+"\n");
						continue;
					}
				}else if(nameArr.size()==0){
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
					continue;
				}
			}else if(choice ==5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			
			
		}
	}

}
