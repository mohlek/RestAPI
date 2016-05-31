package org.ddg.DDGRestAPI.service;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.katharsis.queryParams.DefaultQueryParamsParser;
import io.katharsis.queryParams.QueryParamsBuilder;
import io.katharsis.rs.KatharsisProperties;

@SuppressWarnings("javadoc")
@Provider
public class KatharsisFeature implements Feature {

	public static final String	APPLICATION_URL	= "http://localhost:8080/DDGRestAPI";
	public static final String	PREFIX			= "";

	@Override
	public boolean configure(FeatureContext featureContext) {
		featureContext.property(KatharsisProperties.RESOURCE_SEARCH_PACKAGE, "org.ddg.DDGRestAPI").property(KatharsisProperties.RESOURCE_DEFAULT_DOMAIN, APPLICATION_URL).property(KatharsisProperties.WEB_PATH_PREFIX, PREFIX).register(new io.katharsis.rs.KatharsisFeature(new ObjectMapper(), new QueryParamsBuilder(new DefaultQueryParamsParser()), new WildflyServiceLocator()));

		return true;
	}
}
