package Netty;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.*;
import java.nio.charset.*;
import static java.nio.charset.Charset.*;
import static io.netty.buffer.Unpooled.*;
import io.netty.*;
import io.netty.buffer.ByteBuf;

import java.nio.*;
import java.util.*;
import static java.io.OutputStream.*;
import static java.nio.ByteBuffer.*;
import static java.nio.charset.Charset.defaultCharset;
public class ByteBufPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteBuf copied_buffer = copiedBuffer(ByteBuffer.allocate(64));
		copied_buffer.writerIndex(0);
		copied_buffer.setBytes(0, new byte[] {'a','b','c','d','e','f','g','h'});
//		for(int i=0;i<copied_buffer.capacity();i++) {
//			byte b = copied_buffer.getByte(i);
//			System.out.println((char) b + "--");
//		}
//		ByteBuf dst = copiedBuffer(ByteBuffer.allocate(32));
//		dst.writerIndex(0);
//		copied_buffer.getBytes(1, dst, 2,4);
//		
//		for(int i=0;i<dst.capacity();i++) {
//			byte b = dst.getByte(i);
//			System.out.println((char) b + "++");
//		}
//		byte[] dst = new byte[32];
//		copied_buffer.getBytes(0, dst);
//		copied_buffer.getBytes(2, dst,2,5);
//		for(int i=0;i<dst.length;i++) {
//			byte b = dst[i];
//			System.out.println((char) b);
//		}
//        System.out.println(copied_buffer);
//		ByteBuffer dst = ByteBuffer.allocate(32);
//		ByteBuf result = copied_buffer.getBytes(0, dst);
//		for(int i=0;i<result.capacity();i++) {
//			byte b = result.getByte(i);
//			System.out.println((char) b);
//		}
//		OutputStream dst = nullOutputStream();
//		
//		copied_buffer.getBytes(0,dst,4);
//		ObjectOutputStream oos = new ObjectOutputStream(dst);
//		String b = oos.toString();
//		dst.flush();
//		System.out.println(b);
//		Charset c = forName("UTF-8");
//		copied_buffer.setBoolean(8, true);
//		copied_buffer.setShort(9, 13);
//		copied_buffer.setByte(11, 25);
//		byte b = copied_buffer.getByte(11);
//		System.out.println(b+"****");
//		copied_buffer.setMedium(11,(int) Math.pow(2, 26)+1);
//		copied_buffer.setInt(11,(int) Math.pow(31, 2));
//		copied_buffer.setLong(11, (long) Math.pow(99, 11));
//		copied_buffer.setChar(11,'z');
//		copied_buffer.setFloat(11, (float) 32.423);
//		copied_buffer.setDouble(11,34.99);
//		ByteBuf src = copiedBuffer(ByteBuffer.allocate(32));
//		src.setBytes(0,new byte[] {'q','w','e','r','t','y','z'});
//		copied_buffer.setBytes(9, src);
//		copied_buffer.setBytes(9, src,4);
//		byte[] src = new byte[] {'q','w','e','r','t','y','z'};
//		copied_buffer.setBytes(9, src,2,4);
//		copied_buffer.setBytes(9, src,5,2);
//		ByteBuffer src = allocate(32);
//		byte[] y1 = new byte[] {'q','w','e','r','t','y'};
//		src.put(y1);
//		InputStream is = new DataInputStream(new FileInputStream("invoice1.txt"));
//		copied_buffer.setBytes(9, is, 30);
//		for(int i=0;i<src.capacity();i++) {
//			byte b2 = src.get(i);
//			System.out.println((char) b2+"===="+i);
//		}
//		copied_buffer.setBytes(9, src);
//		copied_buffer.setZero(9, 30);
//		for(int i=0;i<copied_buffer.capacity();i++) {
//			byte b1 = copied_buffer.getByte(i);
//			System.out.println((char) b1+"---"+i);
//		}
//		byte x = copied_buffer.getByte(11);
//		
//		System.out.println((float) x);
//		copied_buffer.setBoolean(10, false);
//		copied_buffer.setInt(10, (int) Math.pow(9,17));
//		copied_buffer.setChar(11, 'f');
//		copied_buffer.setFloat(11, 32.24f);
//		copied_buffer.setDouble(11, 234.557);
		ByteBuf r = copied_buffer.setIndex(0,8);
//		int s =  copied_buffer.readUnsignedShort();
//		System.out.println(s);
//		int m = copied_buffer.readMedium();
//		System.out.println(m);
//		ByteBuf r1 = copied_buffer.setIndex(10,20);
//		int um = copied_buffer.readUnsignedMedium();
//		System.out.println(um);
//		int x = copied_buffer.readInt();
//		char x = copied_buffer.readChar();
//		float x = copied_buffer.readFloat();
//		double x = copied_buffer.readDouble();
//		ByteBuf x = copied_buffer.readBytes(10);
//		ByteBuf x = copied_buffer.readSlice(4);
//		ByteBuf x = copiedBuffer(ByteBuffer.allocate(16));
//		x.setIndex(0, 0);
		
