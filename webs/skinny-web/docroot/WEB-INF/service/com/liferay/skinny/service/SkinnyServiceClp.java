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

package com.liferay.skinny.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.InvokableService;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SkinnyServiceClp implements SkinnyService {
	public SkinnyServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName1 = "getOSGiServiceIdentifier";

		_methodParameterTypes1 = new String[] {  };

		_methodName2 = "getSkinnyDDLRecords";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "getSkinnyJournalArticles";

		_methodParameterTypes3 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String"
			};
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.skinny.model.SkinnyDDLRecord> getSkinnyDDLRecords(
		long ddlRecordSetId) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { ddlRecordSetId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.skinny.model.SkinnyDDLRecord>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.skinny.model.SkinnyJournalArticle> getSkinnyJournalArticles(
		long companyId, java.lang.String groupName, long ddmStructureId,
		java.lang.String locale) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						companyId,
						
					ClpSerializer.translateInput(groupName),
						
					ddmStructureId,
						
					ClpSerializer.translateInput(locale)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.skinny.model.SkinnyJournalArticle>)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableService _invokableService;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
}