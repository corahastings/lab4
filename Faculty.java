import java.util.Arrays;

public class Faculty extends Employee {

    private String [] courses;

    public Faculty(String name, int salary, String[] courses) {
        super(name, salary);
        this.courses = courses.clone();
    }

    @Override
    public String getName() {
        return "Professor " + this.name;
    }

    public String[] getCourses() { return courses.clone(); }
    public String getCourseNames() {
        String courseNames = "";
        for(String s: courses)
            courseNames += s + " ";
    return courseNames;
    }

    public void setCourses(String[] courses) {
        this.courses = courses.clone();
    }

    @Override
    public String toString() { //want courses too?
        return "Faculty {" +
                "courses=" + Arrays.toString(courses) +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

