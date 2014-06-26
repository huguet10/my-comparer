/**
 *
 * Copyright (C) FACTORIA ETSIA S.L.
 * All Rights Reserved.
 * www.factoriaetsia.com
 *
 */
package com.comparadorad.bet.comparer.synchro.reader.processbookmaker.exception;

/**
 * The Class BetTypeEventNotFoundException.
 */
@SuppressWarnings("serial")
public class XmlTournamentNotFoundException extends RuntimeException {

	/**
	 * Instantiates a new bet type event not found exception.
	 * 
	 * @param message
	 *            the message
	 */
	public XmlTournamentNotFoundException(String message) {
		super(message);
	}

}