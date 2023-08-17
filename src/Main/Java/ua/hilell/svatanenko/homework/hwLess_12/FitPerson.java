package ua.hilell.svatanenko.homework.hwLess_12;

public class FitPerson {
    private String fName;
    private String bDay;
    private String bMonth;
    private String bYear;
    private String eMail;
    private String phone;
    public String sName;
    public String weight;
    public String bPressure;
    public String qttStepDay;
    public int age;

    public FitPerson(String fName, String bDay, String bMonth, String bYear, String eMail, String phone, String sName, String weigt, String bPressure, String qttStepDay) {
        this.fName = fName;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;
        this.eMail = eMail;
        this.phone = phone;
        this.sName = sName;
        this.weight = weight;
        this.bPressure = bPressure;
        this.qttStepDay = qttStepDay;
        this.age = 2023 - Integer.parseInt(bYear);

    }

//    public static void setfName(String fName) {
//            this.fName = fName;
    }

    void printAccountInfo() {
        System.out.println(fName + " " + sName + ", " + "age " + age + ", " + "blode  pr - "+ bPressure + ", " +" weigt"+ weight + ", " + "qttStepDay " + qttStepDay + ", " + phone + ", " + eMail);

    }
}
