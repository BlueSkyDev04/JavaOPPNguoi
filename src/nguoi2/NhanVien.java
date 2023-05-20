package nguoi2;
import java.util.Scanner;
public class NhanVien extends Nguoi{
    private int heSoLuong;
    private int tienPhuCap;

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap(int tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }
    
    public NhanVien() {
    }
    public NhanVien(int heSoLuong, int tienPhuCap, String maDinhDanh, String hoVaTen, int namSinh, int luongCoBan) {
        super(maDinhDanh, hoVaTen, namSinh, luongCoBan);
        this.heSoLuong = heSoLuong;
        this.tienPhuCap = tienPhuCap;
    }
    public float tinhLuongThucLanh(){
        return heSoLuong*1550+tienPhuCap;
}
    @Override
    public void nhapDL(){
        Scanner sc=new Scanner(System.in);
        super.nhapDL();
        System.out.println("Nhập hệ số lương: ");
        heSoLuong=sc.nextInt();
        System.out.println("nhập tiền phụ cấp: ");
        tienPhuCap=sc.nextInt();
    }
    @Override
     public void xuatTT(){
         super.xuatTT();
        System.out.println("Hệ số lương: "+heSoLuong);
        System.out.println("tiền phụ cấp: "+tienPhuCap);
        System.out.println("Lương thực lãnh: "+tinhLuongThucLanh());
     }
}

