package nguoi2;

import java.util.Scanner;

public class Nguoi {
    private String maDinhDanh;
    private String hoVaTen;
    private  int namSinh;
    private int luongCoBan;

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public Nguoi() {
        super();
    }
    public Nguoi(String maDinhDanh, String hoVaTen, int namSinh, int luongCoBan) {
        this.maDinhDanh = maDinhDanh;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.luongCoBan = luongCoBan;
    }
    public void nhapDL(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã định danh: ");
        maDinhDanh=sc.nextLine();
        System.out.println("Nhập họ và tên: ");
         hoVaTen=sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh=sc.nextInt();
        System.out.println("Nhập lương cơ bản: ");
         luongCoBan=sc.nextInt();
    }
    public void xuatTT(){
        System.out.println("mã định danh: "+maDinhDanh);
        System.out.println("họ và tên: "+hoVaTen);
        System.out.println("năm sinh: "+namSinh);
        System.out.println("lương cơ bản: "+luongCoBan);
}
}