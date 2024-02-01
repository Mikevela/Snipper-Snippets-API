package com.example.SnippersnippetsAPI.repository;

import com.example.SnippersnippetsAPI.model.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnipperRepository extends JpaRepository<Snippet, Long>{
}
