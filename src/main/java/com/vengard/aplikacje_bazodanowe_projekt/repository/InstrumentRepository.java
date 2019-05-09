package com.vengard.aplikacje_bazodanowe_projekt.repository;

import com.vengard.aplikacje_bazodanowe_projekt.dao.Instrument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends CrudRepository<Instrument, Long> {
}
