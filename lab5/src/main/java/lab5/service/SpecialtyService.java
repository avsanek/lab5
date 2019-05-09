package lab5.service;

import lab5.entity.Specialty;

public interface SpecialtyService extends Service<Specialty> {

    Specialty readByName(String name);

    Specialty readBycod_spec(String name);

}
