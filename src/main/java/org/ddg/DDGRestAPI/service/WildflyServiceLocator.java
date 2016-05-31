package org.ddg.DDGRestAPI.service;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import io.katharsis.locator.JsonServiceLocator;

/**
 * <b>WildflyServiceLocator</b><br>
 * <p>
 * Beschreibung
 * </p>
 *
 * @author maurice (May 30, 2016)
 */
public class WildflyServiceLocator implements JsonServiceLocator {

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getInstance(Class<T> aClass) {
		BeanManager beanManager = CDI.current().getBeanManager();
		Bean<?> bean = beanManager.resolve(beanManager.getBeans(aClass));
		CreationalContext<?> creationalContext = beanManager.createCreationalContext(bean);

		return (T) beanManager.getReference(bean, aClass, creationalContext);
	}

}
