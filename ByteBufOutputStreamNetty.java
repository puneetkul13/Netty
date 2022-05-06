package Netty;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBuf;
import static io.netty.buffer.Unpooled.*;
import io.netty.buffer.ByteBufUtil;
import java.io.IOException;
public class ByteBufOutputStreamNetty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteBuf directBuffer = directBuffer(128);
		ByteBufOutputStream os = new ByteBufOutputStream(directBuffer);
//		os.write(new byte[] {'a','b','c','d'},1,2);
//		os.write(new byte[] {'a','b','c','d'});
//		os.write(89);
//		os.writeBoolean(true);
//		os.writeByte(10);
//		os.writeBytes("Punit");
//		os.writeChar(450);
//		os.writeChars("PunitAgarwal");
//		System.out.println(directBuffer.getChar(3)+"++++");
		directBuffer.setIndex(0, 0);
		os.writeDouble(34.45);
		os.writeFloat(24.42f);
		os.writeInt(78);
		os.writeLong((long) Math.pow(2, 34));
		os.writeShort(100);
		os.writeUTF("abczef");
		System.out.println(directBuffer.readDouble()+"||||");
		System.out.println(directBuffer.readFloat()+"||||");
		System.out.println(directBuffer.readInt()+"||||");
		System.out.println(directBuffer.readLong()+".....");
		System.out.println(directBuffer.readShort());
		
		System.out.println(os.writtenBytes());
		for(int i=0;i<directBuffer.capacity();i++) {
			System.out.println((char) directBuffer.getByte(i)+"----");
			
		}
		System.out.println(Math.pow(2, 34));
		System.out.println(directBuffer);
		System.out.println(os.buffer());
		System.out.println(directBuffer.equals(os.buffer()));
		os.close();
		System.out.println(directBuffer.readInt());
		os.write(70);
		System.out.println(directBuffer.readInt());
		

	}

}
