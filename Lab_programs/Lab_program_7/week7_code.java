import java.util.*;
import java.util.Scanner;

class WrongageException extends Exception{
public WrongageException(String m){
super(m);
}
}

class SonageException extends Exception{
public SonageException(String m){
super(m);
}
}
class Father{
int age;
public Father(Scanner sc) throws WrongageException{
System.out.println("ENTER THE AGE OF THE FATHER");
this.age =sc.nextInt();
if(age<0){
throw new WrongageException("THE AGE OF THE FATHER CANNOT BE NEGATIVE");
}
}
public int get_age(){

return this.age;
}
public void print_age(){
System.out.println("THE AGE OF THE FATHER IS: "+this.age);
}
}

class Son extends Father{
int age;
Scanner sc=new Scanner (System.in);
public Son(Scanner sc) throws SonageException,WrongageException {
super(sc);
System.out.println("ENTER THE AGE OF THE SON");
this.age=sc.nextInt();

if(this.age<0){
throw new WrongageException("THE AGE OF THE FATHER CANNOT BE NEGATIVE");

}

if(this.age>super.age){
throw new SonageException("THE AGE OF THE FATHER CANNOT BE SMALLER THAN THAT OF THE SON");

}

}

public void get_data(){
System.out.println("FATHER AGE :"+super.age+"\nSON AGE: "+this.age);
}
}


public class exception{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
Father F=new Father(sc);
F.print_age();
Son S=new Son(sc);
S.get_data();
}
catch(WrongageException | SonageException e){
System.out.println("Exception Occured: "+e.getMessage());
}

finally{
sc.close();
}
}













}
