package Netty;
import java.net.*;
//import java.util.concurrent.Future;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.embedded.EmbeddedChannel;
//import io.netty.util.concurrent.Future;
public class BootstrapNetty {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Bootstrap boots_trap = new Bootstrap();
		InetAddress ip =  InetAddress.getByName("localhost");
		String ip_string = ip.toString();
		Bootstrap r = boots_trap.remoteAddress(ip, 1234);	
		System.out.println(r);
//		SocketAddress socket_address = (SocketAddress) new Object();
		SocketAddress sa = new InetSocketAddress(ip,1234);
		Bootstrap r1 = boots_trap.remoteAddress(sa);
		System.out.println(r1);
		Bootstrap r2 = boots_trap.remoteAddress(ip_string,1234);
		System.out.println(r2);
//		EmbeddedChannel ch = new EmbeddedChannel();
//		ChannelFuture f = boots_trap.connect();
////		
//		System.out.println(f);
////		
//		ChannelFuture f1 = boots_trap.connect(ip_string, 1234);
//		ChannelFuture f2 = boots_trap.connect(ip,1234);
//		
//		ChannelFuture f3 = boots_trap.connect(sa);
//		InetSocketAddress local = new InetSocketAddress(ip,1234);
//		ChannelFuture f4 = boots_trap.connect(sa,local);
		Bootstrap r3 = boots_trap.validate();
		System.out.println(r3);
		

	}

}
