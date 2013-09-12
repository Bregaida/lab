package wifi.dao;

import org.springframework.transaction.annotation.Transactional;

import wifi.data.Curso;

@Transactional
public interface CursoDAO extends DAO<Curso> {

}
