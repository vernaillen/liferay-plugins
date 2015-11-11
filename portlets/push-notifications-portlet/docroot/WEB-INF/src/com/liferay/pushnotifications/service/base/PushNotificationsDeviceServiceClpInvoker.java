/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.pushnotifications.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.pushnotifications.service.PushNotificationsDeviceServiceUtil;

import java.util.Arrays;

/**
 * @author Bruno Farache
 * @generated
 */
@ProviderType
public class PushNotificationsDeviceServiceClpInvoker {
	public PushNotificationsDeviceServiceClpInvoker() {
		_methodName24 = "getOSGiServiceIdentifier";

		_methodParameterTypes24 = new String[] {  };

		_methodName29 = "addPushNotificationsDevice";

		_methodParameterTypes29 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName30 = "deletePushNotificationsDevice";

		_methodParameterTypes30 = new String[] { "java.lang.String" };

		_methodName31 = "sendPushNotification";

		_methodParameterTypes31 = new String[] { "long[][]", "java.lang.String" };

		_methodName32 = "sendPushNotification";

		_methodParameterTypes32 = new String[] {
				"java.lang.String", "java.util.List", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return PushNotificationsDeviceServiceUtil.getOSGiServiceIdentifier();
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return PushNotificationsDeviceServiceUtil.addPushNotificationsDevice((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return PushNotificationsDeviceServiceUtil.deletePushNotificationsDevice((java.lang.String)arguments[0]);
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			PushNotificationsDeviceServiceUtil.sendPushNotification((long[])arguments[0],
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			PushNotificationsDeviceServiceUtil.sendPushNotification((java.lang.String)arguments[0],
				(java.util.List<java.lang.String>)arguments[1],
				(java.lang.String)arguments[2]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
}