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

package com.liferay.kb.knowledgebase.service.base;

import com.liferay.kb.knowledgebase.model.KBFeedbackEntry;
import com.liferay.kb.knowledgebase.service.KBArticleLocalService;
import com.liferay.kb.knowledgebase.service.KBArticleResourceLocalService;
import com.liferay.kb.knowledgebase.service.KBArticleService;
import com.liferay.kb.knowledgebase.service.KBFeedbackEntryLocalService;
import com.liferay.kb.knowledgebase.service.KBFeedbackStatsLocalService;
import com.liferay.kb.knowledgebase.service.persistence.KBArticleFinder;
import com.liferay.kb.knowledgebase.service.persistence.KBArticlePersistence;
import com.liferay.kb.knowledgebase.service.persistence.KBArticleResourcePersistence;
import com.liferay.kb.knowledgebase.service.persistence.KBFeedbackEntryPersistence;
import com.liferay.kb.knowledgebase.service.persistence.KBFeedbackStatsPersistence;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;

import java.util.List;

/**
 * <a href="KBFeedbackEntryLocalServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Jorge Ferrer
 *
 */
public abstract class KBFeedbackEntryLocalServiceBaseImpl
	implements KBFeedbackEntryLocalService {
	public KBFeedbackEntry addKBFeedbackEntry(KBFeedbackEntry kbFeedbackEntry)
		throws SystemException {
		kbFeedbackEntry.setNew(true);

		return kbFeedbackEntryPersistence.update(kbFeedbackEntry, false);
	}

	public KBFeedbackEntry createKBFeedbackEntry(long feedbackEntryId) {
		return kbFeedbackEntryPersistence.create(feedbackEntryId);
	}

	public void deleteKBFeedbackEntry(long feedbackEntryId)
		throws PortalException, SystemException {
		kbFeedbackEntryPersistence.remove(feedbackEntryId);
	}

	public void deleteKBFeedbackEntry(KBFeedbackEntry kbFeedbackEntry)
		throws SystemException {
		kbFeedbackEntryPersistence.remove(kbFeedbackEntry);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return kbFeedbackEntryPersistence.findWithDynamicQuery(dynamicQuery);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) throws SystemException {
		return kbFeedbackEntryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	public KBFeedbackEntry getKBFeedbackEntry(long feedbackEntryId)
		throws PortalException, SystemException {
		return kbFeedbackEntryPersistence.findByPrimaryKey(feedbackEntryId);
	}

	public List<KBFeedbackEntry> getKBFeedbackEntries(int start, int end)
		throws SystemException {
		return kbFeedbackEntryPersistence.findAll(start, end);
	}

	public int getKBFeedbackEntriesCount() throws SystemException {
		return kbFeedbackEntryPersistence.countAll();
	}

	public KBFeedbackEntry updateKBFeedbackEntry(
		KBFeedbackEntry kbFeedbackEntry) throws SystemException {
		kbFeedbackEntry.setNew(false);

		return kbFeedbackEntryPersistence.update(kbFeedbackEntry, true);
	}

	public KBArticleLocalService getKBArticleLocalService() {
		return kbArticleLocalService;
	}

	public void setKBArticleLocalService(
		KBArticleLocalService kbArticleLocalService) {
		this.kbArticleLocalService = kbArticleLocalService;
	}

	public KBArticleService getKBArticleService() {
		return kbArticleService;
	}

	public void setKBArticleService(KBArticleService kbArticleService) {
		this.kbArticleService = kbArticleService;
	}

	public KBArticlePersistence getKBArticlePersistence() {
		return kbArticlePersistence;
	}

	public void setKBArticlePersistence(
		KBArticlePersistence kbArticlePersistence) {
		this.kbArticlePersistence = kbArticlePersistence;
	}

	public KBArticleFinder getKBArticleFinder() {
		return kbArticleFinder;
	}

	public void setKBArticleFinder(KBArticleFinder kbArticleFinder) {
		this.kbArticleFinder = kbArticleFinder;
	}

	public KBArticleResourceLocalService getKBArticleResourceLocalService() {
		return kbArticleResourceLocalService;
	}

	public void setKBArticleResourceLocalService(
		KBArticleResourceLocalService kbArticleResourceLocalService) {
		this.kbArticleResourceLocalService = kbArticleResourceLocalService;
	}

	public KBArticleResourcePersistence getKBArticleResourcePersistence() {
		return kbArticleResourcePersistence;
	}

	public void setKBArticleResourcePersistence(
		KBArticleResourcePersistence kbArticleResourcePersistence) {
		this.kbArticleResourcePersistence = kbArticleResourcePersistence;
	}

	public KBFeedbackEntryLocalService getKBFeedbackEntryLocalService() {
		return kbFeedbackEntryLocalService;
	}

	public void setKBFeedbackEntryLocalService(
		KBFeedbackEntryLocalService kbFeedbackEntryLocalService) {
		this.kbFeedbackEntryLocalService = kbFeedbackEntryLocalService;
	}

	public KBFeedbackEntryPersistence getKBFeedbackEntryPersistence() {
		return kbFeedbackEntryPersistence;
	}

	public void setKBFeedbackEntryPersistence(
		KBFeedbackEntryPersistence kbFeedbackEntryPersistence) {
		this.kbFeedbackEntryPersistence = kbFeedbackEntryPersistence;
	}

	public KBFeedbackStatsLocalService getKBFeedbackStatsLocalService() {
		return kbFeedbackStatsLocalService;
	}

	public void setKBFeedbackStatsLocalService(
		KBFeedbackStatsLocalService kbFeedbackStatsLocalService) {
		this.kbFeedbackStatsLocalService = kbFeedbackStatsLocalService;
	}

	public KBFeedbackStatsPersistence getKBFeedbackStatsPersistence() {
		return kbFeedbackStatsPersistence;
	}

	public void setKBFeedbackStatsPersistence(
		KBFeedbackStatsPersistence kbFeedbackStatsPersistence) {
		this.kbFeedbackStatsPersistence = kbFeedbackStatsPersistence;
	}

	@BeanReference(name = "com.liferay.kb.knowledgebase.service.KBArticleLocalService.impl")
	protected KBArticleLocalService kbArticleLocalService;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.KBArticleService.impl")
	protected KBArticleService kbArticleService;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.persistence.KBArticlePersistence.impl")
	protected KBArticlePersistence kbArticlePersistence;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.persistence.KBArticleFinder.impl")
	protected KBArticleFinder kbArticleFinder;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.KBArticleResourceLocalService.impl")
	protected KBArticleResourceLocalService kbArticleResourceLocalService;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.persistence.KBArticleResourcePersistence.impl")
	protected KBArticleResourcePersistence kbArticleResourcePersistence;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.KBFeedbackEntryLocalService.impl")
	protected KBFeedbackEntryLocalService kbFeedbackEntryLocalService;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.persistence.KBFeedbackEntryPersistence.impl")
	protected KBFeedbackEntryPersistence kbFeedbackEntryPersistence;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.KBFeedbackStatsLocalService.impl")
	protected KBFeedbackStatsLocalService kbFeedbackStatsLocalService;
	@BeanReference(name = "com.liferay.kb.knowledgebase.service.persistence.KBFeedbackStatsPersistence.impl")
	protected KBFeedbackStatsPersistence kbFeedbackStatsPersistence;
}