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
package org.openmrs.module.webservices.rest.web.v1_0.resource;

import org.openmrs.module.webservices.rest.web.v1_0.resource.EncounterResource;
import org.openmrs.Encounter;
import org.openmrs.api.context.Context;
import org.openmrs.module.webservices.rest.web.resource.impl.BaseDelegatingResourceTest;

public class EncounterResourceTest extends BaseDelegatingResourceTest<EncounterResource, Encounter> {
	
	@Override
	public Encounter newObject() {
		return Context.getEncounterService().getEncounterByUuid(getUuidProperty());
	}
	
	@Override
	public void validateDefaultRepresentation() throws Exception {
		super.validateDefaultRepresentation();
		assertPropEquals("encounterDatetime", getObject().getEncounterDatetime());
		assertPropPresent("patient");
		assertPropPresent("location");
		assertPropPresent("form");
		assertPropPresent("encounterType");
		assertPropPresent("provider");
		assertPropPresent("obs");
		assertPropPresent("orders");
		assertPropEquals("voided", getObject().getVoided());
	}
	
	@Override
	public void validateFullRepresentation() throws Exception {
		super.validateFullRepresentation();
		assertPropEquals("encounterDatetime", getObject().getEncounterDatetime());
		assertPropPresent("patient");
		assertPropPresent("location");
		assertPropPresent("form");
		assertPropPresent("encounterType");
		assertPropPresent("provider");
		assertPropPresent("obs");
		assertPropPresent("orders");
		assertPropEquals("voided", getObject().getVoided());
		assertPropPresent("auditInfo");
	}
	
	@Override
	public String getDisplayProperty() {
		return "Emergency 01/08/2008";
	}
	
	@Override
	public String getUuidProperty() {
		return ResourceTestConstants.ENCOUNTER_UUID;
	}
	
}
