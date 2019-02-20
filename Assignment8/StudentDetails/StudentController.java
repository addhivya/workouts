package Assignment8.StudentDetails;

import java.util.*;

public class StudentController {
    List<StudentModel> modelArrayList;

    StudentController() {
        this.modelArrayList = new ArrayList<>();
    }

    public void addEntry(String name, String id, String gender) {
        StudentModel model = new StudentModel(name, id, StudentModel.Gender.valueOf(gender));
        modelArrayList.add(model);
    }

    public List<StudentModel> getModelArrayList() {
        return this.modelArrayList;
    }
}
