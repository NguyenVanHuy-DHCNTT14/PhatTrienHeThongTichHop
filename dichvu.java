package quanlive;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface dichvu extends Remote {
	public String information(int sohieu,String ngaygiobay , 
			String noidi, String noiden , String thoigianbay, int tongsoghe, int ghedaban, int ghecontrong) throws RemoteException ;
	public double muave(int sove,double giave) throws RemoteException;
}