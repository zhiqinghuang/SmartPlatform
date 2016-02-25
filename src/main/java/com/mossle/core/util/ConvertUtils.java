package com.mossle.core.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.converters.DateConverter;

public class ConvertUtils {
	static {
		registerDateConverter();
	}

	/** protected constructor. */
	protected ConvertUtils() {
	}

	@SuppressWarnings("unchecked")
	public static List convertElementPropertyToList(final Collection collection, final String propertyName) {
		List list = new ArrayList();
		try {
			for (Object obj : collection) {
				String methodName = ReflectUtils.getGetterMethodName(obj, propertyName);
				list.add(ReflectUtils.getMethodValue(obj, methodName));
			}
		} catch (NoSuchMethodException e) {
			throw ReflectUtils.convertReflectionExceptionToUnchecked(e);
		} catch (IllegalAccessException e) {
			throw ReflectUtils.convertReflectionExceptionToUnchecked(e);
		} catch (InvocationTargetException e) {
			throw ReflectUtils.convertReflectionExceptionToUnchecked(e);
		}

		return list;
	}

	public static String convertElementPropertyToString(final Collection collection, final String propertyName, final String separator) {
		List list = convertElementPropertyToList(collection, propertyName);
		return StringUtils.join(list, separator);
	}

	public static Object convertStringToObject(String value, Class<?> toType) {
		return org.apache.commons.beanutils.ConvertUtils.convert(value, toType);
	}

	private static void registerDateConverter() {
		DateConverter dc = new DateConverter();
		dc.setUseLocaleFormat(true);
		dc.setPatterns(new String[] { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss" });
		org.apache.commons.beanutils.ConvertUtils.register(dc, Date.class);
	}
}
//need to confirm