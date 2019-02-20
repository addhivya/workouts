package Assignment6.Problem3;

public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected int sex;
    private int sMonth,sDay,sYear,eMonth,eDay,eYear;
    public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

    enum Sex {
        MALE, FEMALE, SPAYED, NEUTERED
    }

    Pet(String name, String ownerName, String color) {
        this.petName = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return this.petName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getColor() {
        return this.color;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    String getSex() {
        switch (this.sex) {
            case MALE:
                return Sex.MALE.name();
            case FEMALE:
                return Sex.FEMALE.name();
            case SPAYED:
                return Sex.SPAYED.name();
            case NEUTERED:
                return Sex.NEUTERED.name();
        }
        return null;
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(this.getPetName()).append(" owned by ").append(this.getOwnerName());
        text.append("\n");
        text.append("Color: ").append(this.getColor());
        text.append("\n");
        text.append("Sex: ").append(this.getSex().toLowerCase());
        return text.toString();
    }

    public void setBoardStart(int month, int day, int year) {
        this.sMonth = month;
        this.sDay = day;
        this.sYear = year;
    }

    public void setBoardEnd(int month, int day, int year) {
        this.eMonth = month;
        this.eDay = day;
        this.eYear = year;
    }

    public boolean boarding(int month, int day, int year) {
        if (this.sMonth < 1 || this.sMonth > 12 || this.eMonth > 12 || this.eMonth < 1 || month < 1 || month > 12) {
            throw new RuntimeException("Invalid month");
        }
        if (this.sDay < 1 || this.sDay > 31 || this.eDay > 31 || this.eDay < 1 || day < 1 || day > 31) {
            throw new RuntimeException("Invalid date");
        }
        if(String.valueOf(year).length()!=4 ||
                String.valueOf(this.sYear).length()!=4 ||
                String.valueOf(this.eYear).length()!=4) {
            throw new RuntimeException("Invalid year");
        }

        if (year > this.sYear && year < eYear)
            return true;
        else if ((year > sYear && year > eYear) || (year < sYear && year < eYear))
            return false;
        else if (month > sMonth && month < eMonth)
            return true;
        else return (month == sMonth) && (day >= sDay) || (month == eMonth) && (day <= eDay);
    }
}
