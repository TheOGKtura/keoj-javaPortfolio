import java.math.BigDecimal;

public class PersonInfo {
    private String nameInfo, addressInfo;
    private int ageInfo;
    private BigDecimal phone_num;

    public PersonInfo(String name, String address, int age, BigDecimal number) {
        nameInfo = name;
        addressInfo = address;
        ageInfo = age;
        phone_num = number;
    }

    public PersonInfo(String name, String address, String age, String number) {
        nameInfo = name;
        addressInfo = address;
        ageInfo = Integer.parseInt(age);
        phone_num = new BigDecimal(number);
    }

    public PersonInfo(String name, String address, int age, String number) {
        nameInfo = name;
        addressInfo = address;
        ageInfo = age;
        phone_num = new BigDecimal(number);
    }

    public PersonInfo() {
        nameInfo = "";
        addressInfo = "";
        ageInfo = 0;
        phone_num = new BigDecimal(0);
    }

    public String getPersonInfoName() {
        return nameInfo;
    }

    public String getPersonInfoAddress() {
        return addressInfo;
    }

    public int getPersonInfoAge() {
        return ageInfo;
    }

    public BigDecimal getPersonInfoPhoneNum() {
        return phone_num;
    }
}

