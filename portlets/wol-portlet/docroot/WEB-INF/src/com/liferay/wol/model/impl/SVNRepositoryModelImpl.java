/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wol.model.impl;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.model.impl.ExpandoBridgeImpl;

import com.liferay.wol.model.SVNRepository;
import com.liferay.wol.model.SVNRepositorySoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="SVNRepositoryModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class SVNRepositoryModelImpl extends BaseModelImpl {
	public static final String TABLE_NAME = "WOL_SVNRepository";
	public static final Object[][] TABLE_COLUMNS = {
			{ "svnRepositoryId", new Integer(Types.BIGINT) },
			

			{ "url", new Integer(Types.VARCHAR) },
			

			{ "revisionNumber", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table WOL_SVNRepository (svnRepositoryId LONG not null primary key,url VARCHAR(200) null,revisionNumber LONG)";
	public static final String TABLE_SQL_DROP = "drop table WOL_SVNRepository";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.wol.model.SVNRepository"),
			true);

	public static SVNRepository toModel(SVNRepositorySoap soapModel) {
		SVNRepository model = new SVNRepositoryImpl();

		model.setSvnRepositoryId(soapModel.getSvnRepositoryId());
		model.setUrl(soapModel.getUrl());
		model.setRevisionNumber(soapModel.getRevisionNumber());

		return model;
	}

	public static List<SVNRepository> toModels(SVNRepositorySoap[] soapModels) {
		List<SVNRepository> models = new ArrayList<SVNRepository>(soapModels.length);

		for (SVNRepositorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.wol.model.SVNRepository"));

	public SVNRepositoryModelImpl() {
	}

	public long getPrimaryKey() {
		return _svnRepositoryId;
	}

	public void setPrimaryKey(long pk) {
		setSvnRepositoryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_svnRepositoryId);
	}

	public long getSvnRepositoryId() {
		return _svnRepositoryId;
	}

	public void setSvnRepositoryId(long svnRepositoryId) {
		if (svnRepositoryId != _svnRepositoryId) {
			_svnRepositoryId = svnRepositoryId;
		}
	}

	public String getUrl() {
		return GetterUtil.getString(_url);
	}

	public void setUrl(String url) {
		if (((url == null) && (_url != null)) ||
				((url != null) && (_url == null)) ||
				((url != null) && (_url != null) && !url.equals(_url))) {
			_url = url;
		}
	}

	public long getRevisionNumber() {
		return _revisionNumber;
	}

	public void setRevisionNumber(long revisionNumber) {
		if (revisionNumber != _revisionNumber) {
			_revisionNumber = revisionNumber;
		}
	}

	public SVNRepository toEscapedModel() {
		if (isEscapedModel()) {
			return (SVNRepository)this;
		}
		else {
			SVNRepository model = new SVNRepositoryImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setSvnRepositoryId(getSvnRepositoryId());
			model.setUrl(HtmlUtil.escape(getUrl()));
			model.setRevisionNumber(getRevisionNumber());

			model = (SVNRepository)Proxy.newProxyInstance(SVNRepository.class.getClassLoader(),
					new Class[] { SVNRepository.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = new ExpandoBridgeImpl(SVNRepository.class.getName(),
					getPrimaryKey());
		}

		return _expandoBridge;
	}

	public Object clone() {
		SVNRepositoryImpl clone = new SVNRepositoryImpl();

		clone.setSvnRepositoryId(getSvnRepositoryId());
		clone.setUrl(getUrl());
		clone.setRevisionNumber(getRevisionNumber());

		return clone;
	}

	public int compareTo(Object obj) {
		if (obj == null) {
			return -1;
		}

		SVNRepositoryImpl svnRepository = (SVNRepositoryImpl)obj;

		int value = 0;

		value = getUrl().compareTo(svnRepository.getUrl());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SVNRepositoryImpl svnRepository = null;

		try {
			svnRepository = (SVNRepositoryImpl)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = svnRepository.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	private long _svnRepositoryId;
	private String _url;
	private long _revisionNumber;
	private transient ExpandoBridge _expandoBridge;
}