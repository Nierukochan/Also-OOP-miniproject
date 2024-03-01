public class Bill {
  
  public int bill_no;
  public double bill_vat;

  public Bill() {}

  public Bill(int bill_no ,double bill_vat) {
    this.bill_no = bill_no;
    this.bill_vat = bill_vat;
  }

  public void SetBillno(int bill_no) {
    this.bill_no = bill_no;
  }

  public void SetBillVat(double bill_vat) {
    this.bill_vat = bill_vat;
  }

  public int getBillno() {
    return bill_no;
  }

  public double getBillVat() {
    return bill_vat;
  }

  public void getBill() {
    
  }
}
