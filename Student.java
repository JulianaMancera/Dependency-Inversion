class Student {
    private String studentNum;
    private String name;

    public Student(String studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    // Additional methods to access student information

    public String getStudentNum() { 
        return studentNum;
    }
    public String getName() {
        return name;
    }
}