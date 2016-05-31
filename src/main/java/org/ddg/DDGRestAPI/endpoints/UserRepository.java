package org.ddg.DDGRestAPI.endpoints;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.ddg.DDGRestAPI.model.User;

import io.katharsis.queryParams.QueryParams;
import io.katharsis.repository.ResourceRepository;
import io.katharsis.resource.exception.ResourceNotFoundException;

/**
 * <b>UserRepository</b><br>
 * <p>
 * Beschreibung
 * </p>
 *
 * @author maurice (May 30, 2016)
 */
public class UserRepository implements ResourceRepository<User, String> {

	private Set<User> users = new LinkedHashSet<>();

	/**
	 *
	 */
	public UserRepository() {
	}

	@Override
	public synchronized User findOne(String id, QueryParams requestParams) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(() -> new ResourceNotFoundException("users/" + id));
	}

	@Override
	public synchronized Iterable<User> findAll(QueryParams requestParams) {
		return users.stream().filter(u -> StreamSupport.stream(null, false).filter(id -> u.getId().equals(id)).findFirst().isPresent()).collect(Collectors.toList());
	}

	@Override
	public synchronized Iterable<User> findAll(Iterable<String> ids, QueryParams requestParams) {
		return users.stream().filter(u -> StreamSupport.stream(ids.spliterator(), false).filter(id -> u.getId().equals(id)).findFirst().isPresent()).collect(Collectors.toList());
	}

	@Override
	public synchronized void delete(String id) {
		Iterator<User> usersIterator = users.iterator();

		while (usersIterator.hasNext()) {
			if (usersIterator.next().getId().equals(id)) {
				usersIterator.remove();
			}
		}
	}

	@Override
	public synchronized <S extends User> S save(S user) {
		if (user.getId() == null) {
			user.setId(UUID.randomUUID().toString());
		}
		users.add(user);
		return user;
	}

}
