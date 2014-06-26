/**
 *
 * Copyright (C) FACTORIA ETSIA S.L.
 * All Rights Reserved.
 * www.factoriaetsia.com
 *
 */
package com.comparadorad.bet.comparer.model.securebet.service;

import org.junit.Test;

import com.comparadorad.bet.comparer.model.core.service.IGenericCrudService;
import com.comparadorad.bet.comparer.model.securebet.permission.service.AbstractTest;

/**
 * The Class AbstractServiceTest.
 * 
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 */

public abstract class AbstractServiceTest<T> extends AbstractTest {
	/**
	 * Gets the dao.
	 * 
	 * @return the dao
	 */
	protected abstract IGenericCrudService<T> getIGenericService();

	/**
	 * Test find all.
	 */
	@Test
	public void testFindAll() {
		System.out.println("findAll");
		Iterable<T> sportTypes = getIGenericService().findAll();
		for (T sportType : sportTypes) {
			System.out.println("sportType: " + sportType.toString());
		}
	}
}