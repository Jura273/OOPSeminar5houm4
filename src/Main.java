import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Использование функции createStudyGroup
        // Создание обьектов преподавателя и списка студентов

        Teacher teacher = new Teacher(" Петр Иванович ");
        List<Student> students = List.of(
                new Student("Алексей, "),
                new Student("Андрей, "),
                new Student("Геннадий ")
        );

        // Формирование StudyGroup с помощью функции createStudyGroup
        StudyGroup studyGroup = StudyGroupService.createStudyGroup(teacher, students);
        // вывод информации о созданной StudyGroup

        System.out.println("Группа: ");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты: ");
        for (Student student : studyGroup.getStudents()){
            System.out.printf(student.getName());
        }


    }
}