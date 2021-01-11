package org.alex.hw17.dao;

import org.alex.hw17.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long>, JpaRepository<University, Long> {

    List<University> findByName(String name);

    List<University> findByAccreditationLevel(String accreditationLevel);

    List<University> findByInstitutesNumber(Integer institutesNumber);

    List<University> findByStudentsNumber(Integer studentsNumber);

    List<University> findByStudentsNumberGreaterThan(Integer studentsNumber);



}
