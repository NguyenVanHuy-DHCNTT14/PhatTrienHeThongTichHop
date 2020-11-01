package quanlive;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Impl extends UnicastRemoteObject implements dichvu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Impl() throws RemoteException {
		super();
	}

	@Override
	public String information(int sohieu, String ngaygiobay, String noidi, String noiden, String thoigianbay, int tongsoghe,
			int ghedaban, int ghecontrong) throws RemoteException{
		return " Số hiệu :"+sohieu+"\n Ngày và giờ :"+ngaygiobay+"\n Nơi đi :"+noidi+"\n Nơi Đến :"+noiden+"\n Thời Gian Bay :"
				+thoigianbay+"\n Tổng số ghế :"+tongsoghe+"\n Số ghế đã bán :"+ghedaban+"\n Số ghế còn trống :"+ghecontrong+"\n";
	}

	@Override
	public double muave(int sove, double giave) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double trave(int sove, double giave) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}