package day24_CustomMethodReturn;

public class BreakFastTasks {
    public static void main(String[] args) {

        initials("cyedo", "school");

        System.out.println("=================");

        domain("Cydeo.School@gmail.com");

        System.out.println("==================");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@amazon.com", "Gulsen@gmail.com"};

        domain( emails[0] );
        for (String email : emails) {
            domain(email);
        }
        System.out.println("======================");
        nameOfMonth(12);



    }
  //  1. Create a method that can display the initials of the person,
    // initials(String firstName, String LastName)
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    // 2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email){ // Cydeo.School@gmail.com
        String domain =email.substring(email.indexOf("@") +1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String name = "";

        if(number >= 1 && number<= 12){

            name = (number==1)? "January":(number==2)? "February":(number==3)? "March":(number==4)? "April":(number==5)? "May":
                    (number==6)? "June":(number==7)? "July":(number==8)? "August":(number==9)? "September":(number==10)? "October":
                            (number==11)? "November":"December";
        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){


    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonths(int number){


    }

    // ageGroups(int age)


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. ageGroups

 */