package src;

public class CollageStudent extends Student{
    public int roll_no;

    public CollageStudent(String address,int roll_no) {
        super(address);
        this.roll_no =roll_no;
    }

//    public void CollegeStudent(String address, int roll_no) {
//
//        this.roll_no = roll_no;
//    }
    public void show_roll()
    {
        System.out.println("Roll No is "+roll_no);
}

}
