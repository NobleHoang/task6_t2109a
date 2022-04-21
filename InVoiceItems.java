public class InVoiceItems {
        String id;
        String desc;
        int qty;
        double unitPrice;
        public  InVoiceItems(){
            id="T0001A";
            desc="TicketRavolution";
            qty=2;
            unitPrice=599.999;
        }
        public String getId(){
            return id;
        }
        public String getDesc(){
            return desc;
        }
        public void setQty(int qty){
            this.qty=qty;
        }
        public double getUnitPrice(){
            return unitPrice;
        }
        public void setUnitPrice(double unitPrice){
            this.unitPrice=unitPrice;
        }
        public double getTotal(){
            return unitPrice*qty;
        }
    public static void main(String[] args) {
        InVoiceItems ivt = new InVoiceItems();
        ivt.getTotal();
        System.out.println("ID: "+ivt.id);
        System.out.println("DESC: "+ivt.desc);
        System.out.println("QTY: "+ivt.qty);
        System.out.println("PRICE: "+ivt.unitPrice);
        System.out.println("TOTAL: "+ivt.getTotal());
    }
}
