package com.madhu.eventmanagement.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.madhu.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
