package com.collaborativeeducation.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.collaborativeeducation.pojo.Category;
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}


