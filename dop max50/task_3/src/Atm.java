import java.util.HashMap;
public class Atm {
    private int cal50,cal100,cal1000,cal2000;
    public Atm(){
        this.cal50 = 0;
        this.cal100 = 0;
        this.cal1000 = 0;
        this.cal2000 = 0;
    }
    public int getCal50(){
        return this.cal50;
    }
    public int getCal100(){
        return this.cal100;
    }
    public int getCal1000(){
        return this.cal1000;
    }
    public int getCal2000(){
        return this.cal2000;
    }
    public void print(){
        System.out.println("50: "+this.getCal50());
        System.out.println("100: "+this.getCal100());
        System.out.println("1000: "+this.getCal1000());
        System.out.println("2000: "+this.getCal2000());
    }
    public void load(int l50, int l100,int l1000, int l2000){
        if(l50>0){
            this.cal50+=l50;
        }
        if(l100>0){
            this.cal100+=l100;
        }
        if(l1000>0){
            this.cal1000+=l1000;
        }
        if(l2000>0){
            this.cal2000+=l2000;
        }
    }
    public boolean give(int sum) {
        if(sum%50 !=0){
            return false;
        }
        int temp2000 = cal2000;
        int temp1000 = cal1000;
        int temp100 = cal100;
        int temp50 = cal50;
        int flag = 1;
        while(flag ==1){
            if(cal2000>0 && sum>=2000){
                while(cal2000>0 && sum>=2000){
                    sum = sum-2000;
                    cal2000 = cal2000-1;
                }
                if(sum == 0){
                    return true;
                }
            }
            if((cal1000>0 && 1000<=sum && sum<=2000) || (sum>=1000 && cal2000==0)){
                while(cal1000>0 && sum>=1000){
                    sum = sum-1000;
                    cal1000 = cal1000 - 1;
                }
                if(sum == 0){
                    return true;
                }
            }
            if((cal100>0 && 100<=sum && sum<=1000) || (sum>=100 && cal1000 ==0)){
                while(cal100>0 && sum>=100){
                    sum = sum -100;
                    cal100 = cal100-1;
                }
                if(sum == 0){
                    return true;
                }
            }
            if((cal50>0 && 50<=sum && sum<=100) || (sum>=50 && cal50 ==0)){
                while(cal50>0 && sum>=50){
                    sum = sum-50;
                    cal50 = cal50-1;
                }
                if(sum == 0){
                    return true;
                }
            }
            if(sum > 0){
                cal2000 = temp2000;
                cal1000 = temp1000;
                cal100 = temp100;
                cal50 = temp50;
                return false;
            }

        }
        return  false;
    }
}