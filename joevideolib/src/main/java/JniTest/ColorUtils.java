package JniTest;

/**
 * Created by 杨杰 on 2017/4/19.
 * 颜色格式转换的类
 */

public class ColorUtils {

	/**
	 * 加载所有相关链接库
	 */
	static {
		System.loadLibrary("colorutils");
	}

	public static native byte[] rgb2yuvfloat(byte[] rgbs, int size, int width, int height);
//	public static native byte[] rgb2yuvint(byte[] rgbs,int width,int height);
//	public static native byte[] rgb2yuvtlb(byte[] rgbs,int width,int height);
}
