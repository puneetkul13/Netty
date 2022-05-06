package Netty;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.buffer.AbstractByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;

public class AllocatorNetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnpooledByteBufAllocator alloc = new UnpooledByteBufAllocator(true);
		ByteBuf b1 = alloc.heapBuffer(16, 64);
		System.out.println(b1);
		ByteBuf b2 = alloc.directBuffer(32, 64);
		System.out.println(b2);
		CompositeByteBuf b3 = alloc.compositeHeapBuffer(4);
		System.out.println(b3);
		CompositeByteBuf b4 = alloc.compositeDirectBuffer(4);
		System.out.println(b4);
		boolean isPooled = alloc.isDirectBufferPooled();
		System.out.println(isPooled);
		ByteBuf b5 = alloc.buffer(32);
		System.out.println(b5);
		ByteBuf b6 = alloc.buffer(32,64);
		System.out.println(b6);
		ByteBuf b7 = alloc.ioBuffer();
		System.out.println(b7);
		ByteBuf b8 = alloc.ioBuffer(32);
		System.out.println(b8);
		ByteBuf b9 = alloc.ioBuffer(32,128);
		System.out.println(b9);
		ByteBuf b10 = alloc.heapBuffer();
		System.out.println(b10);
		ByteBuf b11 = alloc.heapBuffer(20);
		System.out.println(b11);
		ByteBuf b12 = alloc.heapBuffer(20,40);
		System.out.println(b12);
		ByteBuf b13 = alloc.directBuffer();
		System.out.println(b13);
		ByteBuf b14 = alloc.directBuffer(64,128);
		System.out.println(b14);
		CompositeByteBuf b15 = alloc.compositeBuffer(2);
		System.out.println(b15);
		CompositeByteBuf b16 = alloc.compositeHeapBuffer();
		CompositeByteBuf b17 = alloc.compositeHeapBuffer(8);
		CompositeByteBuf b18 = alloc.compositeDirectBuffer();
		CompositeByteBuf b19 = alloc.compositeDirectBuffer(10);
		System.out.println(b16);
		System.out.println(b17);
		System.out.println(b18);
		System.out.println(b19);
		System.out.println(alloc.toString());
		System.out.println(alloc.calculateNewCapacity(20, 26));
		PooledByteBufAllocator alloc1 = new PooledByteBufAllocator();
		ByteBuf heapBuffer = alloc1.heapBuffer(32,64);
		System.out.println(heapBuffer);
		ByteBuf directBuffer = alloc1.directBuffer(64,128);
		System.out.println(directBuffer);
		boolean x1 = alloc1.isDirectBufferPooled();
		System.out.println(x1);
		
		
		
		
		
		

	}

}
