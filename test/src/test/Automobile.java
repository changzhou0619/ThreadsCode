package test;

interface Automobile { String describe(); }

class FourWheeler implements Automobile{
   String name;
   public String describe(){ return " 4 Wheeler " + name; }
}
 
class TwoWheeler extends FourWheeler{
	String name;
	public String describe(){ return " 2 Wheeler " + name; }

public static void main(String args[]){
    FourWheeler m = new TwoWheeler();
    m.describe();
    m.describe();
 }
}
