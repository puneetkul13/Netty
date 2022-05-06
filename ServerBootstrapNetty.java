package Netty;
import io.netty.channel.MultithreadEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.nio.*;
import io.netty.bootstrap.*;
import io.netty.util.AttributeKey;
import io.netty.handler.codec.base64.Base64Decoder;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ServerChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.*;
import io.netty.buffer.ByteBufInputStream;
public class ServerBootstrapNetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NioEventLoopGroup loop_group = new NioEventLoopGroup();
		ServerBootstrap server_boots_trap = new ServerBootstrap();
//		ServerBootstrap group = server_boots_trap.group(loop_group);
//		System.out.println(group);
		ServerBootstrap group1 = server_boots_trap.group(loop_group,loop_group);
		System.out.println(group1);
//		MultithreadEventLoopGroup loop_group = new MultithreadEventLoopGroup();
//		ChannelOption channel_option = new ChannelOption(0, "ABCD");
		String name = "abcd";
		ChannelOption<Object> channel_option = ChannelOption.valueOf(name);
		ServerBootstrap group2 = server_boots_trap.childOption(channel_option, null);
		System.out.println(group2);
		System.out.println(channel_option);
		AttributeKey<Object> ak = AttributeKey.valueOf("abcd");
		System.out.println(ak);
		ServerBootstrap group3 = server_boots_trap.childAttr(ak, 1);
		System.out.println(group3);
		ChannelHandler ch1 = new Base64Decoder();
		server_boots_trap.childHandler(ch1);
		System.out.println(server_boots_trap);
//		ServerBootstrap group4 = server_boots_trap.channel(null);
//		ServerBootstrap group5 = server_boots_trap.channelFactory(null);
//		System.out.println(group4);
//		System.out.println(group5);
		server_boots_trap = server_boots_trap.validate();
		System.out.println(server_boots_trap);
		ServerBootstrap new_server_boots_trap = server_boots_trap.clone();
		System.out.println(server_boots_trap.toString()+"***"+new_server_boots_trap.toString());
		
		
		
		
		
		
		
		

	}

}
