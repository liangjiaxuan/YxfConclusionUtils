/**
 * 上午10:50:56
 */
package com.rongwei.yxfconclusionutils.netstate;

/**
 * @author lizhenya
 *
 * @类描述：网络状态的枚举
 */
public enum ConnectivityType {
	OFFLINE(1), MOBILE(2), WIFI(3), UNKNOWN(4);
	/**
	 * @方法描述： 构造方法
	 */
	ConnectivityType(int type) {
		this.mType = type;
	}

	public int mType;
}
