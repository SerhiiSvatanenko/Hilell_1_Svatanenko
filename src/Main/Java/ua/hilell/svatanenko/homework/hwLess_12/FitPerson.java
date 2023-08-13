package ua.hilell.svatanenko.homework.hwLess_12;

public class FitPerson {
    private String fName;
    private String bDay;
    private String bMonth;
    private String bYear = "1983";
    private String eMail;
    private String phone;
    public String sName;
    public String weigt;
    public String bPressure;
    public String qttStepDay;
    public int age = 2023 - Integer.parseInt(bYear);

    public FitPerson(String "Petya", String sName, String "01", String "02", String "1983", String "some@email", String "+380671112244", String weigt, String bPressure, String qttStepDay) {

    }

    void printAccountInfo() {
        System.out.println(fName + " " + sName + " " + age + " " + bPressure + " " + weigt + " " + qttStepDay + " " + phone + " " + eMail);
    }
}
