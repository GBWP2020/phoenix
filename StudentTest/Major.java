package StudentTest;

public class Major {
    private String MajorName;
    private String MajorCode;
    private int MajorYear;

    public Major() {

    }

    public Major(String name, String code, int year) {
        this.setMajorName(name);
        this.setMajorCode(code);
        this.setMajorYear(year);
        System.out.println(this.toString());
    }

    public String getMajorName() {
        return this.MajorName;
    }

    public String getMajorCode() {
        return this.MajorCode;
    }

    public int getMajorYear() {
        return this.MajorYear;
    }

    public void setMajorName(String MajorName) {
        this.MajorName = MajorName;
    }

    public void setMajorCode(String MajorCode) {
        this.MajorCode = MajorCode;
    }

    public void setMajorYear(int MajorYear) {
        this.MajorYear = MajorYear;
    }

    @Override
    public String toString() {
        String str = String.format("专业信息如下： \n专业名称：%s \n专业编号：%s \n学制年限：%s年 \n======================",
                this.getMajorName(), this.getMajorCode(), this.getMajorYear());
        return str;
    }

}
