public class Main1{
    public static void main(String[] args){
        gender  s1=new gender("XYZ",15,"420","F");
        s1.showstudentInfo();
    }
}
class person{
    String name;
    int age;
    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void displayDetails(){
        System.out.println("name:- "+name);
        System.out.println("age:- "+age);
    }
}
class student extends person{
    String studentID;
    student(String name, int age,String studentID){
        super(name,age);
        this.studentID=studentID;
    }
    void showstudentInfo(){
        displayDetails();
        System.out.println("studentID:- "+studentID);
    }
}
class gender extends student{
    String gen;
    gender(String name,int age,String studentID,String gen){
        super(name,age,studentID);
        this.gen=gen;
    }
    void showGenderInfo(){
        showstudentInfo();
        System.out.println("gender:- "+gen);
    }
}