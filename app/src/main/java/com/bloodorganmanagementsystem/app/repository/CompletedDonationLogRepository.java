 package com.bloodorganmanagementsystem.app.repository;

import com.bloodorganmanagementsystem.app.entities.CompletedDonationLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompletedDonationLogRepository extends CrudRepository<CompletedDonationLog, Integer> {

}