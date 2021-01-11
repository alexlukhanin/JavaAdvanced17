package org.alex.hw17.service.impl;

import org.alex.hw17.dao.UniversityRepository;
import org.alex.hw17.domain.University;
import org.alex.hw17.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public University save(University university) {
        return universityRepository.saveAndFlush(university);
    }

    @Override
    public University findById(Long id) {
        return universityRepository.getOne(id);
    }

    @Override
    public University update(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(Long id) {

        universityRepository.deleteById(id);

    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public List<University> findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public List<University> findByAccreditationLevel(String accreditationLevel) {
        return universityRepository.findByAccreditationLevel(accreditationLevel);
    }

    @Override
    public List<University> findByInstitutesNumber(Integer institutesNumber) {
        return universityRepository.findByInstitutesNumber(institutesNumber);
    }

    @Override
    public List<University> findByStudentsNumber(Integer studentsNumber) {
        return universityRepository.findByStudentsNumber(studentsNumber);
    }

    @Override
    public List<University> findByStudentsNumberGreaterThan(Integer studentsNumber) {
        return universityRepository.findByStudentsNumberGreaterThan(studentsNumber);
    }
}
