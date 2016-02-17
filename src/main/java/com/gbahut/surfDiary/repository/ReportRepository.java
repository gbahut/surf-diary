package com.gbahut.surfDiary.repository;

import com.gbahut.surfDiary.data.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReportRepository extends JpaRepository<Report, Long>
{

}
