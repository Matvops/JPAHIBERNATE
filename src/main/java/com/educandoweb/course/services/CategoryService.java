package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
		
	public List<Category> getAll(){
		return repository.findAll();
	}
	
	public Category getById(Long id) {
		return repository.findById(id).get();
	}
}
