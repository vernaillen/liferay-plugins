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

package com.liferay.so.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.so.model.FavoriteSite;
import com.liferay.so.model.FavoriteSiteModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FavoriteSite service. Represents a row in the &quot;SO_FavoriteSite&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FavoriteSiteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FavoriteSiteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FavoriteSiteImpl
 * @see FavoriteSite
 * @see FavoriteSiteModel
 * @generated
 */
@ProviderType
public class FavoriteSiteModelImpl extends BaseModelImpl<FavoriteSite>
	implements FavoriteSiteModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a favorite site model instance should use the {@link FavoriteSite} interface instead.
	 */
	public static final String TABLE_NAME = "SO_FavoriteSite";
	public static final Object[][] TABLE_COLUMNS = {
			{ "favoriteSiteId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("favoriteSiteId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table SO_FavoriteSite (favoriteSiteId LONG not null primary key,groupId LONG,companyId LONG,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table SO_FavoriteSite";
	public static final String ORDER_BY_JPQL = " ORDER BY favoriteSite.favoriteSiteId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SO_FavoriteSite.favoriteSiteId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.so.model.FavoriteSite"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.so.model.FavoriteSite"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.so.model.FavoriteSite"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long USERID_COLUMN_BITMASK = 2L;
	public static final long FAVORITESITEID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.so.model.FavoriteSite"));

	public FavoriteSiteModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _favoriteSiteId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFavoriteSiteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _favoriteSiteId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FavoriteSite.class;
	}

	@Override
	public String getModelClassName() {
		return FavoriteSite.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("favoriteSiteId", getFavoriteSiteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long favoriteSiteId = (Long)attributes.get("favoriteSiteId");

		if (favoriteSiteId != null) {
			setFavoriteSiteId(favoriteSiteId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getFavoriteSiteId() {
		return _favoriteSiteId;
	}

	@Override
	public void setFavoriteSiteId(long favoriteSiteId) {
		_favoriteSiteId = favoriteSiteId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			FavoriteSite.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FavoriteSite toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FavoriteSite)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FavoriteSiteImpl favoriteSiteImpl = new FavoriteSiteImpl();

		favoriteSiteImpl.setFavoriteSiteId(getFavoriteSiteId());
		favoriteSiteImpl.setGroupId(getGroupId());
		favoriteSiteImpl.setCompanyId(getCompanyId());
		favoriteSiteImpl.setUserId(getUserId());

		favoriteSiteImpl.resetOriginalValues();

		return favoriteSiteImpl;
	}

	@Override
	public int compareTo(FavoriteSite favoriteSite) {
		long primaryKey = favoriteSite.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavoriteSite)) {
			return false;
		}

		FavoriteSite favoriteSite = (FavoriteSite)obj;

		long primaryKey = favoriteSite.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		FavoriteSiteModelImpl favoriteSiteModelImpl = this;

		favoriteSiteModelImpl._originalGroupId = favoriteSiteModelImpl._groupId;

		favoriteSiteModelImpl._setOriginalGroupId = false;

		favoriteSiteModelImpl._originalUserId = favoriteSiteModelImpl._userId;

		favoriteSiteModelImpl._setOriginalUserId = false;

		favoriteSiteModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FavoriteSite> toCacheModel() {
		FavoriteSiteCacheModel favoriteSiteCacheModel = new FavoriteSiteCacheModel();

		favoriteSiteCacheModel.favoriteSiteId = getFavoriteSiteId();

		favoriteSiteCacheModel.groupId = getGroupId();

		favoriteSiteCacheModel.companyId = getCompanyId();

		favoriteSiteCacheModel.userId = getUserId();

		return favoriteSiteCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{favoriteSiteId=");
		sb.append(getFavoriteSiteId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.so.model.FavoriteSite");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>favoriteSiteId</column-name><column-value><![CDATA[");
		sb.append(getFavoriteSiteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FavoriteSite.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FavoriteSite.class
		};
	private long _favoriteSiteId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _columnBitmask;
	private FavoriteSite _escapedModel;
}