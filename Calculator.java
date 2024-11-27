// Calculator.java
public class Calculator {


    public int electbill(int currM , int lastM){
        if (currM > lastM) {
            int cal = currM - lastM;
            return cal *6;
        }else{
            System.err.println("error");
            return -1;
        }
    }
    public int waterbill(int currM , int lastM){
        if (currM > lastM) {
            int cal = currM - lastM;
            return cal *5;
        }else{
            System.err.println("error");
            return -1;
        }
    }

    public int WaterReultsBill(String roomtype){

        if(roomtype.equals("single")){
            int reultsbill = 1500 + waterbill(500, 300);
            return  reultsbill;
        }else if (roomtype.equals("double")) {
            int reultsbill = 2000 + waterbill(500, 300);
            return  reultsbill;
        }else {
            System.err.println("error");
            return -1;
        }
    }

    public int electReultsBill(String roomtype){

        if(roomtype.equals("single")){
            int reultsbill = 1500 + electbill(500, 300);
            return  reultsbill;
        }else if (roomtype.equals("double")) {
            int reultsbill = 2000 + electbill(500, 300);
            return  reultsbill;
        }else {
            System.err.println("error");
            return -1;
        }
    }
}