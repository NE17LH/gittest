package BillPay;

import java.util.Scanner;



public class BillPay {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   BillPerson person = new BillPerson();
	   while (true) { 
		   System.out.println("1. �Ǽ�����"); 
           System.out.println("2. �Ǽ�֧��");
           System.out.print("��ѡ�������");
           int choice = scanner.nextInt();  
           scanner.nextLine(); // ���Ļ��з� 
           switch (choice) {  
           case 1:  
               System.out.print("������������Ϣ��");  
               System.out.print("����(yyyy.mm.dd)��");
               String date = scanner.nextLine();  
               person.setDate(date);
               System.out.print("��");  
               double income = scanner.nextDouble();  
               person.setAmount(income);
               System.out.print("���"); 
               String kind = scanner.nextLine(); 
               person.setKind(kind);
               String eat = scanner.nextLine();
               System.out.print("��ע��"); 
               String notes = scanner.nextLine();
               person.setNotes(notes);
               System.out.print("�����ѳɹ���¼��");
               break;
           case 2:
           System.out.print("������֧����Ϣ��");  
           System.out.print("����(yyyy.mm.dd)��");
           String date1 = scanner.nextLine();  
           person.setDate(date1);
           System.out.print("��");  
           double outpay = scanner.nextDouble();  
           person.setAmount(outpay);
           System.out.print("���"); 
           String kind1 = scanner.nextLine(); 
           person.setKind(kind1);
           String eat1 = scanner.nextLine();
           System.out.print("��ע��"); 
           String notes1 = scanner.nextLine();
           person.setNotes(notes1);
           System.out.print("֧���ѳɹ���¼��");
           break;
           
           }
	   }
   }
}
