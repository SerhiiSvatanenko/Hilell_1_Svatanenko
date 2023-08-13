package ua.hilell.svatanenko.homework.hwLess_12;

public class FitPerson {
    private String fName = "Petya";
    private String bDay = "01";
    private String bMonth = "02";
    private String bYear = "1983";
    private String eMail = "some1mail";
    private String phone = "some1phone";
    public String sName;
    public String weigt;
    public String bPressure;
    public String qttStepDay;
    public int age = 2023 - Integer.parseInt (bYear);

    public FitPerson(String fName, String sName, String bDay, String bMonth, String bYear, String eMail, String phone, String weigt, String bPressure, String qttStepDay) {

    }
        void printAccountInfo (){
        System.out.println(fName + " "+sName+ " "+ age + " "+bPressure+" "+ weigt+ " "+qttStepDay+ " " + phone + " " + eMail);
    }
}
