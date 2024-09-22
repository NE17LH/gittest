package BillPay;

import java.util.Scanner;



public class BillPay {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   BillPerson person = new BillPerson();
	   while (true) { 
		   System.out.println("1. 登记收入"); 
           System.out.println("2. 登记支出");
           System.out.print("请选择操作：");
           int choice = scanner.nextInt();  
           scanner.nextLine(); // 消耗换行符 
           switch (choice) {  
           case 1:  
               System.out.print("请输入收入信息：");  
               System.out.print("日期(yyyy.mm.dd)：");
               String date = scanner.nextLine();  
               person.setDate(date);
               System.out.print("金额：");  
               double income = scanner.nextDouble();  
               person.setAmount(income);
               System.out.print("类别："); 
               String kind = scanner.nextLine(); 
               person.setKind(kind);
               String eat = scanner.nextLine();
               System.out.print("备注："); 
               String notes = scanner.nextLine();
               person.setNotes(notes);
               System.out.print("收入已成功记录！");
               break;
           case 2:
           System.out.print("请输入支出信息：");  
           System.out.print("日期(yyyy.mm.dd)：");
           String date1 = scanner.nextLine();  
           person.setDate(date1);
           System.out.print("金额：");  
           double outpay = scanner.nextDouble();  
           person.setAmount(outpay);
           System.out.print("类别："); 
           String kind1 = scanner.nextLine(); 
           person.setKind(kind1);
           String eat1 = scanner.nextLine();
           System.out.print("备注："); 
           String notes1 = scanner.nextLine();
           person.setNotes(notes1);
           System.out.print("支出已成功记录！");
           break;
           
           }
	   }
   }
}
