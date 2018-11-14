package com.example.springBoot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 时间工具类
 * @author 于志强
 * 2018年11月14日 下午4:08:16
 */
public class DateUtil {
	static Logger log = Logger.getLogger(DateUtil.class);

	/**
	 * 类型转换
	 * 
	 * @param format 转换类型 如："yyy/MM/dd"
	 * @param obj
	 */
	public static String getFormatDate(String format, Object... objects) {
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
		} catch (Exception e) {
			log.error("getFormatDate类型转换失败：类型=" + format);
			return "error";
		}
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			if (object.equals("Flag")) { // 0 当前时间  
				return sdf.format(new Date());
			}
		}
		return "Untreated"; // 未处理
	}
	
//	public static void main(String[] args) {
//		System.out.println(getFormatDate("yyyy/MM/dd", "Flag"));
//	}
}