//		byte[] x = new byte[16];
//		copied_buffer.readBytes(x,2,4);
//		ByteBuffer x = allocate(16);
//		OutputStream x = new DataOutputStream(new FileOutputStream("invoice1.txt"));
//		copied_buffer.readBytes(x,7);
//		System.out.println(copied_buffer);
//		copied_buffer.skipBytes(10);
//		System.out.println(copied_buffer);
//		for(int i=0;i<x.capacity();i++) {
//			byte b3 = x.get(i);
//			System.out.println((char) b3+"++++"+i);
//		}
//		System.out.println(x);
//		copied_buffer.setByte(10,7);
//		System.out.println(copied_buffer.readUnsignedByte());
//		System.out.println(copied_buffer);
//		short b1 = copied_buffer.readShort();
//		short b2 = copied_buffer.getShort(11);
//		copied_buffer.writeBoolean(true);
//		boolean b = copied_buffer.getBoolean(0);
//		System.out.println(b);
//		copied_buffer.writeByte(89);
//		byte b = copied_buffer.getByte(0);
//		System.out.println(b);
//		copied_buffer.writeShort(4500);
//		copied_buffer.writeMedium(45000);
//		copied_buffer.writeInt((int) Math.pow(2, 26));
//		copied_buffer.writeLong((long) Math.pow(2, 63));
//		long s = copied_buffer.getLong(0);
//		copied_buffer.writeChar(89);
//		char s = copied_buffer.getChar(0);
//		copied_buffer.writeFloat(45.3455f);
//		float s = copied_buffer.getFloat(0);
//		ByteBuf src = copiedBuffer(ByteBuffer.allocate(16));
//		src.setBytes(0, new byte[] {'q','w','e','r','t','y'});
//		src.setIndex(2, 10);
//		byte[] src = new byte[] {'z','x','c','v','b','n'};
//		ByteBuffer src = allocate(16);
//		src.put((byte) 9).put((byte) 8).rewind();
//		InputStream src = new DataInputStream(new FileInputStream("invoice1.txt"));
//		copied_buffer.writeBytes(src,20);
//		copied_buffer.writeZero(4);
//		copied_buffer.writeBytes(src,3,2);
//		copied_buffer.writeDouble(7912.261);
//		double s = copied_buffer.getDouble(0);
//		System.out.println(s);
//		int s = copied_buffer.indexOf(2, 7, (byte) 'f');
//		int s = copied_buffer.bytesBefore(1,4,(byte) 'e');
//		ByteBuf s = copied_buffer.copy();
//		ByteBuf s = copied_buffer.copy(3,4);
//		System.out.println(copied_buffer);
//		ByteBuf s = copied_buffer.slice(3,4);
		
//		copied_buffer.setIndex(0, 6);
//		ByteBuf s = copied_buffer.duplicate();
//		s.setIndex(0, 2);
//		System.out.println(copied_buffer);
//		s.setByte(3, 'z');
//		ByteBuffer s = copied_buffer.nioBuffer();
//		ByteBuffer s = copied_buffer.nioBuffer(1, 4);
//		copied_buffer.setByte(1, 'v');
//		ByteBuffer s = copied_buffer.internalNioBuffer(1, 4);
//		long memory = copied_buffer.memoryAddress();
//		System.out.println(memory);
		ByteBuf s7 = copied_buffer.touch();
		System.out.println(s7);
		ByteBuf s8 = copied_buffer.touch("ss");
		System.out.println(s8+"----");
		copied_buffer.retain(4);
		
		System.out.println(copied_buffer.toString());
		copied_buffer.retain();
		System.out.println(copied_buffer.toString());
		ByteBuf s6 = copiedBuffer(ByteBuffer.allocate(64));
		s6.setBytes(0, new byte[] {'a','b','c','d','e','f','g'});
		s6.setIndex(0, 8);
		System.out.println(copied_buffer.compareTo(s6));
		System.out.println(copied_buffer.equals(s6));
		System.out.println(copied_buffer.hashCode());
		System.out.println(copied_buffer.copy().hashCode());
		String s4 = copied_buffer.toString(defaultCharset());
		System.out.println(s4);
		String s5 = copied_buffer.toString(2,4, defaultCharset());
		System.out.println(s5);
		
		boolean has_memory = copied_buffer.hasMemoryAddress();
		System.out.println(has_memory);
		boolean has_array = copied_buffer.hasArray();
		System.out.println(has_array);
		if(has_array) {
			System.out.println(copied_buffer.arrayOffset()+"****");
			byte[] a = copied_buffer.array();
			for(int i=0;i<a.length;i++) {
				System.out.println((char)a[i]+"...."+i);
			}
		}
		ByteBuffer[] s = copied_buffer.nioBuffers(2,5);
//		System.out.println(s.length);
		ByteBuffer s1 = s[0];
		
//		ByteBuffer s1 = s[0];
		s1.put(4,(byte) 'y');
		for(int i=0;i<s1.capacity();i++) {
			byte b3 = s1.get(i);
			System.out.println((char) b3 + "----");
		}
		System.out.println(s);
//		System.out.println(s);
		for(int i=0;i<copied_buffer.capacity();i++) {
			byte b3 = copied_buffer.getByte(i);
			System.out.println((char)b3+"----"+i);
		}
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(copied_buffer);
		
		System.out.println(Math.pow(2, 63));
		System.out.println(copied_buffer.nioBufferCount());
//		System.out.println();
		
		
		
		
		
		
		
        
	}

}
