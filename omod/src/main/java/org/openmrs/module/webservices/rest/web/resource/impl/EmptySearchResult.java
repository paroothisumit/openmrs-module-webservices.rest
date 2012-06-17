/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web.resource.impl;

import java.util.Collections;

import org.openmrs.module.webservices.rest.SimpleObject;
import org.openmrs.module.webservices.rest.web.resource.api.PageableResult;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

/**
 * Empty list of search results
 */
public class EmptySearchResult implements PageableResult {
	
	/**
	 * @see org.openmrs.module.webservices.rest.web.resource.api.SearchResult#toSimpleObject()
	 */
	@Override
	public SimpleObject toSimpleObject() throws ResponseException {
		return new SimpleObject().add("results", Collections.emptyList());
	}
	
}
