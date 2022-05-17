package StudentTest;

public class Student {
    private String stuName;
    private String stuCode;
    private String stuGender;
    private int stuAge;
    private String stuMajor;
    private int stuYear;

    public Student() {
    }

    public Student(String stuName, String stuCode, String stuGender, int stuAge, String stuMajor, int stuYear) {
        this.stuName = stuName;
        this.stuCode = stuCode;
        this.stuGender = stuGender;
        this.stuAge = stuAge;
        this.stuMajor = stuMajor;
        this.stuYear = stuYear;
        System.out.println(toString());
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public int getStuYear() {
        return stuYear;
    }

    public void setStuYear(int stuYear) {
        this.stuYear = stuYear;
    }

    @Override
    public String toString() {
        return String.format("学生信息如下：\n姓名：%s\n学号：%s\n性别：%s\n年龄：%s\n所报专业名称：%s\n学制年限：%s ", this.getStuName(), this.getStuCode(),
        this.getStuGender(), this.getStuAge(), this.getStuMajor(), this.getStuYear());
    }
}
