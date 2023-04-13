package dao_exo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO implements DAO<User> {

	private List<User> users = new ArrayList<>();
	
	@Override
	public Optional<User> get(long id) {
		return users != null ? Optional.ofNullable(users.get((int) id)):null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void save(User t) {
		users.add(t);
	}

	@Override
	public void update(User t, String[] params) {
		t.setNom(params[0]);
		t.setPrenom(params[1]);
	}

	@Override
	public void delete(User t) {
		users.remove(t);
	}

}
