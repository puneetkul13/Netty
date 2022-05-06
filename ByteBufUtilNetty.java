package Netty;
import io.netty.buffer.*;
import static io.netty.buffer.Unpooled.*;
import io.netty.buffer.ByteBufUtil.*;
import static io.netty.buffer.ByteBufUtil.*;
import io.netty.buffer.AbstractByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
public class ByteBufUtilNetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuf b = directBuffer(16);
		b.setBytes(0, new byte[] {'a','b','c','d','e','f','g'});
		b.setIndex(0, 7);
		String hd = hexDump(b);
		String hd1 = hexDump(b,2,3);
		System.out.println(hd1+"----");
		System.out.println(hd);
		String hd2 = hexDump(new byte[] {'q','w','e','r','t','y'});
		System.out.println(hd2);
		String hd3 = hexDump(new byte[] {'q','w','e','r','t','y'}, 2,3);
		System.out.println(hd3);
		char x = (char)(Integer.parseInt(hd3.substring(0,2)));
		System.out.println(x);
		int hashCode = ByteBufUtil.hashCode(b);
		System.out.println(hashCode);
		ByteBuf c = directBuffer(6);
		c.setBytes(0, new byte[] {'q','w','e','r','t','y'});
		int index = ByteBufUtil.indexOf(b, 2,5, (byte)'e');
		System.out.println(index);
		b.setIndex(0, 0);
		c.setIndex(0, 0);
//		boolean ifE = ByteBufUtil.equals(b, c);
//		System.out.println(ifE);
		int compare = ByteBufUtil.compare(b, c);
		System.out.println(compare);
		short x4 = ByteBufUtil.swapShort((short) 16);
		System.out.println(x4);
		int x5 = swapMedium(16);
		System.out.println(x5);
		int x6 = swapInt(16);
		System.out.println(x6);
		long x7 = swapLong((long) Math.pow(2, 34));
		System.out.println(x7);
		b.setIndex(0, 0);
//		ByteBufUtil.writeShortBE(b,(short) 34);
		b.setIndex(0, 0);
//		int y = ByteBufUtil.writeUtf8(b, "uiop");
		int rb = ByteBufUtil.writeAscii(b, "hiuo");
//		System.out.println(y);
		for(int i=0;i<b.capacity();i++) {
			System.out.println((char) b.getByte(i));
		}
		ByteBuf y1 = ByteBufUtil.threadLocalDirectBuffer();
		y1.setBytes(0, new byte[] {'m','n','o','p','q'});
		
		System.out.println(y1);
//		AbstractByteBufAllocator alloc = new AbstractByteBufAllocator(true);
		UnpooledByteBufAllocator alloc = new UnpooledByteBufAllocator(true);
		
		
		
		
		

	}

}
