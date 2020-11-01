package quanlive;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		//Kết nối với cổng mà server đã tạo
		dichvu Impl=(dichvu)Naming.lookup("rmi://localhost:8080/huynguyen");
		Scanner scan =new Scanner(System.in);
		System.out.println("Vui lòng chọn dịch vụ :\n1.xem thông tin.\n2.mua vé.");
		int x=scan.nextInt();
		switch(x)
		{
		case 1:
		{

			String xemthongtin1=Impl.information(123, " 3h ngày 11-11-2020", "LA", "LB", "1:10 phút", 100, 45, 55);
			System.out.println("\nmã 123\n"+xemthongtin1);

			String xemthongtin2=Impl.information(124, " 3h ngày 11-11-2020", "LA", "LB", "1:10 phút", 100, 24, 76);
			System.out.println("\nmã 124\n"+xemthongtin2);

		}
		case 2:
		{
			double tonggia=0;
			System.out.println("giá thành :\n1.1sao :500000\n2.2sao :1000000\n3.3sao :1500000\n4.4sao :2000000\n5.5sao :2500000\n");
			System.out.println("Nhập vào số vé cần mua : ");	
			int nhapsove=scan.nextInt();
			System.out.println("Mời Bạn chọn giá vé :");
			int nhapgiave=scan.nextInt();
			if(nhapgiave==500000)
			{
				tonggia=Impl.muave(nhapsove, 500000);
			}
			else if(nhapgiave==1000000)
			{
				tonggia=Impl.muave(nhapsove, 1000000);
			}
			else if(nhapgiave==1500000)
			{
				tonggia=Impl.muave(nhapsove, 1500000);
			}
			else if(nhapgiave==2500000)
			{
				tonggia=Impl.muave(nhapsove, 2500000);
			}
			else if(nhapgiave==3000000)
			{
				tonggia=Impl.muave(nhapsove, 3000000);
			}
			else 
			{
				System.out.println("Bạn Nhập Sai");
			}
			System.out.println("Tổng Tiền Mua Vé:"+tonggia+" VNĐ");
		}
		}
	}
}