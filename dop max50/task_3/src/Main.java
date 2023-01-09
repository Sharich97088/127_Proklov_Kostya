public class Main {
    public static void main(String[]args){
        Atm a =  new Atm();
        a.load(5,5,5,1);
        a.print();
        //a.give(3200);
        if(a.give(5200)==true){
            System.out.println("Успешно");
            a.print();
        }
        else{
            System.out.println("Не успешно");
        }
    }
}