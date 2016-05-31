/**
 * © 2016 Deutsches Dienstleistungszentrum für das Gesundheitswesen GmbH
 */
package org.ddg.DDGRestAPI.service;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;

/**
 * <b>RequestFilter</b><br>
 * <p>
 * Beschreibung
 * </p>
 *
 * @author maurice (May 31, 2016)
 */
@PreMatching
public class RequestFilter implements ContainerRequestFilter {

	/**
	 * RequestFilter
	 */
	public RequestFilter() {

	}

	/*
	 * (non-Javadoc)
	 * @see javax.ws.rs.container.ContainerRequestFilter#filter(javax.ws.rs.container.ContainerRequestContext)
	 */
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

	}

}
