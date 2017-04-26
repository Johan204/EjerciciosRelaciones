package Number4;

/**
 *
 * @author Johan
 */
public class Date {

    private int day;
    private int month;
    private int year;
    private String[] namesDays;
    private String[] namesMonths;

    public Date(int day, int month, int year, String[] namesDays, String[] namesMonths) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.namesDays = namesDays;
        this.namesMonths = namesMonths;
    }

    public boolean isLeapYear(int month) {
        return this.month % 4 == 0;
      
    }

    public void imprimir() {
        if (isLeapYear(this.month) == true) {
            System.out.println("Es un año biciesto");
        } else {
            System.out.println("No es un año biciesto");
        }
    }
    
    public int defMes(){
        if(isLeapYear(this.month) == true){
            switch (this.month){
                case 1:
                return 0;
                case 2:
                return 3;
                case 3:
                return 3;
                case 4:
                return 6;
                case 5:
                return 1;
                case 6:
                return 4;
                case 7:
                return 6;
                case 8:
                return 2;
                case 9:
                return 5;
                case 10:
                return 0;
                case 11:
                return 3;
                case 12:
                return 5;
                default:
                return 0;
            }
        }else{
            switch (this.month){
                case 1:
                return 0;
                case 2:
                return 3;
                case 3:
                return 4;
                case 4:
                return 0;
                case 5:
                return 2;
                case 6:
                return 5;
                case 7:
                return 0;
                case 8:
                return 3;
                case 9:
                return 6;
                case 10:
                return 1;
                case 11:
                return 4;
                case 12:
                return 6;
                default:
                return 0;
            }
        }
    }
    
    public int defDia(){
        int d;
        d = ((this.year - 1) % 7 + ((this.year - 1) /4 - 3 * ((this.year - 1)/100 + 1)/4)%7 + this.defMes() +this.day%7)%7;
        if(d == 0){
            return 6;
        }else if(this.year%7==0){
            return d-1;
        }else{
            return d;
        }
    }
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getNamesDays(int i) {
        return namesDays[i];
    }

    public String getNamesMonths() {
        return namesMonths[this.month];
    }

    

}
