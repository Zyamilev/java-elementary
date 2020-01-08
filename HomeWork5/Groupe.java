package HomeWork5;

class Groupe {
    Student[] group = new Student[3];
    int masLen = group.length;

    public void addStudent(Student student) {

        for (int i = 0; i < group.length; i++) {


            if (group[i] == null) {
                group[i] = student;

                break;
            }
            if (group[i] != null) {

                continue;
            }
        }
    }

    void printInfo() {
        for (int i = 0; i < masLen; i++) {

            System.out.println(group[i].getName() + " " + group[i].getLustName());

        }
    }

    public void find(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (student.equals(group[i])) {
                System.out.println("Find");
                break;
            } else if (i == group.length - 1) {
                System.out.println("Not find");
            }

        }


    }

    public void delStudent(Student student) {
        int i;
        for (i = 0; i < group.length; i++) {
            if (group[i].equals(student))
                // System.out.println("Found and delete");
                break;
        }

        for (int j = i; j < group.length - 1; j++)
            group[j] = group[j + 1];


        masLen--;


    }


}



