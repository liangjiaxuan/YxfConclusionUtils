package com.rongwei.yxfconclusionutils.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.ImageColumns;

import java.io.File;

public class SDcardUtils {

	/**
	 *	判断是否有sd卡
	 * 
	 * @return
	 */
	public static boolean hasSdcard() {
		String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			return true;
		} else {
			return false;
		}
	}

	public static String createFileDir(Context context) {
		String filePath;
		String dirName = "xxxxxxxxxxxx";

		if (hasSdcard()) {

			filePath = Environment.getExternalStorageDirectory()
					+ File.separator + dirName;
		} else {
			filePath = context.getCacheDir().getPath() + File.separator
					+ dirName;
		}
		File destDir = new File(filePath);
		if (!destDir.exists()) {
			destDir.mkdirs();
		}
		return filePath;
	}

	/**
	 * uri 获取其在文件系统的路径
	 * 
	 * @param context
	 * @param uri
	 * @return
	 */
	public static String getRealFilePath(final Context context, final Uri uri) {
		if (null == uri)
			return null;
		final String scheme = uri.getScheme();
		String data = null;
		if (scheme == null)
			data = uri.getPath();
		else if (ContentResolver.SCHEME_FILE.equals(scheme)) {
			data = uri.getPath();
		} else if (ContentResolver.SCHEME_CONTENT.equals(scheme)) {
			Cursor cursor = context.getContentResolver().query(uri,
					new String[] { ImageColumns.DATA }, null, null, null);
			if (null != cursor) {
				if (cursor.moveToFirst()) {
					int index = cursor.getColumnIndex(ImageColumns.DATA);
					if (index > -1) {
						data = cursor.getString(index);
					}
				}
				cursor.close();
			}
		}
		return data;
	}

}
