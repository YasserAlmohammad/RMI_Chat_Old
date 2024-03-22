package server_board;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerBoard extends Remote{
   public Object connect(String clientAddr,String nickName) throws RemoteException;

   public Object disconnect(String nickName) throws RemoteException;

   public Object recieveMsg(String nickName,String msg) throws RemoteException;
}
