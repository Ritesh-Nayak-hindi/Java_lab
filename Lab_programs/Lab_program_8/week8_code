import java.util.*;


class CSE extends Thread{
public void run(){
try{ while(true){
System.out.println("CSE");
Thread.sleep(2000);
}
}
catch(InterruptedException e){
System.out.println("EXCEPTION CAUGHT:"+e.getMessage());
}

}
}

class BMS extends Thread{
public void run(){
try{
while(true){
System.out.println("BMS");
Thread.sleep(10000);
}
}
catch(InterruptedException e){
System.out.println("EXCEPTION CAUGHT:"+e.getMessage());
}

}

}
public class multi{
public static void main(String args[]){
CSE th1=new CSE();
BMS th2=new BMS();
th1.start();
th2.start();
}
}
