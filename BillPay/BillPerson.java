package BillPay;

public class BillPerson {
  String date;
  double amount;
  String kind;
  String notes;
  void setDate(String date){
	  this.date = date;
  }
  String getDate() {
	  return date;	  
  }
  void setAmount(double amount) {
	  this.amount = amount;
  }
  double getAmount() {
	  return amount;
  }
  void setKind(String kind) {
	  this.kind = kind;
  }
  String getKind() {
	  return kind;
  }
  void setNotes(String notes) {
	  this.notes = notes;
  }
  String getNotes() {
	  return notes;
  }
  void addAmount(double income) {
	  amount +=income;
  }
  void cutAmount(double outpay) {
	  if(amount >=outpay) {
		  amount -=outpay;
	  }
  }
}
