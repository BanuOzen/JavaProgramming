package day24_CustomMethodReturn;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {
    nameOfMonth(50);
    }

    public static void nameOfMonth(int number){



        if(number < 1 || number > 12){
            System.out.println("Invalid");
            System.exit(0); // exits nameOfMonth Method, remaining code fragments of the method never gets executed
        }


        String name = (number==1)? "January":(number==2)? "February":(number==3)? "March":(number==4)? "April":(number==5)? "May":
                (number==6)? "June":(number==7)? "July":(number==8)? "August":(number==9)? "September":(number==10)? "October":
                        (number==11)? "November":"December";


        System.out.println("Month name = " + name);

    }
}
