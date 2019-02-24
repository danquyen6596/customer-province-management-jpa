package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.codegym.model.Province;
import vn.codegym.repository.ProvinceRepository;
import vn.codegym.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
