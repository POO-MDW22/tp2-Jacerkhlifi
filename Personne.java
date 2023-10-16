public class Personne {
    private String name;
    private String firstname;
    private int dayNaiss;
    private int monthNaiss;
    private int yearNaiss;

    public Personne(String name, String firstname, int dayNaiss, int monthNaiss, int yearNaiss) {
        this.name = name;
        this.firstname = firstname;
        this.dayNaiss = dayNaiss;
        this.monthNaiss = monthNaiss;
        this.yearNaiss = yearNaiss;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name = name;
    }
public void setFirstname(String firstname){
        this.firstname=firstname;
}
public String getFirstname( String firstname){
        return this.firstname=firstname;
}
public void setDayNaiss(int dayNaiss){
        this.dayNaiss=dayNaiss;
}
public int getDayNaiss(int dayNaiss) {
    return this.dayNaiss = dayNaiss;
}
public void setMonthNaiss(int monthNaiss){
        this.monthNaiss=monthNaiss;
}
public int getMonthNaiss(int monthNaiss){
        return this.monthNaiss=monthNaiss;
}
public void setYearNaiss(int yearNaiss){
        this.yearNaiss=yearNaiss;
}
 public int getYearNaiss(int yearNaiss){
        return this.yearNaiss=yearNaiss;
 }
 public void  setDateNaiss(int dayNaiss,int monthNaiss,int yearNaiss){
        this.dayNaiss=dayNaiss;
        this.monthNaiss=monthNaiss;
        this.yearNaiss=yearNaiss;
 }
 public int getAge(){
        int age=2023-this.yearNaiss;
        return age;
 }
}