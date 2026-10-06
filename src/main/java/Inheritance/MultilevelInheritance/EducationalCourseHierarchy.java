package Inheritance.MultilevelInheritance;
class Course{
    String courseName;
    int duration;

Course(String courseName,int duration){
    this.courseName=courseName;
    this.duration=duration;
}
void display(){
    System.out.println("CourseName "+courseName);
    System.out.println("Duration "+duration);
}
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Platform "+platform);
        System.out.println("Recorded"+isRecorded);

    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount){
         super(courseName,duration,platform,isRecorded);
         this.fee=fee;
         this.discount=discount;
    }
    @Override
    void display(){
        super.display();
        double amount=(fee*discount)/100;
        double finalFee=fee-amount;
        System.out.println("Fees "+fee);
        System.out.println("Discount "+discount);
        System.out.println("Final fees"+finalFee);

    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args){
        PaidOnlineCourse p1=new PaidOnlineCourse("Java Programming",
                6,
                "Udemy",
                true,
                10000,
                20);
        p1.display();
    }
}
