package org.bimserver.database.actions;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.database.DatabaseSession;
import org.bimserver.database.OldQuery;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.WebModulePluginConfiguration;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;

public class ListWebModulesDatabaseAction extends BimDatabaseAction<List<WebModulePluginConfiguration>> {

	public ListWebModulesDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod) {
		super(databaseSession, accessMethod);
	}
	
	@Override
	public List<WebModulePluginConfiguration> execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException, ServerException {
		IfcModelInterface allOfType = getDatabaseSession().getAllOfType(StorePackage.eINSTANCE.getWebModulePluginConfiguration(), OldQuery.getDefault());
		return new ArrayList<>(allOfType.getAll(WebModulePluginConfiguration.class));
	}
}