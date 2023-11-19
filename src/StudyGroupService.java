import java.util.List;

public class StudyGroupService {
    public static StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }

}