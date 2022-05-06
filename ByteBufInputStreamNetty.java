package Netty;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBuf;
import static io.netty.buffer.Unpooled.*;
import java.nio.*;
import java.util.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ByteBufInputStreamNetty {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
//		ByteBuf byte_buf = new ByteBuf();
//		ByteBuf directBuffer =buffer(2);
		
		char y = 'a';
		ByteBuf directBuffer  = copiedBuffer(ByteBuffer.allocate(32));
		int capacity = directBuffer.capacity();
		System.out.println(capacity);
		System.out.println(directBuffer.maxCapacity());
		directBuffer = directBuffer.capacity(16);
		System.out.println(directBuffer.capacity());
		ByteBufAllocator alloc = directBuffer.alloc();
		System.out.println(alloc);
		java.nio.ByteOrder order = directBuffer.order();
		System.out.println(order);
		ByteBuf wrap = directBuffer.unwrap();
		System.out.println(wrap);
		boolean isDirect = directBuffer.isDirect();
		System.out.println(isDirect);
		System.out.println(directBuffer.readerIndex()+"=====");
		directBuffer = directBuffer.readerIndex(4);
		System.out.println(directBuffer);
		System.out.println(directBuffer.writerIndex());
		directBuffer = directBuffer.writerIndex(10);
		System.out.println(directBuffer);
		directBuffer = directBuffer.setIndex(5, 10);
		System.out.println(directBuffer);
		System.out.println(directBuffer.readableBytes()+"rb");
		System.out.println(directBuffer.writableBytes()+"wb");
		System.out.println(directBuffer.maxWritableBytes()+"mwb");
		System.out.println(directBuffer.isReadable()+"ir?");
		System.out.println(directBuffer.isReadable(2)+"ir??");
		System.out.println(directBuffer.isWritable()+"iw??");
		System.out.println(directBuffer.isWritable(4)+"iw??");
		System.out.println(directBuffer.isWritable(40)+"iw???");
		directBuffer  = directBuffer.markReaderIndex();
		System.out.println(directBuffer);
		directBuffer  = directBuffer.resetReaderIndex();
		System.out.println(directBuffer);
		directBuffer = directBuffer.markWriterIndex();
		System.out.println(directBuffer);
		directBuffer = directBuffer.resetWriterIndex();
		System.out.println(directBuffer);
		directBuffer = directBuffer.discardReadBytes();
		System.out.println(directBuffer);
//		directBuffer = directBuffer.discardSomeReadBytes();
//		System.out.println(directBuffer);
		directBuffer  = directBuffer.ensureWritable(8);
		System.out.println(directBuffer);
		int ensure_writable  = directBuffer.ensureWritable(90, true);
		System.out.println(ensure_writable);
		System.out.println(directBuffer);
		directBuffer = directBuffer.clear();
		System.out.println(directBuffer);
		short s1 = 21;
		byte y4 = (byte) s1;
		System.out.println(y4);
		Byte y6 = new Byte((byte) 7);
		directBuffer.setBytes(0, new byte[] {8,7, 9,0,5,6,4,1,'a','b',1,2,3,4});
		ByteBuf dst = copiedBuffer(ByteBuffer.allocate(32));
		dst.writerIndex(0);
//		dst = directBuffer.getBytes( 0,dst);
		dst  = directBuffer.getBytes(0, dst,1,5);
		for(int i=0;i<dst.capacity();i++) {
			byte b = dst.getByte(i);
			
			System.out.println((char) b+"++");
		}
		boolean gb = directBuffer.getBoolean(4);
		System.out.println(gb);
		byte y1 = directBuffer.getByte(5);
		System.out.println(y1);
		short y2 = directBuffer.getUnsignedByte(6);
		System.out.println(y2);
		short y3 = directBuffer.getShort(7);
		System.out.println(y3);
		short y5 = directBuffer.getShort(3);
		System.out.println(y5);
		
		short s2 = y6.shortValue();
		System.out.println(s2);
		ByteBuf bb =copiedBuffer(ByteBuffer.allocate(4));
//		bb.setShort(0, new short[] {3,5,6,7});
	
		while(directBuffer.isReadable()) {
			System.out.println(directBuffer.readByte());
		}
		
		
		
		for(int i=0;i<directBuffer.capacity();i++) {
			byte b = directBuffer.getByte(i);
			
			System.out.println((char) b+"--");
		}
		
		 
//		ByteBufInputStream bbis0 = new ByteBufInputStream(directBuffer);
////		ByteBufInputStream bbis1 = new ByteBufInputStream(directBuffer,4); 
//		int read_bytes = bbis0.readBytes();
//		System.out.println(read_bytes);
//		try {
//			int available_bytes = bbis0.available();
//			System.out.println(available_bytes);
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//		bbis0.mark(6);
//		boolean mark_supported = bbis0.markSupported();
//		System.out.println(mark_supported);
//		try {
//			int read = bbis0.read();
//			System.out.println(read);
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//		byte[] b = new byte[] {1,0,0,1,0,1};
//		try {
//			int read1 = bbis0.read(b, read_bytes, 4);
//			System.out.println(read1);
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//		long skip = bbis0.skip(2);
//		System.out.println(skip);
////		boolean rb = bbis0.readBoolean();
////		System.out.println(rb);
////		byte byt = bbis0.readByte();
////		System.out.println(byt);
//		System.out.println(directBuffer);
////		bbis0.reset();
//		boolean x1 = bbis0.readBoolean();
//		System.out.println(x1);
//		byte x2 = bbis0.readByte();
//		
//		System.out.println(x2);
//		char x3 = bbis0.readChar();
//		System.out.println(x3);
//		double x4 = bbis0.readDouble();
//		float x5 = bbis0.readFloat();
//		System.out.println(x4);
//		System.out.println(x5);
//		byte[] rf= new byte[4];
//		bbis0.readFully(rf, 2, 2);
//		for(byte f:rf) {
//			System.out.println(f);
//		}
//		int x6 = bbis0.readInt();
//		System.out.println(x6);
//		String x7 = bbis0.readLine();
////		long x8 = bbis0.readLong();
//		System.out.println(x7+"+++++++");
////		short x8 = bbis0.readShort();
////		String x9 = bbis0.readUTF();
////		System.out.println(x8);
////		System.out.println(x9+"*******");
////		int x10 = bbis0.readUnsignedByte();
////		System.out.println(x10);
////		int x11 = bbis0.readUnsignedShort();
////		System.out.println(x11);
////		int x12 = bbis0.skipBytes(89);
////		System.out.println(x12);
		
	}

}
