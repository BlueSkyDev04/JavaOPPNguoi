package nguoi2;

import java.util.Scanner;

public class ThiHanh {
        NhanVien[] arr;
        int n;
    public void NhapDSNV(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nhân viên (n): ");
        n=sc.nextInt();
        arr=new NhanVien[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new NhanVien();
            System.out.println("Nhân viên thứ "+(i+1));
            arr[i].nhapDL();
        }
    }
    public void xuatDSNV(){
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ "+(i+1));
            arr[i].xuatTT();
        }
    }
    public void xepDSNV(){
        NhanVien x= new NhanVien();
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i].tinhLuongThucLanh()>arr[i].tinhLuongThucLanh()){
                    x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
    }
        public static void main(String[] args) {
            ThiHanh obj=new ThiHanh();
            obj.NhapDSNV();
            obj.xepDSNV();
            System.out.println("Danh sách nhân viên đã xếp");
            obj.xuatDSNV();
            
}
}