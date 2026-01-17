/* This class demonstrates static members */
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " - " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name; // updates institute name
    }
}
