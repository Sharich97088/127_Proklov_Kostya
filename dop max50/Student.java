public class Student {
    private String name,group;
    private int age;
    private float mean_score;
    public Student(String n, int a, String g,float ms){
        this.name = n;
        this.age = a;
        this.group = g;
        this.mean_score = ms;
    }
    public void  setName(String n){
        this.name = n;
    }
    public void setGroup(String g){
        this.group = g;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void setMean_score(float mn){
        this.mean_score = mn;
    }
    public String getName(){ //получает переменную//
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGroup(){
        return this.group;
    }
    public float getMean_score(){
        return this.mean_score;
    }
}
