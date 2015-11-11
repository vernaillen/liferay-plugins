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

package com.liferay.knowledgebase.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ResourcedModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KBArticle service. Represents a row in the &quot;KBArticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.KBArticleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.KBArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBArticle
 * @see com.liferay.knowledgebase.model.impl.KBArticleImpl
 * @see com.liferay.knowledgebase.model.impl.KBArticleModelImpl
 * @generated
 */
@ProviderType
public interface KBArticleModel extends BaseModel<KBArticle>, ResourcedModel,
	ShardedModel, StagedGroupedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a k b article model instance should use the {@link KBArticle} interface instead.
	 */

	/**
	 * Returns the primary key of this k b article.
	 *
	 * @return the primary key of this k b article
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this k b article.
	 *
	 * @param primaryKey the primary key of this k b article
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this k b article.
	 *
	 * @return the uuid of this k b article
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this k b article.
	 *
	 * @param uuid the uuid of this k b article
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the kb article ID of this k b article.
	 *
	 * @return the kb article ID of this k b article
	 */
	public long getKbArticleId();

	/**
	 * Sets the kb article ID of this k b article.
	 *
	 * @param kbArticleId the kb article ID of this k b article
	 */
	public void setKbArticleId(long kbArticleId);

	/**
	 * Returns the resource prim key of this k b article.
	 *
	 * @return the resource prim key of this k b article
	 */
	@Override
	public long getResourcePrimKey();

	/**
	 * Sets the resource prim key of this k b article.
	 *
	 * @param resourcePrimKey the resource prim key of this k b article
	 */
	@Override
	public void setResourcePrimKey(long resourcePrimKey);

	@Override
	public boolean isResourceMain();

	/**
	 * Returns the group ID of this k b article.
	 *
	 * @return the group ID of this k b article
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this k b article.
	 *
	 * @param groupId the group ID of this k b article
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this k b article.
	 *
	 * @return the company ID of this k b article
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this k b article.
	 *
	 * @param companyId the company ID of this k b article
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this k b article.
	 *
	 * @return the user ID of this k b article
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this k b article.
	 *
	 * @param userId the user ID of this k b article
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this k b article.
	 *
	 * @return the user uuid of this k b article
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this k b article.
	 *
	 * @param userUuid the user uuid of this k b article
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this k b article.
	 *
	 * @return the user name of this k b article
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this k b article.
	 *
	 * @param userName the user name of this k b article
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this k b article.
	 *
	 * @return the create date of this k b article
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this k b article.
	 *
	 * @param createDate the create date of this k b article
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this k b article.
	 *
	 * @return the modified date of this k b article
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this k b article.
	 *
	 * @param modifiedDate the modified date of this k b article
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the root resource prim key of this k b article.
	 *
	 * @return the root resource prim key of this k b article
	 */
	public long getRootResourcePrimKey();

	/**
	 * Sets the root resource prim key of this k b article.
	 *
	 * @param rootResourcePrimKey the root resource prim key of this k b article
	 */
	public void setRootResourcePrimKey(long rootResourcePrimKey);

	/**
	 * Returns the parent resource class name ID of this k b article.
	 *
	 * @return the parent resource class name ID of this k b article
	 */
	public long getParentResourceClassNameId();

	/**
	 * Sets the parent resource class name ID of this k b article.
	 *
	 * @param parentResourceClassNameId the parent resource class name ID of this k b article
	 */
	public void setParentResourceClassNameId(long parentResourceClassNameId);

	/**
	 * Returns the parent resource prim key of this k b article.
	 *
	 * @return the parent resource prim key of this k b article
	 */
	public long getParentResourcePrimKey();

	/**
	 * Sets the parent resource prim key of this k b article.
	 *
	 * @param parentResourcePrimKey the parent resource prim key of this k b article
	 */
	public void setParentResourcePrimKey(long parentResourcePrimKey);

	/**
	 * Returns the kb folder ID of this k b article.
	 *
	 * @return the kb folder ID of this k b article
	 */
	public long getKbFolderId();

	/**
	 * Sets the kb folder ID of this k b article.
	 *
	 * @param kbFolderId the kb folder ID of this k b article
	 */
	public void setKbFolderId(long kbFolderId);

	/**
	 * Returns the version of this k b article.
	 *
	 * @return the version of this k b article
	 */
	public int getVersion();

	/**
	 * Sets the version of this k b article.
	 *
	 * @param version the version of this k b article
	 */
	public void setVersion(int version);

	/**
	 * Returns the title of this k b article.
	 *
	 * @return the title of this k b article
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this k b article.
	 *
	 * @param title the title of this k b article
	 */
	public void setTitle(String title);

	/**
	 * Returns the url title of this k b article.
	 *
	 * @return the url title of this k b article
	 */
	@AutoEscape
	public String getUrlTitle();

	/**
	 * Sets the url title of this k b article.
	 *
	 * @param urlTitle the url title of this k b article
	 */
	public void setUrlTitle(String urlTitle);

	/**
	 * Returns the content of this k b article.
	 *
	 * @return the content of this k b article
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this k b article.
	 *
	 * @param content the content of this k b article
	 */
	public void setContent(String content);

	/**
	 * Returns the description of this k b article.
	 *
	 * @return the description of this k b article
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this k b article.
	 *
	 * @param description the description of this k b article
	 */
	public void setDescription(String description);

	/**
	 * Returns the priority of this k b article.
	 *
	 * @return the priority of this k b article
	 */
	public double getPriority();

	/**
	 * Sets the priority of this k b article.
	 *
	 * @param priority the priority of this k b article
	 */
	public void setPriority(double priority);

	/**
	 * Returns the sections of this k b article.
	 *
	 * @return the sections of this k b article
	 */
	@AutoEscape
	public String getSections();

	/**
	 * Sets the sections of this k b article.
	 *
	 * @param sections the sections of this k b article
	 */
	public void setSections(String sections);

	/**
	 * Returns the view count of this k b article.
	 *
	 * @return the view count of this k b article
	 */
	public int getViewCount();

	/**
	 * Sets the view count of this k b article.
	 *
	 * @param viewCount the view count of this k b article
	 */
	public void setViewCount(int viewCount);

	/**
	 * Returns the latest of this k b article.
	 *
	 * @return the latest of this k b article
	 */
	public boolean getLatest();

	/**
	 * Returns <code>true</code> if this k b article is latest.
	 *
	 * @return <code>true</code> if this k b article is latest; <code>false</code> otherwise
	 */
	public boolean isLatest();

	/**
	 * Sets whether this k b article is latest.
	 *
	 * @param latest the latest of this k b article
	 */
	public void setLatest(boolean latest);

	/**
	 * Returns the main of this k b article.
	 *
	 * @return the main of this k b article
	 */
	public boolean getMain();

	/**
	 * Returns <code>true</code> if this k b article is main.
	 *
	 * @return <code>true</code> if this k b article is main; <code>false</code> otherwise
	 */
	public boolean isMain();

	/**
	 * Sets whether this k b article is main.
	 *
	 * @param main the main of this k b article
	 */
	public void setMain(boolean main);

	/**
	 * Returns the source u r l of this k b article.
	 *
	 * @return the source u r l of this k b article
	 */
	@AutoEscape
	public String getSourceURL();

	/**
	 * Sets the source u r l of this k b article.
	 *
	 * @param sourceURL the source u r l of this k b article
	 */
	public void setSourceURL(String sourceURL);

	/**
	 * Returns the last publish date of this k b article.
	 *
	 * @return the last publish date of this k b article
	 */
	@Override
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this k b article.
	 *
	 * @param lastPublishDate the last publish date of this k b article
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate);

	/**
	 * Returns the status of this k b article.
	 *
	 * @return the status of this k b article
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this k b article.
	 *
	 * @param status the status of this k b article
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this k b article.
	 *
	 * @return the status by user ID of this k b article
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this k b article.
	 *
	 * @param statusByUserId the status by user ID of this k b article
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this k b article.
	 *
	 * @return the status by user uuid of this k b article
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this k b article.
	 *
	 * @param statusByUserUuid the status by user uuid of this k b article
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this k b article.
	 *
	 * @return the status by user name of this k b article
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this k b article.
	 *
	 * @param statusByUserName the status by user name of this k b article
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this k b article.
	 *
	 * @return the status date of this k b article
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this k b article.
	 *
	 * @param statusDate the status date of this k b article
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Deprecated
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this k b article is approved.
	 *
	 * @return <code>true</code> if this k b article is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this k b article is denied.
	 *
	 * @return <code>true</code> if this k b article is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this k b article is a draft.
	 *
	 * @return <code>true</code> if this k b article is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this k b article is expired.
	 *
	 * @return <code>true</code> if this k b article is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this k b article is inactive.
	 *
	 * @return <code>true</code> if this k b article is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this k b article is incomplete.
	 *
	 * @return <code>true</code> if this k b article is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this k b article is pending.
	 *
	 * @return <code>true</code> if this k b article is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this k b article is scheduled.
	 *
	 * @return <code>true</code> if this k b article is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.knowledgebase.model.KBArticle kbArticle);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.knowledgebase.model.KBArticle> toCacheModel();

	@Override
	public com.liferay.knowledgebase.model.KBArticle toEscapedModel();

	@Override
	public com.liferay.knowledgebase.model.KBArticle toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}