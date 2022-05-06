package Netty;
import io.netty.buffer.*;
import static io.netty.buffer.Unpooled.*;
import io.netty.buffer.ByteBufOutputStream;
import static java.nio.ByteBuffer.*;
import java.nio.*;
import java.io.*;
public class UnpooledPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuf heap_buffer = buffer();
		ByteBuf heap_bufferInt = buffer(128);
		ByteBuf heap_bufferIntMax = buffer(128,512);
		ByteBuf direct_buffer = directBuffer();
		ByteBuf direct_bufferInt = directBuffer(128);
		ByteBuf direct_bufferIntMax = directBuffer(128,512);
		byte[] array = new byte[] {'a','b','c','d','e','f','g'};
		direct_bufferInt.setBytes(0, new byte[] {'a','b','c','d'});
		ByteBuf wrapped_buffer = wrappedBuffer(array);
//		for(int i=0; i<wrapped_buffer.capacity();i++) {
//			byte b = wrapped_buffer.getByte(i);
//			char c = (char) b;
//			System.out.println(b);
//		}
		for(int i=0;i<direct_bufferInt.capacity();i++) {
			byte b = direct_bufferInt.getByte(i);
			if(b!=0) {
				System.out.println((char) b);
			}
		}
		ByteBuf wrapped_bufferOL = wrappedBuffer(array, 2,4);
		for(int i=0;i<wrapped_bufferOL.capacity();i++) {
			byte b = wrapped_bufferOL.getByte(i);
			System.out.println((char) b+"--");
		}
		ByteBuffer src = allocate(16);
		src.put(array);
		
		ByteBuf wrapped_bufferBuffer = wrappedBuffer(src);
		for(int i=0;i<wrapped_bufferBuffer.capacity();i++) {
			byte b = wrapped_bufferBuffer.getByte(i);
			System.out.println((char) b);
		}
//		ByteBuf wrapped_bufferM = wrappedBuffer((long)100000, 20, true);
		ByteBuf src1 = copiedBuffer(ByteBuffer.allocate(16));
		src1.setBytes(0, new byte[] {'a','b','c','d','e','f','g'});
		src1.setIndex(0, 4);
		ByteBuf wrapped_bufferBuf = wrappedBuffer(src1);
		for(int i=0;i<wrapped_bufferBuf.capacity();i++) {
			byte b = wrapped_bufferBuf.getByte(i);
			System.out.println((char) b +"......");
		}
		ByteBuf x = wrappedBuffer(2,new byte[] {});
		ByteBuf wrapped_bufferMA = wrappedBuffer(2,new byte[]{'a','b','c','d','e'}, new byte[] {'f','g','h','i'}, new byte[] {'j','k','l','m'});
		for(int i=0;i<wrapped_bufferMA.capacity();i++) {
			byte b = wrapped_bufferMA.getByte(i);
			System.out.println((char) b + "#######");
		}
		ByteBuf x1 = copiedBuffer(ByteBuffer.allocate(16));
		ByteBuf x2 = copiedBuffer(ByteBuffer.allocate(32));
		x1.setBytes(0, new byte[] {'a','b','c','d','e','f','g'});
		x2.setBytes(0, new byte[] {'h','i','j','k'});
		x1.setIndex(0, 4);
		x2.setIndex(0, 2);
		ByteBuf wrapped_bufferBufs = wrappedBuffer(2, x1,x2);
		for(int i=0;i<wrapped_bufferBufs.capacity();i++) {
			System.out.println((char)wrapped_bufferBufs.getByte(i)+".....");
		}
		CompositeByteBuf composite = compositeBuffer(4);
		byte[] array1 = new byte[] {1,2,3,4,5,6,7};
		ByteBuf copied_buffer = copiedBuffer(array1);
		for(int i=0;i<copied_buffer.capacity();i++) {
			byte b = copied_buffer.getByte(i);
			System.out.println(b+"::");
		}
		ByteBuf copied_buffer1 = copiedBuffer(array1,2,3);
		for(int i=0;i<copied_buffer1.capacity();i++) {
			byte b = copied_buffer1.getByte(i);
			System.out.println(b+"**");
		}
		ByteBuf copied_buffer2 = copiedBuffer(wrapped_buffer);
		for(int i=0;i<copied_buffer2.capacity();i++) {
			byte b = copied_buffer2.getByte(i);
			System.out.println((char)b+"&&&");
		}
		ByteBuf copied_buffer3 = copiedBuffer(new byte[] {1,2,3,4,5}, new byte[] {6,7,8,9});
		System.out.println(copied_buffer3);
		for(int i=0;i<copied_buffer3.capacity();i++) {
			byte b = copied_buffer3.getByte(i);
			System.out.println(b);
		}
		System.out.println(x1);
		System.out.println(x2);
		ByteBuf copied_buffer4 = copiedBuffer(x1,x2);
		System.out.println(copied_buffer4);
		for(int i=0;i<copied_buffer4.capacity();i++) {
			byte b = copied_buffer4.getByte(i);
			System.out.println((char) b);
		}
		ByteBuf unmodifBuffer = unmodifiableBuffer(copied_buffer4);
		for(int i=0;i<unmodifBuffer.capacity();i++) {
			System.out.println((char) unmodifBuffer.getByte(i)+ "----");
		}
		System.out.println(unmodifBuffer);
