package br.com.wilsoncf.repository;

import br.com.wilsoncf.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public class PersonRepository extends JpaRepository<Person,Long> {


}
