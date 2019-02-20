package Assignment8.StudentDetails;
public class StudentModel {

    enum Gender {
        Male, Female
    }

    private String id;
    private String name;
    private Gender gender;

    StudentModel(String id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}