package HomeWork5;

public class Student {
    private String name;
    private String lustName;
    private int[] marks = new int[10];

    public int[] getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLustName() {
        return lustName;
    }

    public void setLustName(String lustName) {
        this.lustName = lustName;
    }

    Student(String name, String lustName) {
        this.name = name;
        this.lustName = lustName;
    }


}