//		unmodifBuffer.setByte(1, 'k');
		ByteBuf x4 = copyInt((int)Math.pow(2, 24));
		int x5 = x4.getInt(0);
		System.out.println(x5);
//		for(int i=0;i<x4.capacity();i++) {
//			int b = x4.getInt(i);
//			System.out.println(b+";;;;");
//		}
		System.out.println(Math.pow(2, 24));
		System.out.println(x4);
		ByteBuf x6 = copyShort((int) Math.pow(2, 13));
		int x7 = x6.getShort(0);
		System.out.println(x7);
		System.out.println(Math.pow(2, 13));
		ByteBuf x8 = copyShort((int)Math.pow(2, 12), (int) Math.pow(2, 8) );
		short x9 = x8.readShort();
		short x10 = x8.readShort();
		System.out.println(x9+"---"+ Math.pow(2, 12));
		System.out.println(x10+"---"+Math.pow(2, 8));
		ByteBuf x11 = copyMedium((int) Math.pow(2, 23));
		System.out.println(x11.readMedium());
		System.out.println(Math.pow(2, 23));
		ByteBuf x12 = copyLong((long) Math.pow(2, 50));
		long x13 = x12.readLong();
		System.out.println(x13);
		System.out.println(Math.pow(2, 50));
		System.out.println(x12.capacity());
		ByteBuf x14 = copyLong((long) Math.pow(2,48), (long) Math.pow(2, 51));
		long x15 = x14.readLong();
		long x16 = x14.readLong();
		System.out.println(x15+"--"+Math.pow(2, 48));
		System.out.println(x16+"--"+Math.pow(2, 51));
		ByteBuf x17 = copyBoolean(true,false);
		System.out.println(x17.readBoolean());
		System.out.println(x17.readBoolean());
		ByteBuf x18 = copyFloat(32.34f);
		System.out.println(x18.readFloat());
		ByteBuf x19 = copyFloat(32.314f, 41.134f);
		System.out.println(x19.readFloat());
		System.out.println(x19.readFloat());
		ByteBuf x20 = copyDouble(54.22);
		System.out.println(x20.readDouble());
		ByteBuf x21 = copyDouble(61.77, 62.35);
		System.out.println(x21.readDouble());
		System.out.println(x21.readDouble());
		ByteBuf x22 = unmodifiableBuffer(direct_bufferInt,x21);
//		ByteBuf x23 = wrappedUnmodifiableBuffer(direct_bufferInt, x21);

	}

}
